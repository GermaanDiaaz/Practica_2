package com.salesianostriana.dam.spring.data.jpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Pelicula {

    @Id
    @GeneratedValue
    Long id;

    String titulo;
    int anioPublicacion;

    @ManyToMany
    @JoinColumn(name = "genero_id")
    @ToString.Exclude
    private List<Genero> genero = new ArrayList<>();

    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    @ToString.Exclude
    private List<Critica> critica = new ArrayList<>();

    public Pelicula addCritica(Critica c) {
        critica.add(c);
        c.setCritica(null);
        return this;
    }

    public Pelicula removeCritica(Critica c) {
        critica.remove(c);
        c.setCritica(null);
        return this;
    }

}
