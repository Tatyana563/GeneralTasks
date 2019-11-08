//package oop.synchronised2;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class TestThreads {
//    public static void main(String[] args) throws InterruptedException {
//        long before = System.currentTimeMillis();
//
//        Source s = new Source();
//        Integer[] arrays = s.createArray(10000);
//
//        Thread t1 = new Thread(new Worker(s,arrays,0,2000));
//        Thread t2 = new Thread(new Worker(s,arrays,2001,4000));
//        Thread t3 = new Thread(new Worker(s,arrays,4001,6000));
//        Thread t4 = new Thread(new Worker(s,arrays,6001,8000));
//        Thread t5 = new Thread(new Worker(s,arrays,8001,10000));
//
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();
//        t3.start();
//        t3.join();
//        t4.start();
//        t4.join();
//        t5.start();
//        t5.join();
//        System.out.println(s.count);
//        long after = System.currentTimeMillis();
//        System.out.println("Process took" + " " + (after - before) + " " + "ms");
//
//        /*ExecutorService executorService = Executors.newFixedThreadPool(5);
//
//        executorService.submit(new Worker());
//        if(executorService.awaitTermination(3, TimeUnit.MINUTES)){
//            executorService.shutdownNow();
//        }
//        executorService.shutdown();
//        */
//
//
//    }
//}
