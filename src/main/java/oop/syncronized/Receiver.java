package oop.syncronized;

public class Receiver implements Runnable {

    private final Source source;

    public Receiver(Source source) {
        this.source = source;
    }

    @Override
    public void run() {
        String receivedData=source.receive();
      //  String receivedData = null;
       while (!receivedData.equals("EOF")){
            System.out.println(receivedData);
             receivedData = source.receive();
        }
    }
}
