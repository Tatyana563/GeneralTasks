package oop.designpattern8;

public class HappensBeforeTest {
    //читать Memory Model
    //4 ядра имеют 4 копии переменной. чем кеш level выше тем выше скорость
    //работыб тем реже обращается к общей памяти
//Use volatile to avoid reordering operations ;
    //Java can change the order of operations:
// test.a = 1;
// test.b = 2
    //result:
     /*a == 0;
      b == 2;*/
     //in anon class ONLY static variables
    public /*volatile*/ static long a = 0;
    public /*volatile*/ static long b = 0;
    public static boolean condition = true;
    public long count = 0;
//count shows how many cycles it took to get the wrong situation;
    public static void main(String[] args) throws InterruptedException {

        while (condition) {
            HappensBeforeTest test = new HappensBeforeTest();
            Thread t1 = new Thread(() -> {
                test.a = 1;
                test.b = 2;
            });
            Thread t2 = new Thread(() -> {
                long localA = a;
                long localB = b;
                if (a == 0 && b == 2) {
                    System.out.println("ERROR " + test.count);
                    condition = false;
                }

            /*a == 0;
            b == 2;*/
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            test.count++;
        }





    }
}
