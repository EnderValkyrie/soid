/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.soid.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author APRENDIZ
 */
@Embeddable
public class UsuarioHasRolPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "usuario_Id_usuario")
    private int usuarioIdusuario;
    @Basic(optional = false)
    @Column(name = "Rol_idRol")
    private int rolidRol;
    @Basic(optional = false)
    @Column(name = "fecha_capacitacion")
    private String fechaCapacitacion;

    public UsuarioHasRolPK() {
    }

    public UsuarioHasRolPK(int usuarioIdusuario, int rolidRol, String fechaCapacitacion) {
        this.usuarioIdusuario = usuarioIdusuario;
        this.rolidRol = rolidRol;
        this.fechaCapacitacion = fechaCapacitacion;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getRolidRol() {
        return rolidRol;
    }

    public void setRolidRol(int rolidRol) {
        this.rolidRol = rolidRol;
    }

    public String getFechaCapacitacion() {
        return fechaCapacitacion;
    }

    public void setFechaCapacitacion(String fechaCapacitacion) {
        this.fechaCapacitacion = fechaCapacitacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) usuarioIdusuario;
        hash += (int) rolidRol;
        hash += (fechaCapacitacion != null ? fechaCapacitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioHasRolPK)) {
            return false;
        }
        UsuarioHasRolPK other = (UsuarioHasRolPK) object;
        if (this.usuarioIdusuario != other.usuarioIdusuario) {
            return false;
        }
        if (this.rolidRol != other.rolidRol) {
            return false;
        }
        if ((this.fechaCapacitacion == null && other.fechaCapacitacion != null) || (this.fechaCapacitacion != null && !this.fechaCapacitacion.equals(other.fechaCapacitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.soid.entidad.UsuarioHasRolPK[ usuarioIdusuario=" + usuarioIdusuario + ", rolidRol=" + rolidRol + ", fechaCapacitacion=" + fechaCapacitacion + " ]";
    }
    
}
