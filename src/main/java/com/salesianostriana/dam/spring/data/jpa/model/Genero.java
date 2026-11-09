package com.salesianostriana.dam.spring.data.jpa.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Genero {

    @Id
    @GeneratedValue
    Long id;

    String nombre;




}
