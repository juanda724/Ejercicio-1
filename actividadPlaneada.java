package com.viaje;

public class actividadPlaneada {
    private final String actividad;
    private final String duracion;

    public actividadPlaneada(String actividad, String duracion){
        this.actividad=actividad;
        this.duracion=duracion;
    }

    public String getActividad() {
        return actividad;
    }

    public String getDuracion() {
        return duracion;
    }
    
    
}
