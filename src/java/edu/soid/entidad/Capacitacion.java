/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.soid.entidad;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author APRENDIZ
 */
@Entity
@Table(name = "capacitacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Capacitacion.findAll", query = "SELECT c FROM Capacitacion c")})
public class Capacitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcapacitacion")
    private Integer idcapacitacion;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @JoinTable(name = "personal rh", joinColumns = {
        @JoinColumn(name = "capacitacion_idcapacitacion", referencedColumnName = "idcapacitacion")}, inverseJoinColumns = {
        @JoinColumn(name = "persona_Id", referencedColumnName = "Id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Persona> personaCollection;

    public Capacitacion() {
    }

    public Capacitacion(Integer idcapacitacion) {
        this.idcapacitacion = idcapacitacion;
    }

    public Capacitacion(Integer idcapacitacion, Date fecha, Date hora) {
        this.idcapacitacion = idcapacitacion;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Integer getIdcapacitacion() {
        return idcapacitacion;
    }

    public void setIdcapacitacion(Integer idcapacitacion) {
        this.idcapacitacion = idcapacitacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @XmlTransient
    public Collection<Persona> getPersonaCollection() {
        return personaCollection;
    }

    public void setPersonaCollection(Collection<Persona> personaCollection) {
        this.personaCollection = personaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcapacitacion != null ? idcapacitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Capacitacion)) {
            return false;
        }
        Capacitacion other = (Capacitacion) object;
        if ((this.idcapacitacion == null && other.idcapacitacion != null) || (this.idcapacitacion != null && !this.idcapacitacion.equals(other.idcapacitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.soid.entidad.Capacitacion[ idcapacitacion=" + idcapacitacion + " ]";
    }
    
}
