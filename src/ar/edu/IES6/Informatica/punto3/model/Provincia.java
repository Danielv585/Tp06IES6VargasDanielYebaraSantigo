package ar.edu.IES6.Informatica.punto3.model;

import ar.edu.IES6.Informatica.punto3.util.Region;

public class Provincia {
	private int identificador;
    private String nombre;
    private Region region;
    private int poblacion;
    private double superficie;
    private boolean estado;

    public Provincia(int identificador, String nombre, Region region, int poblacion, double superficie, boolean estado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.region = region;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.estado = estado;
    }

    public double calcularDensidadPoblacional() {
        return this.poblacion / this.superficie;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public Region getRegion() {
        return region;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean isEstado() {
        return estado;
    }

    public String toString() {
        return "Provincia{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", region=" + region +
                ", poblacion=" + poblacion +
                ", superficie=" + superficie +
                ", estado=" + estado +
                ", densidad poblacional=" + calcularDensidadPoblacional() +
                '}';
    }
}
