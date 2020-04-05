package com.olmedo.laboratorio2.controller;

public class User {
    private String nombre;
    private String contrasennia;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getContrasennia(){
        return contrasennia;
    }
    public void setContrasennia(String contraseña){
        this.contrasennia=contraseña;
    }
}
