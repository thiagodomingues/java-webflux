package com.example.webflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Playlist {

    public Playlist(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Id
    private String id;
    private String nome;
}
