package org.cityevents.aplication.port.in.cloudinary;

import org.cityevents.infrastructure.exceptions.images.DeleteImageException;
import org.cityevents.infrastructure.exceptions.images.UploadImageException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface ImageService {
    Map uploadImage(MultipartFile image) throws UploadImageException, IOException;
    Map deleteImage(String imageId) throws DeleteImageException, IOException;
    Map uploadImages(MultipartFile image) throws Exception;
}
