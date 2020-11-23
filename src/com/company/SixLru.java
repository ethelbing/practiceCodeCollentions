package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 实现LRU(最近最少使用)缓存机制
 * * Your LRUCache object will be instantiated and called as such:
 * * LRUCache obj = new LRUCache(capacity);
 * * int param_1 = obj.get(key);
 * * obj.put(key,value)
 * ————————————————
 * 版权声明：本文为CSDN博主「Double=Eggs」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/liweizhong193516/article/details/81316452
 **/

public class SixLru {
    Map<Integer, Integer> map;
    Stack<Integer> stack;
    int size;

    public SixLru(int capacity) {
        stack = new Stack<>();
        map = new HashMap<>(capacity);
        size = capacity;
    }

    public int get(int key) {
        if (!stack.contains(key)) {
            return -1;
        }
        boolean flag = stack.remove(Integer.valueOf(key));
        stack.push(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (stack.contains(key)) {
            stack.remove(Integer.valueOf(key));
        } else {
            if (stack.size() == size) {
                int count = stack.remove(0);
                map.remove(count);
            }
        }
        stack.push(key);
        map.put(key, value);
    }
}

