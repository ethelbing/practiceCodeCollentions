package com.company;


import java.util.Scanner;

/**
 * 大数相加不能直接使用基本的int类型，因为int可以表示的整数有限，不能满足大数的要求。可以使用字符串来表示大数，模拟大数相加的过程。
 * <p>
 * 思路：
 * 1.反转两个字符串，便于从低位到高位相加和最高位的进位导致和的位数增加；
 * 2.对齐两个字符串，即短字符串的高位用‘0’补齐，便于后面的相加；
 * 3.把两个正整数相加，一位一位的加并加上进位。
 * <p>
 * 1、把定位到变量的位置，idea会自动为你高亮所有相同变量
 * 2、按下快捷键：Shift+F6
 * 3、然后就尽情的修改吧
 */
public class Seven {
    public static String add(String n1, String n2) {
        StringBuilder result = new StringBuilder();

        // 反转字符串
        String rn1 = new StringBuilder(n1).reverse().toString();
        String rn2 = new StringBuilder(n2).reverse().toString();

        int len1 = rn1.length();
        int len2 = rn2.length();

        int maxLen = len1 > len2 ? len1 : len2;

        boolean nOverFlow = false;// 是否越界
        int nTakeOver = 0;// 溢出数量

        // 把两个字符串补齐，即短字符串的高位用0补齐
        if (len1 < len2) {
            for (int i = len1; i < len2; i++) {
                rn1 += "0";
            }
        } else {
            for (int i = len2; i < len1; i++) {
                rn2 += "0";
            }
        }

        // 把两个正整数相加，一位一位的加 并加上进位
        for (int i = 0; i < maxLen; i++) {
            int nSum = Integer.parseInt(rn1.charAt(i) + "") + Integer.parseInt(rn2.charAt(i) + "");
            nSum = nSum + nTakeOver;// 加上前一位的进位

            if (nSum >= 10) {
                if (i == maxLen - 1) {// 已经计算到最后一位了
                    nOverFlow = true;
                }

                nTakeOver = 1;//溢出了
                result.append(nSum - 10);
            } else {
                nTakeOver = 0;// 没溢出
                result.append(nSum);
            }
        }

        // 如果溢出的话 表示位增加了
        if (nOverFlow) {
            result.append(nTakeOver);
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
//        String n1 = "999999999";
//        String n2 = "999999999";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个高位整数：");
        String n1 = sc.next();
        System.out.println("请输入第二个高位整数：");
        String n2 = sc.next();
        System.out.println(Seven.add(n1, n2));
    }
}

