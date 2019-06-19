package edu.soid.entidad;

import edu.soid.entidad.Cliente;
import edu.soid.entidad.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T20:47:06")
@StaticMetamodel(Direccion.class)
public class Direccion_ { 

    public static volatile SingularAttribute<Direccion, String> barrio;
    public static volatile SingularAttribute<Direccion, String> numeroDomicilio;
    public static volatile SingularAttribute<Direccion, String> ciudad;
    public static volatile CollectionAttribute<Direccion, Pedido> pedidoCollection;
    public static volatile CollectionAttribute<Direccion, Cliente> clienteCollection;

}