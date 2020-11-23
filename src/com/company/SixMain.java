package com.company;

import java.util.Scanner;

/**
 * 运用你所学的数据结构，设计和实现一个 LRU 缓存机制，他应该改支持一下操作：
 * 获取数据 get 和写入数据 put
 * 获取数据 get（key） - 如果密钥（key）存在于缓存中，则获取密钥的值（总是正数），否则返回 -1
 * 写入数据 put( key，value) - 如果密钥不存在，则写入其数据值，当缓存容量达到上线时，
 * 他应该在写入新数据之前减少最近最少使用的数据值，从而为新的 数据值流出空间
 * 进阶：可以一在 O（1）时间复杂度内完成这两种操作么？
 */
public class SixMain {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个储存容量");
        SixLru sixLru = new SixLru(scanner.nextInt());
        sixLru.put(1, 1);
        sixLru.get(1);
        sixLru.put(2, 2);
        sixLru.get(1);
        sixLru.put(3, 3);
    }

}
