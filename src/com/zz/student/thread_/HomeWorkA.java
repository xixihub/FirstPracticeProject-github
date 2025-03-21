package com.zz.student.thread_;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Synchronized;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class HomeWorkA {
    public static void main(String[] args) {

//        MyThread2 myThread2 = new MyThread2();
//        Thread thread = new Thread(myThread2);
//        thread.setName("线程2守护线程");
//        thread.start();
//        MyThread3 myThread3 = new MyThread3();
//        Thread thread1 = new Thread(myThread3);
//        thread1.setName("线程3守护线程");
//        thread1.start();
        int i = 0;

        while (i<5){
            MyThread3 myThread4 = new MyThread3();
            Thread thread2 = new Thread(myThread4);
            thread2.setName("线程"+i+"守护线程");
            thread2.start();
            i++;
        }
    }


}

@EqualsAndHashCode(callSuper = true)
@Data
class MyThread extends Thread {
    private Boolean flag = true;
    private int count = 0;

    @Override
    public void run() {

        /**
         *随机0~100中间的数
         */
        int num = (int) (Math.random() * 100);
        while (flag) {
            count++;
            System.out.println(Thread.currentThread().getName() + "-->" + num + "-->次数" + count);
            System.out.println(Thread.currentThread().getName() + "-->" + num + "-->flag" + flag);
            if (count >= 10) {
                flag = false;
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        System.out.println(Thread.currentThread().getName() + "123--->" + myThread.getCount());
        while (true) {
//                   System.out.println(Thread.currentThread().getName() + "--线程1执行次数>--->" + myThread.getCount());
            if (myThread.getCount() >= 20) {
                System.out.println(Thread.currentThread().getName() + "--线程1终止时执行次数>--->" + myThread.getCount());
                myThread.setFlag(false);
                break;
            }
            if (!myThread.isAlive()) {
                System.out.println(Thread.currentThread().getName() + "--2次数>--->" + myThread.getCount());
                break;
            }
        }


    }
}

class MyThread3 implements Runnable {
    private static int count = 10000;
    private static Objects objects;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (setMoney()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            synchronized(this) {
//                System.out.println(Thread.currentThread().getName() + "开始取--->余额" + count);
//                if (count < 1000) {
//                    System.out.println(Thread.currentThread().getName() + "--->取完了" + count);
//                    break;
//                }
//                count -= 1000;
//                System.out.println(Thread.currentThread().getName() + "--->取了1000剩余" + count);
//            }
//        }
    }

    public static synchronized Boolean setMoney() {
        System.out.println(Thread.currentThread().getName() + "开始取--->余额" + count);
        if (count <1000) {
            System.out.println(Thread.currentThread().getName() + "--->取完了" + count);
            return false;
        }
        count -= 1000;
        System.out.println(Thread.currentThread().getName() + "--->取了1000剩余" + count);
        return true;
    }
}