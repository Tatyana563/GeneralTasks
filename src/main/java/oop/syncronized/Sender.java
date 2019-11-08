package oop.syncronized;

public class Sender implements Runnable {

    private final Source source;

    public Sender(Source source) {
        this.source = source;
    }

    @Override
    public void run() {
        String[] data = {"First", "Second", "Third", "LAST", "EOF"};
        for (String item: data) {
            source.send(item);
        }
    }
}
