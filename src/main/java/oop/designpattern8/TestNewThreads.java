package oop.designpattern8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestNewThreads {
// процесс-набор кода и данныхб включает как минимум 1 поток
    //дисп задач показывает пр-сы
    //ядра OS берут на себя многопоточное выполнениеб до 2005г увеличивали атктовую частоту процессора для реал многопоточности ("-", нагрев)
    //private AtomicInteger count = new AtomicInteger(0);
    //if the class has synchronised method the class is blocked.
    //while the thread in a synchronised method, no other thread can enter
    // another methods in this class.
    //JVM launch a thread when it has a possibility, as it has many other
    // tasks = collecting garbage, etc.
    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Object obj = new Object();

    public int getCount() {
        return count;
    }

   // thread 2 , thread 3
    public int count() {
        lock.lock();
        try {
            count = count + 1;
        } finally {
            lock.unlock();
        }
        return count;
    }

    public int count2() {
        synchronized (obj) {
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) throws InterruptedException {

        TestNewThreads t = new TestNewThreads();
//        synchronized (t) {
//            t.wait();
//        }
//
//        System.exit(0);

        ClientThread thread1 = new ClientThread(t,1);
        ClientThread thread2 = new ClientThread(t, 2);
        ClientThread thread3 = new ClientThread(t,3);
        ClientThread thread4 = new ClientThread(t,4);

//        Thread cityThread = new Thread(new ClientRunnable(10));
//        Thread cityThread2 = new Thread(new ClientRunnable(20));
//
//        Thread cityThread3 =
//                new Thread(() ->
//                        System.out.println("new runnable thread with name " + Thread.currentThread().getId())
//        );
//
//        cityThread.start();
//        cityThread2.start();

        //System.out.println("run thread 1 time is " + System.currentTimeMillis());
        thread1.start();
        thread1.join(100);
        //System.out.println("run thread 2 time is " + System.currentTimeMillis());
        thread2.start();
        thread2.join(100);
       // System.out.println("run thread 3 time is " + System.currentTimeMillis());
        thread3.start();
        thread3.join(100);
       // System.out.println("run thread 4 time is " + System.currentTimeMillis());
        thread4.start();
        thread4.join(100);



        System.out.println(t.count);
    }
}
