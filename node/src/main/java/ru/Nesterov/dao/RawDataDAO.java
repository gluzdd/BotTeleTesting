package ru.Nesterov.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Nesterov.entity.RawData;

public interface RawDataDAO extends JpaRepository<RawData, Long> {
}
