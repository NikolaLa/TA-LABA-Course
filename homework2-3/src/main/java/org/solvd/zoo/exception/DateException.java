package org.solvd.zoo.exception;
//when scheduling appoitment that should be after current date
public class DateException extends RuntimeException {
    public DateException(String message) {
        super(message);
    }
}
