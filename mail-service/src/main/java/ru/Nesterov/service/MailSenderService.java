package ru.Nesterov.service;

import ru.Nesterov.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}
