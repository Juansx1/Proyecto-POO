package Modelo.entidades;

import java.util.ArrayList;

public class Pasajero extends Usuario {

    private ArrayList<Reserva> reservas;

    public Pasajero(int id, String nombre) {
        super(id, nombre);
        this.reservas = new ArrayList();
    }

    @Override
    public String toString() {
        return "Pasajero{" + "reservas=" + reservas + '}';
    }

    public void reservarViaje(Viaje v) {
        Reserva r = new Reserva(v);
        reservas.add(r);
        System.out.println("reserva hecha");
    }

    public void pagarReserva(int posicion) {
        reservas.get(posicion).setEsPago(true);
        System.out.println("pago hecho");
    }

    public void verReserva() {
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    @Override
    public void mostrarRol() {
        System.out.println("soy un pasajero");
    }

    // getter necesario para que la vista pueda mostrar las reservas
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}
