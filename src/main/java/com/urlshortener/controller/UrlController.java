package com.urlshortener.controller;

import com.urlshortener.model.Url;
import com.urlshortener.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/url")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping("/shorten")
    public ResponseEntity<Url> shortenUrl(@RequestBody Url url) {
        String shortUrl = urlService.generateShortUrl(url.getOriginalUrl());
        url.setShortUrl(shortUrl);
        Url savedUrl = urlService.saveUrl(url);
        return ResponseEntity.ok(savedUrl);
    }

    @GetMapping("/{shortUrl}")
    public ResponseEntity<Url> getOriginalUrl(@PathVariable String shortUrl) {
        Optional<Url> url = urlService.getOriginalUrl(shortUrl);
        return url.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}