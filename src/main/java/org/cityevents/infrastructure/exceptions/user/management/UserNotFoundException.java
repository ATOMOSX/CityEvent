package org.cityevents.infrastructure.exceptions.user.management;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
