package edu.soid.entidad;

import edu.soid.entidad.Cotizacion;
import edu.soid.entidad.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T20:47:06")
@StaticMetamodel(Vendedor.class)
public class Vendedor_ { 

    public static volatile CollectionAttribute<Vendedor, Cotizacion> cotizacionCollection;
    public static volatile SingularAttribute<Vendedor, Integer> codVendedor;
    public static volatile SingularAttribute<Vendedor, Persona> personaId;

}