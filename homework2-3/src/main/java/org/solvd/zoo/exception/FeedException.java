package org.solvd.zoo.exception;
//when trying to feed animal that is not in zoo
public class FeedException extends RuntimeException {
    public FeedException(String message) {
        super(message);
    }
}
