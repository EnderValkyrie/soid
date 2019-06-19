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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author APRENDIZ
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpedido")
    private Integer idpedido;
    @Basic(optional = false)
    @Column(name = "fecha_solicitud")
    @Temporal(TemporalType.DATE)
    private Date fechaSolicitud;
    @Basic(optional = false)
    @Column(name = "fecha_despacho")
    @Temporal(TemporalType.DATE)
    private Date fechaDespacho;
    @JoinColumn(name = "cotizacion_idcotizacion", referencedColumnName = "idcotizacion")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cotizacion cotizacionIdcotizacion;
    @JoinColumn(name = "direccion_numero_domicilio", referencedColumnName = "numero_domicilio")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Direccion direccionNumeroDomicilio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoIdpedido", fetch = FetchType.LAZY)
    private Collection<Producto> productoCollection;

    public Pedido() {
    }

    public Pedido(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public Pedido(Integer idpedido, Date fechaSolicitud, Date fechaDespacho) {
        this.idpedido = idpedido;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaDespacho = fechaDespacho;
    }

    public Integer getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(Date fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public Cotizacion getCotizacionIdcotizacion() {
        return cotizacionIdcotizacion;
    }

    public void setCotizacionIdcotizacion(Cotizacion cotizacionIdcotizacion) {
        this.cotizacionIdcotizacion = cotizacionIdcotizacion;
    }

    public Direccion getDireccionNumeroDomicilio() {
        return direccionNumeroDomicilio;
    }

    public void setDireccionNumeroDomicilio(Direccion direccionNumeroDomicilio) {
        this.direccionNumeroDomicilio = direccionNumeroDomicilio;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpedido != null ? idpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idpedido == null && other.idpedido != null) || (this.idpedido != null && !this.idpedido.equals(other.idpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.soid.entidad.Pedido[ idpedido=" + idpedido + " ]";
    }
    
}
