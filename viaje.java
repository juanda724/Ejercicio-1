package com.viaje;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;


public class viaje {
    private LocalDate fechaSalida;
    private final String duracion;
    private final String destino;
    private final Collection<actividadPlaneada> actividadesPlaneadas;
    private TipoAlojamiento tipoAlojamiento;
    private PreferenciaTransporte preferenciaTransporte;

    public viaje(LocalDate fechaSalida, String duracion, String destino, TipoAlojamiento tipoAlojamiento, PreferenciaTransporte preferenciaTransporte){
        this.destino=destino;
        this.fechaSalida=fechaSalida;
        this.duracion=duracion;
        this.actividadesPlaneadas = new LinkedList<>();
        this.tipoAlojamiento=tipoAlojamiento;
        this.preferenciaTransporte=preferenciaTransporte;

    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getDestino() {
        return destino;
    }

    public Collection<actividadPlaneada> getActividadesPlaneadas() {
        return actividadesPlaneadas;
    }

    public TipoAlojamiento getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(TipoAlojamiento tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public PreferenciaTransporte getPreferenciaTransporte() {
        return preferenciaTransporte;
    }

    public void setPreferenciaTransporte(PreferenciaTransporte preferenciaTransporte) {
        this.preferenciaTransporte = preferenciaTransporte;
    }
    

    
}
 