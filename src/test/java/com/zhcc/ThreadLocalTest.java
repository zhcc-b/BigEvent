package com.zhcc;

import org.junit.jupiter.api.Test;

public class ThreadLocalTest {

    @Test
    public void testThreadLocalSetAndGet() {
        // provide a ThreadLocal object
        ThreadLocal t1 = new ThreadLocal();
        // start two thread
        new Thread(()->{
            t1.set("Xiaoyan");
            System.out.println(Thread.currentThread().getName() + ": " + t1.get());
            System.out.println(Thread.currentThread().getName() + ": " + t1.get());
            System.out.println(Thread.currentThread().getName() + ": " + t1.get());
        }, "蓝色").start();

        new Thread(()->{
            t1.set("Yaochen");
            System.out.println(Thread.currentThread().getName() + ": " + t1.get());
            System.out.println(Thread.currentThread().getName() + ": " + t1.get());
            System.out.println(Thread.currentThread().getName() + ": " + t1.get());
        }, "绿色").start();
    }
}
