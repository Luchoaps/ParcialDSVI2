package com;

public class Usuarios {

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    private String Nombre;
    private String Cedula;

    private String Usuario;
    private String Contrasena;

    public Usuarios(String nombre) {
        Nombre = nombre;
    }
    public Usuarios(String nombre, String cedula, String usuario, String contrasena) {
        Nombre = nombre;
        Cedula = cedula;
        Usuario = usuario;
        Contrasena = contrasena;
    }



}
