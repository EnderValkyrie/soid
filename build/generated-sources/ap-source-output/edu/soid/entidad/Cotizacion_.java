package edu.soid.entidad;

import edu.soid.entidad.Pedido;
import edu.soid.entidad.Vendedor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T20:47:06")
@StaticMetamodel(Cotizacion.class)
public class Cotizacion_ { 

    public static volatile SingularAttribute<Cotizacion, Date> fecha;
    public static volatile SingularAttribute<Cotizacion, Double> precio;
    public static volatile SingularAttribute<Cotizacion, Vendedor> vendedorCodVendedor;
    public static volatile SingularAttribute<Cotizacion, Integer> idcotizacion;
    public static volatile CollectionAttribute<Cotizacion, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Cotizacion, String> formaPago;

}