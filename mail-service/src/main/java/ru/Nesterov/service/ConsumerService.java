package ru.Nesterov.service;

import ru.Nesterov.dto.MailParams;

public interface ConsumerService {

    void consumeRegistrationMail(MailParams mailParams);
}
