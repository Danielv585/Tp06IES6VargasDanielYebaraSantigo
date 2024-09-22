package ar.edu.IES6.Informatica.punto2.model;

import ar.edu.IES6.Informatica.punto2.util.Mes;

public class Efemeride {
	private int código;
	private String nombre;
	private Mes mes;
	private int dia;
	private String detalle;
		
	
	public Efemeride(int código, String nombre, Mes mes, int dia, String detalle) {
		this.código = código;
		this.nombre = nombre;
		this.mes = mes;
		this.dia = dia;
		this.detalle = detalle;
	}

	public int getCódigo() {
		return código;
	}

	public void setCódigo(int código) {
		this.código = código;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDía(int día) {
		this.dia = día;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Día: " + this.dia);
        System.out.println("Mes: " + this.mes);
        System.out.println("Detalle: " + this.detalle);
        System.out.println();
    }
}
