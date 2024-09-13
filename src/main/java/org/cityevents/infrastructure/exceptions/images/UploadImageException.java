package org.cityevents.infrastructure.exceptions.images;

import java.io.IOException;

public class UploadImageException extends IOException {
    public UploadImageException(String message) {
        super(message);
    }
}
