package oop.synchronised2;

import java.util.concurrent.Callable;

public class Worker2 implements Callable {
    private final Integer[] array;
    private final Source source;
    private final int fromIndex, toIndex;

    public Worker2(Integer[] array, Source source, int fromIndex, int toIndex) {
        this.array = array;
        this.source = source;
        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
    }

    @Override
    public Object call() throws Exception {

        {
         source.sumElements(array, fromIndex, toIndex);
        }
        return Thread.currentThread().getName();
    }
}
