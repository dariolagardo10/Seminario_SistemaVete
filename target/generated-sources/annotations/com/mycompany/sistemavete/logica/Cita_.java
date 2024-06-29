package com.mycompany.sistemavete.logica;

import com.mycompany.sistemavete.logica.Mascota;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-24T19:59:18", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, LocalDateTime> fechaCita;
    public static volatile SingularAttribute<Cita, Mascota> mascota;
    public static volatile SingularAttribute<Cita, Integer> id;

}