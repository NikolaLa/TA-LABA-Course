package org.solvd.zoo.exception;
//if The a place already is occupied by animal and there is not room for more
public class OvercrowdException extends RuntimeException {
    public OvercrowdException(String message) {
        super(message);
    }
}
