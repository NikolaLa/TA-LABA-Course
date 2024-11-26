package org.solvd.zoo.exception;
//if no worker is scheduled for the next few days in zoo to take care of animals
public class NoWorkerException extends RuntimeException {
    public NoWorkerException(String message) {
        super(message);
    }
}
