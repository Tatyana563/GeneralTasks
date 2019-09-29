package lesson.exception;

import java.util.UUID;

public class CustomException {
    public void f(String s) throws ExceptionA {
        UUID uuid = UUID.randomUUID();
        if (s.contains("a")) throw new ExceptionA("Exception appeared:",uuid);
    }

    public static void main(String[] args) {
        CustomException customException = new CustomException();
        try {
            customException.f("apple");
        } catch (ExceptionA ex) {
            System.out.println("Caught Exception" +ex.uuid);
            // ex.printStackTrace();
        }
    }
}
