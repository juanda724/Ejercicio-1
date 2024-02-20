package com.viaje;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class viaje {
    private LocalDateTime fechaSalida;
    private final String duracion;
    private final String destino;
    private final Collection<actividadPlaneada> actividadesPlaneadas;
    private TipoAlojamiento tipoAlojamiento;
    private PreferenciaTransporte preferenciaTransporte;

    public viaje(LocalDateTime fechaSalida, String duracion, String destino, TipoAlojamiento tipoAlojamiento, PreferenciaTransporte preferenciaTransporte){
        this.destino=destino;
        this.fechaSalida=fechaSalida;
        this.duracion=duracion;
        this.actividadesPlaneadas = new LinkedList<>();
        this.tipoAlojamiento=tipoAlojamiento;
        this.preferenciaTransporte=preferenciaTransporte;

    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
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

    public static viajeBuilder builder(){
        return new viajeBuilder();
    }

    public static class viajeBuilder{

        private LocalDateTime fechaSalida;
        private String duracion;
        private TipoAlojamiento tipoAlojamiento;
        private PreferenciaTransporte preferenciaTransporte;
        private Collection<actividadPlaneada> actividadesPlaneadas;
        private String destino;

        private viajeBuilder(){}

        public viajeBuilder fechaSalida(LocalDateTime fechaSalida) {
            this.fechaSalida = fechaSalida;
            return this;
        }
    
        public viajeBuilder destino(String destino) {
            this.destino = destino;
            return this;
        }

        public viajeBuilder duracion(String duracion) {
            this.duracion = duracion;
            return this;
        }

        public viajeBuilder tipoAlojamiento(TipoAlojamiento tipoAlojamiento) {
            this.tipoAlojamiento = tipoAlojamiento;
            return this;
        }

        public viajeBuilder PreferenciaTransporte(PreferenciaTransporte preferenciaTransporte) {
            this.preferenciaTransporte = preferenciaTransporte;
            return this;
        }

        public viajeBuilder actividadesPlaneadas(Collection<actividadPlaneada> actividadesPlaneadas) {
            this.actividadesPlaneadas = actividadesPlaneadas;
            return this;
        }        

        public viaje build(){
            return new viaje(fechaSalida, duracion, destino, tipoAlojamiento, preferenciaTransporte, actividadesPlaneadas);
        }
    
    }

}
 