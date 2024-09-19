package ar.edu.IES6.Informatica.Punto04.Model;

import java.time.LocalDate;

//import java.util.Date;//fecha

import ar.edu.IES6.Informatica.Punto01.Model.Producto;

public class Compra {
	//atributo
	private String codigo;
    //private Date fechaCompra;
    private LocalDate fechaCompra;
    private Producto producto;
    private int cantidad;
    
    //Constructor
    public Compra(String jcodigo, LocalDate jfechaCompra, Producto jproducto, int jcantidad) {
        this.codigo = jcodigo;
        this.fechaCompra = jfechaCompra;
        this.producto = jproducto;
        this.cantidad = jcantidad;
    }

    public void imprimirRecibo() {
        double precioTotal = producto.getPrecio() * cantidad;
        System.out.println("/////////// Recibo de Compra //////////////");
        System.out.println("Código de compra: " + codigo);
        System.out.println("Fecha de compra: " + fechaCompra);
        System.out.println("Producto: " + producto.getDescripcion());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $ " + producto.getPrecio());
        System.out.println("Precio total: $ " + precioTotal);
        System.out.println("--------------------------------");
    }
    
    // Getters y setters 
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

    
    
}
