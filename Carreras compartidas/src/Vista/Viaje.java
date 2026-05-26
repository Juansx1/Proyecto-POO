package Modelo.entidades;

import java.util.ArrayList;

public class Viaje {
    private String origen;
    private String destino;
    private String fecha;
    private double costo;
    private Conductor conductor;

    // lista de pasajeros que quieren unirse (esperando confirmacion)
    private ArrayList<String> pasajerosEnEspera;
    // lista de pasajeros ya confirmados por el conductor
    private ArrayList<String> pasajerosConfirmados;

    public Viaje(String origen, String destino, String fecha, double costo, Conductor conductor) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.costo = costo;
        this.conductor = conductor;
        this.pasajerosEnEspera = new ArrayList<>();
        this.pasajerosConfirmados = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Viaje{" + "origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", costo=" + costo + ", conductor=" + conductor + '}';
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public ArrayList<String> getPasajerosEnEspera() {
        return pasajerosEnEspera;
    }

    public ArrayList<String> getPasajerosConfirmados() {
        return pasajerosConfirmados;
    }
}
