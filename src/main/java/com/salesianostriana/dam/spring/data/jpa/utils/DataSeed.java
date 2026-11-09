package com.salesianostriana.dam.spring.data.jpa.utils;

import com.salesianostriana.dam.spring.data.jpa.model.Critica;
import com.salesianostriana.dam.spring.data.jpa.model.Genero;
import com.salesianostriana.dam.spring.data.jpa.model.Pelicula;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSeed {

    @PostConstruct
    public void cargarDatos(){

        Genero g1 = generoService.guardar(Genero.builder()
                .nombre("Romance")
                .build());

        Genero g2 = generoService.guardar(Genero.builder()
                .nombre("Accion")
                .build());

        Pelicula p1 = peliculaService.guardar(Pelicula.builder()
                .titulo("Titanic")
                .anioPublicacion(2005)
                .genero((List<Genero>) g1, g2)
                .build());

        Pelicula p2 = peliculaService.guardar(Pelicula.builder()
                .titulo("Harry Potter")
                .anioPublicacion(2008)
                .genero((List<Genero>) g1)
                .build());

        Critica c1 = criticaService.guardar(Critica.builder()
                .autor("German")
                .texto("Pastelazo")
                .puntuacion(5)
                .pelicula(p1)
                .build());

        Critica c2 = criticaService.guardar(Critica.builder()
                .autor("Manu")
                .texto("Brutal")
                .puntuacion(9)
                .pelicula(p1)
                .build());

        Critica c3 = criticaService.guardar(Critica.builder()
                .autor("Paco")
                .texto("Not bad")
                .puntuacion(7)
                .pelicula(p2)
                .build());
    }
}
