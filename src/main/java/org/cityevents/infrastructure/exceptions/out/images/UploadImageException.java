package org.cityevents.infrastructure.exceptions.out.images;

import java.io.IOException;

public class UploadImageException extends IOException {
    public UploadImageException(String message) {
        super(message);
    }
}
