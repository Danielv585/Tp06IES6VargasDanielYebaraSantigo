package ar.edu.IES6.Informatica.Punto04.Main;

import java.util.ArrayList;
//import java.util.Date;
import java.time.LocalDate;

import ar.edu.IES6.Informatica.Punto01.Model.Producto;
import ar.edu.IES6.Informatica.Punto01.Util.Categoria;
import ar.edu.IES6.Informatica.Punto01.Util.OrigenFabricacion;
import ar.edu.IES6.Informatica.Punto04.Model.Compra;

public class Main {

	public static void main(String[] args) {
		//Lista Array lis comienza desde 0
		ArrayList<Producto> productos = new ArrayList<>();

        // Cargar 10 productos
        productos.add(new Producto("P001", "Smartphone", 500000.0, OrigenFabricacion.CHINA, Categoria.TELEFONIA));
        productos.add(new Producto("P002", "Laptop", 1000000.0, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA));
        productos.add(new Producto("P003", "Lavadora", 8000000.0, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
        productos.add(new Producto("P004", "Taladro", 150000.0, OrigenFabricacion.URUGUAY, Categoria.HERRAMIENTAS));
        productos.add(new Producto("P005", "Televisor", 120000.0, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR));
        productos.add(new Producto("P006", "Mouse", 8500.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
        productos.add(new Producto("P007", "Aspiradora", 300000.0, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
        productos.add(new Producto("P008", "Cámara", 450000.0, OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA));
        productos.add(new Producto("P009", "Monitor", 250000.0, OrigenFabricacion.URUGUAY, Categoria.INFORMATICA));
        productos.add(new Producto("P010", "Impresora", 2000000.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));

        // Crear tres compras
        Compra compra1 = new Compra("C001",LocalDate.now(), productos.get(0), 2); // Comprando 2 Smartphones
        Compra compra2 = new Compra("C002",LocalDate.now(), productos.get(4), 1); // Comprando 1 Televisor
        Compra compra3 = new Compra("C003",LocalDate.now(), productos.get(7), 3); // Comprando 3 Cámaras

        // Almacenar las tres compras en un array
        Compra[] compras = {compra1, compra2, compra3};

        // Mostrar recibos de las compras
        for (Compra compra : compras) {
            compra.imprimirRecibo();
        }

	}

}
