package org.cityevents.infrastructure.exceptions.in;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
