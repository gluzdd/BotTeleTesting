package ru.Nesterov.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Nesterov.entity.AppPhoto;

public interface AppPhotoDAO extends JpaRepository<AppPhoto, Long> {
}
