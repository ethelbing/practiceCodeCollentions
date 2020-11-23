package com.aliyun.edu;

public class Hello {
    public static void main(String arg[]) {
        // 任何证书其默认类型都是int， 但是该数据一讲操作了int保存的范围，
        // 那么现在就需要将这个数据明确的表示是一个long 型的常量
        long num = 2147483648L; // “L” 或 “l" 都可以
        System.out.println(11 + 1l); //注意是 1 和小写的 "l";
//        在强制的时候设置其目标类型，这种操作有可能会丢失精度
        int result = (int) num; //大的类型变为小的类型，只能强制转换
        System.out.println(result);
    }
}
