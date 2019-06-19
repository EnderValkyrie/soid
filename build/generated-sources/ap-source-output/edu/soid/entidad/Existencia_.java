package edu.soid.entidad;

import edu.soid.entidad.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T20:47:06")
@StaticMetamodel(Existencia.class)
public class Existencia_ { 

    public static volatile CollectionAttribute<Existencia, Producto> productoCollection;
    public static volatile SingularAttribute<Existencia, Integer> idmaterial;
    public static volatile SingularAttribute<Existencia, String> tipoMaterial;
    public static volatile SingularAttribute<Existencia, String> nombreMaterial;
    public static volatile SingularAttribute<Existencia, String> cantidadMaterial;

}