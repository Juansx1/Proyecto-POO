/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entidades.Reserva;
import Entidades.Viaje;
/**
 * 
 *
 * @author fabian lavalle
 */
public class ControlReserva {
    
    public Reserva crearReserva(Viaje viaje){
      Reserva r =new Reserva(viaje);
      return r;
    }
}
