package com.urlshortener.service;

import com.urlshortener.model.URL;
import com.urlshortener.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class URLShortenerService {
    @Autowired
    private URLRepository urlRepository;

    private final AtomicLong counter = new AtomicLong();

    public String shortenURL(String originalURL) {
        String shortURL = "http://short.url/" + counter.incrementAndGet();
        URL url = new URL();
        url.setOriginalURL(originalURL);
        url.setShortURL(shortURL);
        urlRepository.save(url);
        return shortURL;
    }

    public String getOriginalURL(String shortURL) {
        return urlRepository.findByShortURL(shortURL)
                .map(URL::getOriginalURL)
                .orElse(null);
    }
}