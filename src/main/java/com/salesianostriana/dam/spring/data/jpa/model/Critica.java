package com.salesianostriana.dam.spring.data.jpa.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Critica {

    @Id
    @GeneratedValue
    Long id;

    String autor;
    String texto;
    double puntuacion;

    @ManyToOne
    @JoinColumn(name = "pelicula_id")
    @ToString.Exclude
    private Pelicula pelicula;
}
