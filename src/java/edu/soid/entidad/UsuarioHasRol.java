/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.soid.entidad;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author APRENDIZ
 */
@Entity
@Table(name = "usuario_has_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioHasRol.findAll", query = "SELECT u FROM UsuarioHasRol u")})
public class UsuarioHasRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioHasRolPK usuarioHasRolPK;
    @JoinColumn(name = "Rol_idRol", referencedColumnName = "idRol", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rol rol;
    @JoinColumn(name = "cotizacion_idcotizacion", referencedColumnName = "idcotizacion")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cotizacion cotizacionIdcotizacion;
    @JoinColumn(name = "usuario_Id_usuario", referencedColumnName = "Id_usuario", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;

    public UsuarioHasRol() {
    }

    public UsuarioHasRol(UsuarioHasRolPK usuarioHasRolPK) {
        this.usuarioHasRolPK = usuarioHasRolPK;
    }

    public UsuarioHasRol(int usuarioIdusuario, int rolidRol, String fechaCapacitacion) {
        this.usuarioHasRolPK = new UsuarioHasRolPK(usuarioIdusuario, rolidRol, fechaCapacitacion);
    }

    public UsuarioHasRolPK getUsuarioHasRolPK() {
        return usuarioHasRolPK;
    }

    public void setUsuarioHasRolPK(UsuarioHasRolPK usuarioHasRolPK) {
        this.usuarioHasRolPK = usuarioHasRolPK;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Cotizacion getCotizacionIdcotizacion() {
        return cotizacionIdcotizacion;
    }

    public void setCotizacionIdcotizacion(Cotizacion cotizacionIdcotizacion) {
        this.cotizacionIdcotizacion = cotizacionIdcotizacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioHasRolPK != null ? usuarioHasRolPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioHasRol)) {
            return false;
        }
        UsuarioHasRol other = (UsuarioHasRol) object;
        if ((this.usuarioHasRolPK == null && other.usuarioHasRolPK != null) || (this.usuarioHasRolPK != null && !this.usuarioHasRolPK.equals(other.usuarioHasRolPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.soid.entidad.UsuarioHasRol[ usuarioHasRolPK=" + usuarioHasRolPK + " ]";
    }
    
}
