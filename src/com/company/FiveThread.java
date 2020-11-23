package com.company;

/**
 * 两个线程交互式输出 1,2,3,4...
 */
public class FiveThread {
    public static class Thread1 extends Thread {
        //定义锁对象，负责接收传入对象
        private final Object lock1;

        //定义共有构造方法
        public Thread1(Object lock) {
            // TODO Auto-generated constructor stub
            this.lock1 = lock;
        }

        @Override
        public void run() {
            String[] string = {"1", "3"};
            funForThread(string, lock1);
        }
    }

    public static class Thread2 extends Thread {
        //定义锁对象，负责接收传入对象
        private final Object lock2;
        //定义共有构造方法

        public Thread2(Object lock) {
            this.lock2 = lock;
        }

        @Override
        public void run() {
            String[] string = {"2", "4",};
            funForThread(string, lock2);
        }
    }

    private static void funForThread(String[] strs, Object lock) {
        commonFun(strs, lock);
    }

    private static void commonFun(String[] strs, Object lock) {
        for (String s : strs) {
            synchronized (lock) {
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                System.out.print(s);
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        final Object lock = new Object();
        FiveThread.Thread1 t1 = new Thread1(lock);
        FiveThread.Thread2 t2 = new Thread2(lock);
        t1.start();
        t2.start();
    }

}
