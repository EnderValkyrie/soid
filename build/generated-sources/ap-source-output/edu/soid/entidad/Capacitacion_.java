package edu.soid.entidad;

import edu.soid.entidad.Persona;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T20:47:06")
@StaticMetamodel(Capacitacion.class)
public class Capacitacion_ { 

    public static volatile SingularAttribute<Capacitacion, Date> fecha;
    public static volatile CollectionAttribute<Capacitacion, Persona> personaCollection;
    public static volatile SingularAttribute<Capacitacion, Date> hora;
    public static volatile SingularAttribute<Capacitacion, Integer> idcapacitacion;

}