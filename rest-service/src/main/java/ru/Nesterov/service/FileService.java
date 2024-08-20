package ru.Nesterov.service;

import org.springframework.core.io.FileSystemResource;
import ru.Nesterov.entity.AppDocument;
import ru.Nesterov.entity.AppPhoto;
import ru.Nesterov.entity.BinaryContent;

public interface FileService {
    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);
}
