package ru.project.instazoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.instazoo.entity.ImageModels;

import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<ImageModels,Long> {

Optional<ImageModels> findByPostId(Long id);

Optional<ImageModels> findByUserId(Long id);

}
