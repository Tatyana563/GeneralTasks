package oop.synchronised2;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class RecursiveTaskSumArray {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[10000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
            }
            Sum task = new Sum(nums, 0, nums.length);
            double summation = fjp.invoke(task);
            System.out.println("Summation " + summation);
        long after = System.currentTimeMillis();
        System.out.println("Process of ForkJoinPool took" + " " + (after - before) + " " + "ms");
        }
    }


class Sum extends RecursiveTask<Double> {
    private static final long serialVersionUID = -6229275584372234275L;
    final int seqThreshold = 500;
    double[] data;
    int start, end;

    Sum(double[] data, int start, int end)
    {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute()
    {
        double sum = 0;
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++)
                sum += data[i];
        }
        else {
            int middle = (start + end) / 2;

            Sum subtaskA = new Sum(data, start, middle);
            Sum subtaskB = new Sum(data, middle, end);

            subtaskA.fork();
            subtaskB.fork();

            sum += subtaskA.join() + subtaskB.join();
        }
        return sum;
    }
}

