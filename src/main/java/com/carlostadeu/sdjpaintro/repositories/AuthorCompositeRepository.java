package com.carlostadeu.sdjpaintro.repositories;

import com.carlostadeu.sdjpaintro.domain.composite.AuthorComposite;
import com.carlostadeu.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}
