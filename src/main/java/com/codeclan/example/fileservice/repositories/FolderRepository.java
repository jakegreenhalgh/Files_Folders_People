package com.codeclan.example.fileservice.repositories;

import com.codeclan.example.fileservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
