package com.salesianostriana.dam.spring.data.jpa.utils;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class DataCheck {

    @PostConstruct
    @DependsOn("dataSeed")
    public void comprobarDatos() {

    }

}
