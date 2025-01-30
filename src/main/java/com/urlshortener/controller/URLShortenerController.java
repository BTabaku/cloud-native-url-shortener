// URLShortenerController.java
package com.urlshortener.controller;

import com.urlshortener.service.URLShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String getOriginalURL(@RequestParam String shortURL) {
        return urlShortenerService.getOriginalURL(shortURL);
    }
}