package libin.program._01_java.thread;

/**
 * Copyright (c) 2018/09/28. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
public class ThreadOp {
    public static void main(String[] args) {
        /*MyThread1 thread1 = new MyThread1("Thread1", 0);
        MyThread1 thread2 = new MyThread1("Thread2", 0);
        thread1.start();
        thread2.start();*/

        MyThread2 thread3_tmp = new MyThread2("Thread3", 0);
        MyThread2 thread4_tmp = new MyThread2("Thread4", 0);
        Thread thread3 = new Thread(thread3_tmp);
        Thread thread4 = new Thread(thread4_tmp);
        thread3.start();
        thread4.start();
    }
}

/**
 * 继承Thread
 */
class MyThread1 extends Thread {
    private int count;
    private String name;

    MyThread1(String name, int count) {
        this.count = count;
        this.name = name;
    }

    private void updateCount() {
        count++;
        System.out.println(name + ":" + count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            updateCount();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 实现Runnable
 */
class MyThread2 implements Runnable {
    private int count;
    private String name;

    MyThread2(String name, int count) {
        this.count = count;
        this.name = name;
    }

    private void updateCount() {
        count++;
        System.out.println(name + ":" + count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            updateCount();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
