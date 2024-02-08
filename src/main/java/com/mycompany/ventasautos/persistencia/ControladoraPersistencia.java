package com.mycompany.ventasautos.persistencia;

import com.mycompany.ventasautos.logica.Auto;
import com.mycompany.ventasautos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AutoJpaController autoController = new AutoJpaController();
    
    public void guardar(Auto auto) {
        autoController.create(auto);
    }

    public List<Auto> cargarDatos() {
        return autoController.findAutoEntities();
    }

    public void borrarAutos(int id_auto) {
        try {
            autoController.destroy(id_auto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Auto traerAuto(int id_auto) {
        return autoController.findAuto(id_auto);
    }

    public void modificarAuto(Auto auto) {
        try {
            autoController.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
