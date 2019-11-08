package oop.designpattern8;

public class DatabaseThread implements Runnable {
    @Override
    public void run() {

        Database db = Database.getInstance();
    }
}
