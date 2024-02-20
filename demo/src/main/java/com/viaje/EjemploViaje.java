package com.viaje;

import java.time.LocalDateTime;
import java.util.List;
import java.util.LinkedList;

// Ejemplo de uso del patrón Builder
public class EjemploViaje {

    public static void main(String[] args) {

        // Crear una reserva de viaje con solo la fecha de salida y destino
    viaje reserva1 =viaje.builder()
                .fechaSalida(LocalDateTime.of(2024, 4, 3, 9, 30))
                .duracion(7)
                .build();

        // Crear una reserva de viaje con detalles personalizados
        viaje reserva2 = viaje.builder()
                .fechaSalida(LocalDateTime.of(2024, 4, 3, 9, 30))
                .duracion(10)
                .tipoAlojamiento(TipoAlojamiento.HOTEL)
                .preferenciaTransporte(PreferenciaTransporte.AVION)
                .actividadesPlaneadas(new LinkedList<>())
                .dietaEspecial("Caviar")
                .build();

        // Realizar operaciones con las instancias de reserva de viaje creadas
        System.out.println("Reserva 1: " + reserva1.getFechaSalida());
        System.out.println("Reserva 2: " + reserva2.getFechaSalida() + ", Duración: " + reserva2.getDuracion() + " días");
    }
}