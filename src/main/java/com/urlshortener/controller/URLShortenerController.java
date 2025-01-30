package com.urlshortener.controller;

import com.urlshortener.service.URLShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class URLShortenerController {

    @Autowired
    private URLShortenerService urlShortenerService;

    @PostMapping("/shorten")
    public String shortenURL(@RequestBody String originalURL) {
        return urlShortenerService.shortenURL(originalURL);
    }

    @GetMapping("/original")
    public ResponseEntity<String> getOriginalURL(@RequestParam String shortURL) {
        String originalURL = urlShortenerService.getOriginalURL(shortURL);
        if (originalURL != null) {
            return new ResponseEntity<>(originalURL, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("URL not found", HttpStatus.NOT_FOUND);
        }
    }
}