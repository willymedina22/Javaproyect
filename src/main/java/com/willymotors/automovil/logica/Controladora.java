
package com.willymotors.automovil.logica;

import com.willymotors.automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String placa, int cantPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPlaca(placa);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil (auto);
        
        
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }


    public void borrarAuto(int idAuto) {
         controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAutos(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, 
            String marca, String motor, String color, String placa, int cantPuertas) {
        auto.setModelo(modelo);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPlaca(placa);
        auto.setCantPuertas(cantPuertas);
        
        //le pido a la persistencia que modifique
        controlPersis.modificarAuto(auto);
        
    }
    
}
