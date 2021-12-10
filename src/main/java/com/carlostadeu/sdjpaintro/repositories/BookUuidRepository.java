package com.carlostadeu.sdjpaintro.repositories;

import com.carlostadeu.sdjpaintro.domain.AuthorUuid;
import com.carlostadeu.sdjpaintro.domain.BookUuid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookUuidRepository extends JpaRepository<BookUuid, UUID> {
}
