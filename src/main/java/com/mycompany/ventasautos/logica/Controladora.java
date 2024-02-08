package com.mycompany.ventasautos.logica;

import com.mycompany.ventasautos.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controladora = new ControladoraPersistencia();
   
    public void guardar(String modelo, String marca, String motor, String color, String patente, int puerta) {
        Auto auto = new Auto();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(puerta);
               
        controladora.guardar(auto);
    }

    public List<Auto> cargarDatos() {
        return controladora.cargarDatos();
    }

    public void borrarAutos(int id_auto) {
        controladora.borrarAutos(id_auto);
    }

    public Auto traerAuto(int id_auto) {
        return controladora.traerAuto(id_auto);
    }

    public void modificarAuto(Auto auto,String modelo, String marca, String motor, String color, String patente, int puerta) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(puerta);
               
        controladora.modificarAuto(auto);
    }
    
}
