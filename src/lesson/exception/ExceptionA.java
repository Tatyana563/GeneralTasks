package lesson.exception;

import java.util.UUID;

public class ExceptionA extends Exception {
    UUID uuid = UUID.randomUUID();

    public ExceptionA(String message, UUID uuid) {
        super(message);
        this.uuid = uuid;
    }
}

