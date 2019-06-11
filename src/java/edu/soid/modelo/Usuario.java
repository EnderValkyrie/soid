package edu.soid.modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombres = "";
    private String apellidos = "";
    private String usuario = "";
    private String contrasenia = "";
    private String correo = "";
    private List<Rol> rolUsuario = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String usuario, String clave, String correo, List<Rol> rolesUsuario) {
        this.nombres = nombre;
        this.apellidos = apellido;
        this.usuario = usuario;
        this.contrasenia = clave;
        this.correo = correo;
        this.rolUsuario.addAll(rolesUsuario);
    }

    public List<Rol> getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(List<Rol> rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
