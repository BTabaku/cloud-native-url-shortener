package com.urlshortener.repository;

import com.urlshortener.model.URL;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface URLRepository extends JpaRepository<URL, Long> {
    Optional<URL> findByShortURL(String shortURL);
}