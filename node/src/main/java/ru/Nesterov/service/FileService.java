package ru.Nesterov.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.Nesterov.entity.AppDocument;
import ru.Nesterov.entity.AppPhoto;
import ru.Nesterov.service.enums.LinkType;

public interface FileService {

    AppDocument processDoc(Message telegramMessage);

    AppPhoto processPhoto(Message telegramMessage);

    String generateLink(Long docId, LinkType linkType);
}
