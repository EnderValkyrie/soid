/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.soid.entidad;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author APRENDIZ
 */
@Entity
@Table(name = "existencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Existencia.findAll", query = "SELECT e FROM Existencia e")})
public class Existencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmaterial")
    private Integer idmaterial;
    @Basic(optional = false)
    @Column(name = "nombre_material")
    private String nombreMaterial;
    @Basic(optional = false)
    @Column(name = "tipo_material")
    private String tipoMaterial;
    @Basic(optional = false)
    @Column(name = "cantidad_material")
    private String cantidadMaterial;
    @JoinTable(name = "producto_existencia", joinColumns = {
        @JoinColumn(name = "existencia_idmaterial", referencedColumnName = "idmaterial")}, inverseJoinColumns = {
        @JoinColumn(name = "producto_cod_producto", referencedColumnName = "cod_producto")})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Producto> productoCollection;
    @JoinTable(name = "existencia_has_producto", joinColumns = {
        @JoinColumn(name = "existencia_idmaterial", referencedColumnName = "idmaterial")}, inverseJoinColumns = {
        @JoinColumn(name = "producto_cod_producto", referencedColumnName = "cod_producto")})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Producto> productoCollection1;

    public Existencia() {
    }

    public Existencia(Integer idmaterial) {
        this.idmaterial = idmaterial;
    }

    public Existencia(Integer idmaterial, String nombreMaterial, String tipoMaterial, String cantidadMaterial) {
        this.idmaterial = idmaterial;
        this.nombreMaterial = nombreMaterial;
        this.tipoMaterial = tipoMaterial;
        this.cantidadMaterial = cantidadMaterial;
    }

    public Integer getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(Integer idmaterial) {
        this.idmaterial = idmaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getCantidadMaterial() {
        return cantidadMaterial;
    }

    public void setCantidadMaterial(String cantidadMaterial) {
        this.cantidadMaterial = cantidadMaterial;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection1() {
        return productoCollection1;
    }

    public void setProductoCollection1(Collection<Producto> productoCollection1) {
        this.productoCollection1 = productoCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmaterial != null ? idmaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Existencia)) {
            return false;
        }
        Existencia other = (Existencia) object;
        if ((this.idmaterial == null && other.idmaterial != null) || (this.idmaterial != null && !this.idmaterial.equals(other.idmaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.soid.entidad.Existencia[ idmaterial=" + idmaterial + " ]";
    }
    
}
