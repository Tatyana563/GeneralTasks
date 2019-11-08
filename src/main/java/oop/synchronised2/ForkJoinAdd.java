package oop.synchronised2;


import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;
//Sum all the numbers from 1 to 1 million.
//https://www.mkyong.com/java/java-fork-join-framework-examples/
public class ForkJoinAdd extends RecursiveTask<Long> {
    public static void main(String[] args) {
        System.out.println(ForkJoinAdd.startForkJoinSum(1_000_000));
    }

    private static final long serialVersionUID = -5933683974051882871L;
    private final long[] numbers;
        private final int start;
        private final int end;
        public static final long threshold = 10_000;

        public ForkJoinAdd(long[] numbers) {
            this(numbers, 0, numbers.length);
        }

        private ForkJoinAdd(long[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {

            int length = end - start;
            if (length <= threshold) {
                return add();
            }

            ForkJoinAdd firstTask = new ForkJoinAdd(numbers, start, start + length / 2);
            firstTask.fork(); //start asynchronously

            ForkJoinAdd secondTask = new ForkJoinAdd(numbers, start + length / 2, end);

            Long secondTaskResult = secondTask.compute();
            Long firstTaskResult = firstTask.join();

            return firstTaskResult + secondTaskResult;

        }

        private long add() {
            long result = 0;
            for (int i = start; i < end; i++) {
                result += numbers[i];
            }
            return result;
        }

        public static long startForkJoinSum(long n) {
            long[] numbers = LongStream.rangeClosed(1, n).toArray();
            ForkJoinTask<Long> task = new ForkJoinAdd(numbers);
            return new ForkJoinPool().invoke(task);
        }
//    public static long[] createArray(Integer n) {
//       long[] arr = new long[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = randomFill();
//        }
//        return arr;
//    }
//    public static Long randomFill() {
//        Random rand = new Random();
//       long randomNum = rand.nextLong();
//        return randomNum;
//    }

    }

