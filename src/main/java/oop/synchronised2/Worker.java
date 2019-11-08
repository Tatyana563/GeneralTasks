package oop.synchronised2;

public class Worker implements Runnable {

    private final Integer[] array;
    private final Source source;
    private final int fromIndex, toIndex;


    public Worker(Source source, Integer[] array, int fromIndex, int toIndex) {
        this.array = array;
        this.source = source;
        this.toIndex = toIndex;
        this.fromIndex = fromIndex;
    }

    @Override
    public void run() {
        for (int i = fromIndex; i < toIndex; i++)
        {
            source.sumElements(array, fromIndex, toIndex);
        }
    }
}
