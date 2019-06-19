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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "vendedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendedor.findAll", query = "SELECT v FROM Vendedor v")})
public class Vendedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_vendedor")
    private Integer codVendedor;
    @JoinColumn(name = "persona_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Persona personaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendedorCodVendedor", fetch = FetchType.LAZY)
    private Collection<Cotizacion> cotizacionCollection;

    public Vendedor() {
    }

    public Vendedor(Integer codVendedor) {
        this.codVendedor = codVendedor;
    }

    public Integer getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(Integer codVendedor) {
        this.codVendedor = codVendedor;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    @XmlTransient
    public Collection<Cotizacion> getCotizacionCollection() {
        return cotizacionCollection;
    }

    public void setCotizacionCollection(Collection<Cotizacion> cotizacionCollection) {
        this.cotizacionCollection = cotizacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVendedor != null ? codVendedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendedor)) {
            return false;
        }
        Vendedor other = (Vendedor) object;
        if ((this.codVendedor == null && other.codVendedor != null) || (this.codVendedor != null && !this.codVendedor.equals(other.codVendedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.soid.entidad.Vendedor[ codVendedor=" + codVendedor + " ]";
    }
    
}
