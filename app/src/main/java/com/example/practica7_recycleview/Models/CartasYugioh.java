package com.example.practica7_recycleview.Models;

public class CartasYugioh {
    private String nombre;
    private String tipo;
    private String efecto;

    public CartasYugioh(String nombre, String tipo, String efecto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.efecto = efecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
}
