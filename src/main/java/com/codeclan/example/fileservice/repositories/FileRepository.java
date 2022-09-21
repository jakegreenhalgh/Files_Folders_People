package com.codeclan.example.fileservice.repositories;

import com.codeclan.example.fileservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
