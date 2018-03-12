package com.dext.cl;

public class Computadora {
    String serie,marca;
    Empleado responsable;

    public Computadora(String serie, String marca, Empleado responsable) {
        this.serie = serie;
        this.marca = marca;
        this.responsable = responsable;
    }

    public Computadora(String serie, String marca) {
        this.serie = serie;
        this.marca = marca;
    }

    public Computadora() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }
    public String getNombreResponsable(){
        return responsable.getNombre();
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "serie='" + serie + '\'' +
                ", marca='" + marca + '\'' +
                ", responsable=" + responsable +
                '}';
    }
}
