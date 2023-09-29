package com.duulo.server.media;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "media_type")
    @Enumerated(EnumType.STRING)
    private MediaType mediaType; // Image, Video, Audio

    // I will store the url of the media that is stored
    // somewhere else like google cloud storage
    @Column(name = "media_url")
    private String url;
}
