
package com.jc.elementos.controller;

public class Direccion {
   private String calle;
   private long cp;
   private String colonia;
   private String estado;

    public Direccion() {
    }

    public Direccion(String calle, long cp, String colonia, String estado) {
        this.calle = calle;
        this.cp = cp;
        this.colonia = colonia;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", cp=" + cp + ", colonia=" + colonia + ", estado=" + estado + '}';
    }
}
