package ru.Nesterov.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Nesterov.entity.BinaryContent;

public interface BinaryContentDAO extends JpaRepository<BinaryContent, Long> {
}
