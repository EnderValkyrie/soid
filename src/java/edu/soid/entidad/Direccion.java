/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.soid.entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author APRENDIZ
 */
@Entity
@Table(name = "direccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d")})
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numero_domicilio")
    private String numeroDomicilio;
    @Basic(optional = false)
    @Column(name = "barrio")
    private String barrio;
    @Basic(optional = false)
    @Column(name = "ciudad")
    private String ciudad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "direccionNumeroDomicilio", fetch = FetchType.LAZY)
    private Collection<Cliente> clienteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "direccionNumeroDomicilio", fetch = FetchType.LAZY)
    private Collection<Pedido> pedidoCollection;

    public Direccion() {
    }

    public Direccion(String numeroDomicilio) {
        this.numeroDomicilio = numeroDomicilio;
    }

    public Direccion(String numeroDomicilio, String barrio, String ciudad) {
        this.numeroDomicilio = numeroDomicilio;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    public String getNumeroDomicilio() {
        return numeroDomicilio;
    }

    public void setNumeroDomicilio(String numeroDomicilio) {
        this.numeroDomicilio = numeroDomicilio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @XmlTransient
    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroDomicilio != null ? numeroDomicilio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.numeroDomicilio == null && other.numeroDomicilio != null) || (this.numeroDomicilio != null && !this.numeroDomicilio.equals(other.numeroDomicilio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.soid.entidad.Direccion[ numeroDomicilio=" + numeroDomicilio + " ]";
    }
    
}
