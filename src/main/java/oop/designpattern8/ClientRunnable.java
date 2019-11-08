package oop.designpattern8;

public class ClientRunnable implements Runnable {

    private final int id;

    public ClientRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("run thread " + id + " time is " + System.currentTimeMillis());
        System.out.println("run new thread = " + id);
    }
}
