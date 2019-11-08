package oop.designpattern8;

import java.util.Calendar;

public class TestDatabase {

    public static void main(String[] args) throws InterruptedException {
        Database db = Database.getInstance();
        /*Database db2 = Database.getInstance();
        Database db3 = Database.getInstance();
        Calendar calendar = Calendar.getInstance();
        System.out.println(db == db2);
        System.out.println(db == db3);*/


       /* CityClient client1 = new CityClient();
        client1.createCity("test name 1");
        CityClient client2 = new CityClient();
        client2.createCity("test city 2");
        CityClient client3 = new CityClient();
        client3.createCity("test city 3");

        System.out.println(client1.list());
        System.out.println(client2.list());
        System.out.println(client3.list());
        */

        DatabaseThread t1 = new DatabaseThread();
        DatabaseThread t2 = new DatabaseThread();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
    }
}
