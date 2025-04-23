package com.example.API_videojuegos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/videojuegos")

public class VideojuegoController {
    @GetMapping("/hola")
    public String saludar(){
        return "wena compare \uD83E\uDD21 \uD83E\uDD21 \uD83E\uDD21";
    }

    @GetMapping("/top")
    public Videojuego obtenerVideojuegotop(){
        return new Videojuego("The Legend of Zelda: Breath of the Wild","Nintendo Switch",10);
    }
    @GetMapping("/hola/{name}")
    public String saludoDinamico(@PathVariable String name){
        return "Hola, mi nombre es: "+name;
    }
    @GetMapping("/suma/{x}/{y}")
    public String sumaConParametrs(@PathVariable int x, @PathVariable int y){
        return "La suma de " + x + " + " + y + " es:  "+(x+y);
    }

    static class Videojuego{
        private String titulo;
        private String plataforma;
        private int puntuacion;


        public Videojuego(String titulo, String plataforma, int puntuacion){
            this.titulo = titulo;
            this.plataforma = plataforma;
            this.puntuacion = puntuacion;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getPlataforma() {
            return plataforma;
        }

        public int getPuntuacion() {
            return puntuacion;
        }


    }


}
