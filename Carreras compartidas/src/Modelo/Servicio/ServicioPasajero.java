/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicio;
import Modelo.Persistencia.DaoPasajero;
import Modelo.entidades.Pasajero;
import java.io.IOException;


/**
 *
 * @author sebas
 */
public class ServicioPasajero {
    
    DaoPasajero dao=new DaoPasajero();
    
    public boolean guardar(int id,String nombre){
            try{
                Pasajero libro=new Pasajero(id,nombre);
                dao.guardar(libro);
                return true;
            } catch (IOException ex) {
                System.out.println(" "+ex.getMessage()); 
            } catch (ClassNotFoundException ex) {
                System.out.println(" "+ex.getMessage());
            }
            return false;
        }
    
}
