package com.company;

/**
 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 输出控制台
 */
public class Three {
    //    public static void main(String[] args) {
//        int i = 0;//保存到百位上的数字
//        int j = 0;//保存到十位上的数字
//        int k = 0;//保存到个位上的数字
//        int t = 0;//保存数字的个数
//        for(i = 1; i <= 4; i++) {
//            for(j = 1; j <= 4; j++) {
//                for(k = 1; k <= 4; k++) {
//                    if(i != j&& j != k && i!= k) {
//                        t += 1;
//                        System.out.println(i*100 + j*10 + k);
//                    }
//                }
//            }
//        }
//        System.out.println("总共能够组成" + t + "个数字！");
//    }
    public static void main(String[] args) {
        int strlen = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && j != k && i != k) {
                        strlen += 1;
                        System.out.println(i * 100 + j * 10 + k);
                    }
                }
            }
        }
        System.out.println("一共可以组成" + strlen + "个数组");
    }
}
