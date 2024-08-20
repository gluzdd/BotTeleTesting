package ru.Nesterov.service.impl;

import lombok.extern.log4j.Log4j;

import org.springframework.stereotype.Service;
import ru.Nesterov.dao.AppDocumentDAO;
import ru.Nesterov.dao.AppPhotoDAO;
import ru.Nesterov.entity.AppDocument;
import ru.Nesterov.entity.AppPhoto;
import ru.Nesterov.service.FileService;
import ru.Nesterov.utils.CryptoTool;

import java.io.File;
import java.io.IOException;

@Log4j
@Service
public class FileServiceImpl implements FileService {
    private final AppDocumentDAO appDocumentDAO;
    private final AppPhotoDAO appPhotoDAO;
    private final CryptoTool cryptoTool;

    public FileServiceImpl(AppDocumentDAO appDocumentDAO, AppPhotoDAO appPhotoDAO, CryptoTool cryptoTool) {
        this.appDocumentDAO = appDocumentDAO;
        this.appPhotoDAO = appPhotoDAO;
        this.cryptoTool = cryptoTool;
    }

    @Override
    public AppDocument getDocument(String hash) {
        var id = cryptoTool.idOf(hash);
        if (id == null) {
            return null;
        }
        return appDocumentDAO.findById(id).orElse(null);
    }

    @Override
    public AppPhoto getPhoto(String hash) {
        var id = cryptoTool.idOf(hash);
        if (id == null) {
            return null;
        }
        return appPhotoDAO.findById(id).orElse(null);
    }
}
