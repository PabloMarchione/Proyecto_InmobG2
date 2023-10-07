/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria_mddp.entidades;

import java.time.LocalDate;

/**
 *
 * @author marti
 */
public class Calquiler {
    
    private int idContrato;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private int precioAlquiler;
    private int estado;
    private Inmueble inmueble;
    private InquilinoMartin inquilino;
    
    //Constructores
    public Calquiler() {
    }

    public Calquiler(LocalDate fechaIni, LocalDate fechaFin, int precioAlquiler, int estado, Inmueble inmueble, InquilinoMartin inquilino) {
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.precioAlquiler = precioAlquiler;
        this.estado = estado;
        this.inmueble = inmueble;
        this.inquilino = inquilino;
    }

    public Calquiler(int idContrato, LocalDate fechaIni, LocalDate fechaFin, int precioAlquiler, int estado, Inmueble inmueble, InquilinoMartin inquilino) {
        this.idContrato = idContrato;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.precioAlquiler = precioAlquiler;
        this.estado = estado;
        this.inmueble = inmueble;
        this.inquilino = inquilino;
    }
    
    //Getters y Setters
    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public InquilinoMartin getInquilino() {
        return inquilino;
    }

    public void setInquilino(InquilinoMartin inquilino) {
        this.inquilino = inquilino;
    }
    
    //toString
    @Override
    public String toString() {
        return "Calquiler{" + "idContrato=" + idContrato + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", precioAlquiler=" + precioAlquiler + ", estado=" + estado + ", inmueble=" + inmueble + ", inquilino=" + inquilino + '}';
    }
    
}
