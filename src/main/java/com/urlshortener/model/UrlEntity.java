package com.urlshortener.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "urls")

public class UrlEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, unique = true)
    private String shortUrl;

    @Column(nullable = false)
    private String originalUrl;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}
