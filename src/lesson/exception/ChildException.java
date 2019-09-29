package lesson.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildException extends SuperTestException {

    @Override
    public void calcValues() throws FileNotFoundException {

    }
}
// При наследованиее если метод с exception переопределен и не продублирован в child
//  он будет проигнорирован
// in child class method can throe ex lower in hierarchy than in a parental class