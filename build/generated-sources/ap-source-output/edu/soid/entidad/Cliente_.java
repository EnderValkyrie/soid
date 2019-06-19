package edu.soid.entidad;

import edu.soid.entidad.Direccion;
import edu.soid.entidad.Persona;
import edu.soid.entidad.Tipodocumento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T20:47:06")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Direccion> direccionNumeroDomicilio;
    public static volatile SingularAttribute<Cliente, Date> fechaNacimiento;
    public static volatile SingularAttribute<Cliente, Integer> identificacion;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;
    public static volatile SingularAttribute<Cliente, Persona> personaId;
    public static volatile SingularAttribute<Cliente, Tipodocumento> tipodocumentoNumero;

}