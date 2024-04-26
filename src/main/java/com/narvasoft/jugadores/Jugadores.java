package com.narvasoft.jugadores;

public class Jugadores {

    public int getId() {
        return id;
    }

//Atributos
    public void setId(int id) {
        this.id = id;
    }
    private int id;
    private String nombre;
    private char nivel; // 'P': principiante, 'I'Intermedio, 'A'Avanzado
    private String juegofavorito;
    private int max_score;

    
    //métodos 
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getNivel() {
        return nivel;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public String getJuegofavorito() {
        return juegofavorito;
    }

    public void setJuegofavorito(String juegofavorito) {
        this.juegofavorito = juegofavorito;
    }

    public int getMax_score() {
        return max_score;
    }

    public void setMax_score(int max_score) {
        this.max_score = max_score;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "id=" + id + ", nombre=" + nombre + ", nivel=" + nivel + ", juegofavorito=" + juegofavorito + ", max_score=" + max_score + '}';
    }

    
    
    
}
