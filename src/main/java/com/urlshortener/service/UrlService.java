package com.urlshortener.service;

import com.urlshortener.model.Url;
import com.urlshortener.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlService {

    @Autowired
    private UrlRepository urlRepository;

    public Optional<Url> getOriginalUrl(String shortUrl) {
        return urlRepository.findByShortUrl(shortUrl);
    }

    public Url saveUrl(Url url) {
        return urlRepository.save(url);
    }

    // Method to generate short URL
    public String generateShortUrl(String originalUrl) {
        // Implement your URL shortening logic here
        return "shortUrl";
    }
}