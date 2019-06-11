/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.soid.controlador;

import edu.soid.modelo.Rol;
import edu.soid.modelo.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author EnderValkyrie
 */
@Named(value = "validacion")
@SessionScoped
public class validacion implements Serializable {

    private String nombres;
    private String apellidos;
    private String correo;
    private String ndocumento;
    private String telefono;
    private String direccion;
    private String usuario;
    private String contrasenia;
    private List<Usuario> listaUsuario = new ArrayList();

    public validacion() {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNdocumento() {
        return ndocumento;
    }

    public void setNdocumento(String ndocumento) {
        this.ndocumento = ndocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public String validarIngreso() {
        if ((usuario.equals("soid")) && (contrasenia.equals("123"))) {
            return "admin/index.xhtml?faces-redirect=true";
        }
        FacesMessage inforMessagge = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario no existe", null);
        FacesContext.getCurrentInstance().addMessage("mensajeNoExisteUser", inforMessagge);

        return "";
    }


}
