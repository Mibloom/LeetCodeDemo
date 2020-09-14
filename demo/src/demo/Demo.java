package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lipengke
 * @description:
 * @date 2020/3/17 21:21
 */
public class Demo {

    public Demo() {
    }

    public static final ThreadLocal<String> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->{
            System.out.println(Thread.currentThread().getName());
        });


    }

    static class ParkDemo{

    }



}
