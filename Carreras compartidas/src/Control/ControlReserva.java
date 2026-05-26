/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entidades.Pasajero;
import Entidades.Reserva;
import Entidades.Viaje;
/**
 * 
 *
 * @author fabian lavalle
 */
public class ControlReserva {
    
    public Reserva crearReserva(Viaje viaje,Pasajero pas){
      Reserva r =new Reserva(viaje,pas);
      return r;
    }
}
