package edu.soid.entidad;

import edu.soid.entidad.Capacitacion;
import edu.soid.entidad.Cliente;
import edu.soid.entidad.Vendedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T20:47:06")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile CollectionAttribute<Persona, Capacitacion> capacitacionCollection;
    public static volatile SingularAttribute<Persona, String> correo;
    public static volatile SingularAttribute<Persona, Integer> id;
    public static volatile SingularAttribute<Persona, Integer> telefono;
    public static volatile SingularAttribute<Persona, String> nombres;
    public static volatile CollectionAttribute<Persona, Cliente> clienteCollection;
    public static volatile CollectionAttribute<Persona, Vendedor> vendedorCollection;

}