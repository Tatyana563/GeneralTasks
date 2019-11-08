
package oop.synchronised2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableEx2 {
  ExecutorService executorService = Executors.newFixedThreadPool(5);
    List<Future<Long>>  futures = new ArrayList<>();

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        Source s = new Source();
      //  Integer[] arrays = s.createArray(10000);
        Integer[] myarr = {1,2,3,4,5,6};
        CallableEx2 c = new CallableEx2();
      //  c.doWork(arrays,s,0,10000);
        c.doWork(myarr,s,0,6);
        long after = System.currentTimeMillis();
        System.out.println("Process of ExecutorService took" + " " + (after - before) + " " + "ms");
        }
    public void doWork(Integer[] array, Source source, int fromIndex, int toIndex){

            Future<Long> future =executorService.submit(new Worker2(array,source, fromIndex,toIndex));
    futures.add(future);



    }
}
