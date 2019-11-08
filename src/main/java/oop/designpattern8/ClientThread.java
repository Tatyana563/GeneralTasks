package oop.designpattern8;

public class ClientThread extends Thread {

    private final int id;
    //aggregation;
    private TestNewThreads thread;

    public ClientThread(TestNewThreads t, int id) {
        this.id = id;
        thread = t;
    }

    @Override
    public void run() {
       /* System.out.println("run thread " + id + " time is " + System.currentTimeMillis());
        System.out.println("run new thread = " + id);
        */
        try {
            Thread.currentThread().join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread with id = " + id + " has count = " + thread.count());
    }
}
