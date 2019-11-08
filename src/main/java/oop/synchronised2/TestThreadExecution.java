package oop.synchronised2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.*;

public class TestThreadExecution {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool();
        Future<Integer> f = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 0;
            }
        });


        Future<Integer> f2 = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 0;
            }
        });

        int summ = f.get() + f2.get();
        List<String> list = new ArrayList<>();
        List<String> newList = Collections.synchronizedList(list);

      //  ConcurrentSkipListSet

    }
}
