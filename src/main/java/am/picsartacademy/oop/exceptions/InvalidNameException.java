package am.picsartacademy.oop.exceptions;

public class InvalidNameException extends RuntimeException {
    public InvalidNameException() {}
    public String toString() {
        return "Invalid name. Name should be at least 3 characters long.";
    }

}
