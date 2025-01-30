package com.urlshortener.service;

    import com.urlshortener.model.URL;
    import com.urlshortener.repository.URLRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    @Service
    public class URLShortenerService {

        @Autowired
        private URLRepository urlRepository;

        public String shortenURL(String originalURL) {
            URL url = new URL();
            url.setOriginalURL(originalURL);
            url.setShortURL("http://short.url/1"); // Example shortened URL
            urlRepository.save(url);
            return url.getShortURL();
        }
    }