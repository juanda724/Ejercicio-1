package com.viaje;

import java.time.LocalDateTime;
import java.util.List;
import java.util.LinkedList;

// Ejemplo de uso del patrón Builder
public class EjemploViaje {

    public static void main(String[] args) {

        // Crear una reserva de viaje con solo la fecha de salida y duracion
    viaje reserva1 =viaje.builder()
                .fechaSalida(LocalDateTime.of(2024, 4, 3, 9, 30))
                .duracion(7)
                .destino("México")
                .build();

        // Crear una reserva de viaje con detalles personalizados
        viaje reserva2 = viaje.builder()
                .fechaSalida(LocalDateTime.of(2024, 4, 3, 9, 30))
                .duracion(10)
                .destino("Canada")
                .tipoAlojamiento(TipoAlojamiento.HOTEL)
                .preferenciaTransporte(PreferenciaTransporte.AVION)
                .actividadesPlaneadas(new LinkedList<>())
                .dietaEspecial("Vegetariana")
                .build();

        // Realizar operaciones con las instancias de reserva de viaje creadas
        System.out.println("Reserva 1: " + reserva1.getFechaSalida() +", Destino: " + reserva1.getDestino() + ", Duración: " + reserva1.getDuracion());
        System.out.println("Reserva 2: " + reserva2.getFechaSalida() + ", Duración: " + reserva2.getDuracion() +", Destino: " + reserva2.getDestino() + " días" + ", Transporte: " + reserva2.getPreferenciaTransporte() + ", Alojamiento: " + reserva2.getTipoAlojamiento() + ", Tipo de dieta: " + reserva2.getDieta());
    }
}