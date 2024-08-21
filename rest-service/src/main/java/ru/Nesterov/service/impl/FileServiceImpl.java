package ru.Nesterov.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

import org.springframework.stereotype.Service;
import ru.Nesterov.dao.AppDocumentDAO;
import ru.Nesterov.dao.AppPhotoDAO;
import ru.Nesterov.entity.AppDocument;
import ru.Nesterov.entity.AppPhoto;
import ru.Nesterov.service.FileService;
import ru.Nesterov.utils.CryptoTool;

@Log4j
@RequiredArgsConstructor
@Service
public class FileServiceImpl implements FileService {

    private final AppDocumentDAO appDocumentDAO;

    private final AppPhotoDAO appPhotoDAO;

    private final CryptoTool cryptoTool;

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
