package org.solvd.zoo.exception;
//when trying to feed animal that is not in zoo, or a Volunteer feed a dangerous animal,
public class FeedException extends RuntimeException {
    public FeedException(String message) {
        super(message);
    }
}
