package com.urlshortener.controller;

    import com.urlshortener.service.URLShortenerService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api")
    public class URLShortenerController {

        @Autowired
        private URLShortenerService urlShortenerService;

        @PostMapping("/shorten")
        public ResponseEntity<String> shortenURL(@RequestBody String originalURL) {
            String shortURL = urlShortenerService.shortenURL(originalURL);
            return ResponseEntity.ok(shortURL);
        }
    }