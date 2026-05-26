/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Persistencia;
import Modelo.entidades.Conductor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class DaoConductor {
    
    private String archivo="conductor.dat";
     
     public boolean guardar(Conductor ve) throws FileNotFoundException, IOException, ClassNotFoundException{
        // aqui se guarda
        List<Conductor> lista= listar();
        lista.add(ve);
        FileOutputStream file=new FileOutputStream(archivo);
        ObjectOutputStream fil=new ObjectOutputStream(file);
        fil.writeObject(lista);
        fil.close();
        file.close();
        return true;
     }
     
        public boolean borrar(int id) throws IOException, ClassNotFoundException{
        List<Conductor> lista = listar();
        for (Conductor vei : lista) {
            if(vei.getId() == id){
                lista.remove(vei);
                break;
            }
        }
        FileOutputStream file=new FileOutputStream(archivo);
        ObjectOutputStream fil=new ObjectOutputStream(file);
        fil.writeObject(lista);
        fil.close();
        file.close();
        return true;
    }
        
        
         public List<Conductor> listar() throws IOException, ClassNotFoundException {
        List<Conductor> lista=new ArrayList<>();
        FileInputStream file;
        try {
            file = new FileInputStream(archivo);
            ObjectInputStream entrada=new ObjectInputStream(file);
            lista= (List<Conductor>) entrada.readObject();
            
        } catch (FileNotFoundException ex) {
            System.out.println(" No xiste archivo ");
        }
        return lista;
        
        
    }
    
}
