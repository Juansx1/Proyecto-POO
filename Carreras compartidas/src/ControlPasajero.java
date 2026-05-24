/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entidades.Pasajero;
/**
 *
 * @author fabian lavalle
 */
public class ControlPasajero {
    
    public Pasajero crearPasajero(int id,String nombre){
      Pasajero p =new Pasajero(id, nombre);
      return p;
    }
}
