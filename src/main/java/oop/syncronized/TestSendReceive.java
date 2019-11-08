package oop.syncronized;

public class TestSendReceive {

    public static void main(String[] args) throws InterruptedException {
        Source source = new Source();
        Thread sender = new Thread(new Sender(source));
        Thread receiver = new Thread(new Receiver(source));
        sender.start();
        receiver.start();
        sender.join();
        receiver.join();

    }
}
