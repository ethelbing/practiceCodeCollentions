package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * question: 写一个字符串归一化层序，统计字符创中相同字符串出现的次数，并按照字典序输出字符及出现次数，
 * 如字符串 “babcc” 归一化后 “a1b2c2"
 * <p>
 * BufferedReader 是缓冲字符输入流。它继承于Reader。
 * BufferedReader 的作用是为其他字符输入流添加一些缓冲功能。
 * https://www.cnblogs.com/skywang12345/p/io_23.html
 */


public class Second {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim(); //删除首尾空格
        StringBuffer st = new StringBuffer();
        int[] a = new int[26];
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            a[arr[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] != 0) {
                st.append((char) (i + 'a'));
                st.append(a[i]);
            }
        }
        System.out.println(st);
        //toCharArray是将String对象的每一个下标位的对象保存在char[]中。
        //比如：String a = "abcd"; char[] b = a.toCharArray(); 这个b保存的信息就是['a','b','c','d']。
        // a[对应字母ASCII - 'a' ]作为下标数，每出现一次 加以存入a[]数组中+1
        /*StringBuffer buf=new StringBuffer("Hard ");
                String aString = "Waxworks";
                buf.append(aString,3,4);
                说明：这个操作表示aString的索引位置从3开始的找4个字符追加到StringBuffer对象buf中。
                然后buf对象就会包含字符 串"Hard work"。*/
    }
}
