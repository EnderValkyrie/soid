/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.soid.facade;

import edu.soid.entidad.Existencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author APRENDIZ
 */
@Local
public interface ExistenciaFacadeLocal {

    void create(Existencia existencia);

    void edit(Existencia existencia);

    void remove(Existencia existencia);

    Existencia find(Object id);

    List<Existencia> findAll();

    List<Existencia> findRange(int[] range);

    int count();
    
}
