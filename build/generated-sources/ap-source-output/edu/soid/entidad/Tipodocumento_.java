package edu.soid.entidad;

import edu.soid.entidad.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T20:47:06")
@StaticMetamodel(Tipodocumento.class)
public class Tipodocumento_ { 

    public static volatile SingularAttribute<Tipodocumento, Integer> numero;
    public static volatile SingularAttribute<Tipodocumento, String> tipodocumento;
    public static volatile CollectionAttribute<Tipodocumento, Cliente> clienteCollection;

}