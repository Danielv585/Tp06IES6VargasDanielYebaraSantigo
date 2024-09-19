package ar.edu.IES6.Informatica.Punto01.Model;

import ar.edu.IES6.Informatica.Punto01.Util.Categoria;

import ar.edu.IES6.Informatica.Punto01.Util.OrigenFabricacion;

public class Producto {
	private String codigo;
	private String descripcion;
	private double precio;
	private OrigenFabricacion origen;
	private Categoria categoria;
	
	
	//metodo accesore Getter devolver valor
	public String getCodigo() {
		return codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public OrigenFabricacion getOrigen() {
		return origen;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	
	//metodo accesore Set modificar valor
	public void setCodigo(String pCodigo) {
		this.codigo=pCodigo;
	}
	public void setDescripcion(String pDescripcion) {
		this.descripcion=pDescripcion;
		
	}
	public void setPrecio(double pPrecio) {
		this.precio=pPrecio;
	}
	public void setOrigen(OrigenFabricacion pOrigen) {
		this.origen=pOrigen;
	}
	public void setCategoria(Categoria pCategoria) {
		this.categoria=pCategoria;
	}
	//Constructor sin Parametro
	public Producto() {
		//this.origen="Jujuy";
	}
	//Constructor Con Parametro
	public Producto(String xCodigo,String xDescripcion, double xPrecio,OrigenFabricacion xOrigen,Categoria xCategoria) {
		this.codigo=xCodigo;
		this.descripcion=xDescripcion;
		this.precio=xPrecio;
		this.origen=xOrigen;
		this.categoria=xCategoria;
	}
	//metodo mostrar
	 @Override
	    public String toString() {
	        return "Producto{" +
	                "codigo= " + codigo +
	                ", descripcion= '" + descripcion + '\'' +
	                ", precioUnitario=  " + precio +
	                ", origenFabricacion=" + origen +
	                ", categoria=" + categoria +
	                '}';
	    }

}