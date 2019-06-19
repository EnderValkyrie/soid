package edu.soid.entidad;

import edu.soid.entidad.Cotizacion;
import edu.soid.entidad.Direccion;
import edu.soid.entidad.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T20:47:06")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Date> fechaSolicitud;
    public static volatile SingularAttribute<Pedido, Direccion> direccionNumeroDomicilio;
    public static volatile SingularAttribute<Pedido, Integer> idpedido;
    public static volatile SingularAttribute<Pedido, Cotizacion> cotizacionIdcotizacion;
    public static volatile CollectionAttribute<Pedido, Producto> productoCollection;
    public static volatile SingularAttribute<Pedido, Date> fechaDespacho;

}