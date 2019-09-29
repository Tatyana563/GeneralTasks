package lesson.oop.designpattern;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Outer {
    private int id;
    private static int idSt;
//Local class - время жизни ограниченно вызовом метода
    public void call() {
        class Local implements Serializable, Cloneable {
            private final int localId;
            public Local() {
                this.localId = id;
            }
        }
        Local local = new Local();
        id = local.localId;

        // Anonymous class as Local exists inside the the method only.
        // Anonymous does not have a name and cant implement more than 1 interface.
        // Local can a few.
        //Local has access for all fields and methods of Outer class.


        Collections.sort(new ArrayList<String>(), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }


    public static class Inner {

        private final int innerId;
        public Inner() {
           Outer outer = new Outer();
            innerId = outer.id;
          // innerId = idSt;
        }
    }
//public class Inner {
//
//    private final int innerId;
//    public Inner() {
//        //innerId = id;
//        innerId = idSt;
//    }
//}


}
