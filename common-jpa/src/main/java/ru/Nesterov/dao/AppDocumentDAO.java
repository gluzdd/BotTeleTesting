package ru.Nesterov.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Nesterov.entity.AppDocument;

public interface AppDocumentDAO extends JpaRepository<AppDocument, Long> {
}
