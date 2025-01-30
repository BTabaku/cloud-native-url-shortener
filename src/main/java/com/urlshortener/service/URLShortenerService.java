// URLShortenerService.java
package com.urlshortener.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class URLShortenerService {
    private final Map<String, String> urlMap = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public String shortenURL(String originalURL) {
        String shortURL = "http://short.url/" + counter.incrementAndGet();
        urlMap.put(shortURL, originalURL);
        return shortURL;
    }

    public String getOriginalURL(String shortURL) {
        return urlMap.get(shortURL);
    }
}