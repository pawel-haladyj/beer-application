package pl.haladyj.edgeservice.exception;

public class BadRequestException extends Exception {

    public BadRequestException(){}


    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(Throwable cause) {
        super(cause);
    }

    public String toString() {
        return "BadRequestException: " + getMessage();
    }
}
