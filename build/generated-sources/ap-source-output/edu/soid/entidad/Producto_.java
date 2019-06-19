package edu.soid.entidad;

import edu.soid.entidad.Existencia;
import edu.soid.entidad.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T20:47:06")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile CollectionAttribute<Producto, Existencia> existenciaCollection;
    public static volatile SingularAttribute<Producto, Integer> codProducto;
    public static volatile SingularAttribute<Producto, Double> precio;
    public static volatile SingularAttribute<Producto, String> tipoProducto;
    public static volatile SingularAttribute<Producto, Integer> cantidad;
    public static volatile SingularAttribute<Producto, String> nombreProducto;
    public static volatile SingularAttribute<Producto, Pedido> pedidoIdpedido;

}