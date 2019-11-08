package oop.synchronised2;

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Реализовать программу, которая будет производить подсчет суммы всех
// элементов в интовом массиве. Размерность массива больше 10000 количество
// потоков до 10. Также реализовать подсчет суммы всех элементов обычным
// способов и сравнить скорость работы
public class Source {
    static Lock lock = new ReentrantLock();

    public static double count = 0;

    public static void main(String[] args) {
        //обычный способ - 1 поток
        long before = System.currentTimeMillis();
        Integer[] arrays = createArray(10000000);
        sumElements(arrays,0,10000000);
        long after = System.currentTimeMillis();
        System.out.println("Process of 1 thread took" + " " + (after - before) + " " + "ms");
    }

    public static Integer randomFill() {
        Random rand = new Random();
      int randomNum = rand.nextInt();
        return randomNum;
    }

    public static Integer[] createArray(Integer n) {
        Integer[] arr = new Integer[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomFill();
        }
        return arr;
    }

    public static int sumElements(Integer[] array, int indexFrom, int indexTo) {
        lock.lock(); int sum = 0;
        try {

            for (int i = indexFrom; i < indexTo; i++) {
                sum = sum + array[i];
            }
            //System.out.println(Arrays.toString(createArray(n)));
           // System.out.println(sum);
            count += sum;

        } finally {
            lock.unlock();
        }
        System.out.println(sum);
        return sum;
    }
}
