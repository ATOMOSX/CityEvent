package org.cityevents.infrastructure.exceptions.user.management;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String message) {
        super(message);
    }
}
