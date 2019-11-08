package oop.syncronized;

public class Source {
    //Pattern Producer-Consumer
// we can't use wait without synchronised (without Critical section) - we get
    // IllegalMonitorStateException
    //WE send only after receiving the package!!!
    private String packet;
    private boolean transfer = true;

    public synchronized void send(String data) {
        while(!transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.packet = data;
        transfer = false;
        notifyAll();
    }

    public synchronized String receive() {
        String data = null;
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = this.packet;
        transfer = true;
        notifyAll();
        return data;



    }
}
