package ar.edu.IES6.Informatica.Punto01;

import ar.edu.IES6.Informatica.Punto01.Model.Producto;
import ar.edu.IES6.Informatica.Punto01.Util.Categoria;
import ar.edu.IES6.Informatica.Punto01.Util.OrigenFabricacion;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Producto>ObjProducto=new ArrayList<>();//arregloList
		 //add "agregar"
        ObjProducto.add(new Producto("j001", "Smartphone", 104.569,OrigenFabricacion.CHINA, Categoria.TELEFONIA));
        ObjProducto.add(new Producto("j002", "Laptop", 1500000.0, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA));
        ObjProducto.add(new Producto("j003", "Lavadora", 8200000.0, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
        ObjProducto.add(new Producto("j004", "Taladro", 150000.0, OrigenFabricacion.URUGUAY, Categoria.HERRAMIENTAS));
        ObjProducto.add(new Producto("j005", "Televisor", 120000.0, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR));

     // Mostrar contenido de la lista usando for-each
        for (Producto xObjProducto : ObjProducto) {
            System.out.println(xObjProducto);
	}
        

  }
}
