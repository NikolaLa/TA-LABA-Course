package org.solvd.zoo.exception;
//if Animal Occupies one place other animal of other spieces should not be there like lion and giraffe together,
// or place is not suitable for example like a Lion should not be on a pigwin suitable run
public class PlaceNotAvailableException extends RuntimeException {
    public PlaceNotAvailableException(String message) {
        super(message);
    }
}
