package com.company;
/**
 * 问题：对于一个长度为 N 的整数序列，你需要检查这个序列是否可以递减序列
 * 你需要检查这个序列是否可以是非递减序列，假如你最多可以改变其中的一个数。
 * compareTo()
 * Integer x = 5;
 * 如果指定的数大于参数返回 1。System.out.println(x.compareTo(3));
 * 如果指定的数与参数相等返回0。System.out.println(x.compareTo(5));
 * 如果指定的数小于参数返回 -1。System.out.println(x.compareTo(8));
 * <p>
 * scanner()
 *
 * @param arg
 */

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        int[] a = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            a[i] = Integer.valueOf(strings[i]);
        }
        int num = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                num++;
        }
        if (num < 2)
            System.out.println(1);
        else System.out.println(0);
    }

}
