package com.miumg.edu.progra2.TipoCambioDia.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiControlador {

    // Ruta para saludo general
    @GetMapping("/saludo")
    public String saludo() {
        return "¡Hola, Mundo!";
    }

    // Ruta para saludo con nombre
    @GetMapping("/saludo/{nombre}")
    public String saludoPersonalizado(@PathVariable String nombre) {
        return "¡Hola, " + nombre + "!";
    }

    // Ruta para saludo con nombre y edad
    @GetMapping("/saludo/{nombre}/{edad}")
    public String saludoConEdad(@PathVariable String nombre, @PathVariable int edad) {
        return "¡Hola, " + nombre + "! Tienes " + edad + " años.";
    }
}
