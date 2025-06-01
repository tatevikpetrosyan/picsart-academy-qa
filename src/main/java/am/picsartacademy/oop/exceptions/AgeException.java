package am.picsartacademy.oop.exceptions;

public class AgeException extends RuntimeException {
    private String message;
    public AgeException(String message) {
        this.message = message;
    }

//    public String toString() {
//        return message;
//    }

}
