package com.carlostadeu.sdjpaintro.repositories;

import com.carlostadeu.sdjpaintro.domain.composite.AuthorEmbedded;
import com.carlostadeu.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorEmbeddedRepository extends JpaRepository<AuthorEmbedded, NameId> {
}
