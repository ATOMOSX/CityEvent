package org.cityevents.infrastructure.adapter.cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.cityevents.aplication.service.ImageService;
import org.cityevents.infrastructure.exceptions.out.images.DeleteImageException;
import org.cityevents.infrastructure.exceptions.out.images.UploadImageException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class ImageServiceImpl implements ImageService {
    private final Cloudinary cloudinary;

    public ImageServiceImpl() {
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", "dzdswg3j5");
        config.put("api_key", "512362591958621");
        config.put("api_secret", "kwc-ePHWaBdJNXpcORZFxOHRHWQ");

        cloudinary = new Cloudinary(config);
    }

    @Override
    public Map uploadImage(MultipartFile image) throws UploadImageException, IOException {
        File file = convert(image);
        return cloudinary.uploader().upload(file, ObjectUtils.asMap("folder", "CityEvents"));
    }

    @Override
    public Map deleteImage(String idImage) throws DeleteImageException, IOException {
        return cloudinary.uploader().destroy(idImage, ObjectUtils.emptyMap());
    }

    @Override
    public Map uploadImages(MultipartFile image) throws UploadImageException,Exception {
        File file = convert(image);
        return cloudinary.uploader().upload(file, ObjectUtils.asMap("folder", "NearbyEats"));
    }

    private File convert(MultipartFile image) throws IOException {
        File file = File.createTempFile(Objects.requireNonNull(image.getOriginalFilename()), null);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(image.getBytes());
        fileOutputStream.close();
        return file;
    }

}
