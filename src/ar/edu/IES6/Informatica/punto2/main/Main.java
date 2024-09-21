package ar.edu.IES6.Informatica.punto2.main;

import java.util.ArrayList;

import ar.edu.IES6.Informatica.punto2.model.Efemeride;
import ar.edu.IES6.Informatica.punto2.util.Mes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Efemeride> efemerides = new ArrayList<>();

        efemerides.add(new Efemeride(1, "anio nuevo", Mes.ENERO, 1, "Es el dia en el que comienza un nuevo anio"));
        efemerides.add(new Efemeride(2, "Dia del Trabajador", Mes.MAYO, 1, "Conmemoracion del movimiento obrero mundial"));
        efemerides.add(new Efemeride(3, "Dia de la Revolución de Mayo", Mes.MAYO, 25, "Conmemoracion de la Revolucion de Mayo"));
		efemerides.add(new Efemeride(4, "Dia de la Independencia", Mes.JULIO, 9, "Celebracion de la independencia de Argentina"));
        efemerides.add(new Efemeride(5, "Navidad", Mes.DICIEMBRE, 25, "Celebracion del nacimiento de Jesus"));


        System.out.println("Listado de efemerides:");
        for (Efemeride efemeride : efemerides) {
            System.out.println("Nombre: " + efemeride.getNombre() + ", Dia: " + efemeride.getDia() + ", Mes: " + efemeride.getMes());
        }

        efemerides.remove(2);

        Efemeride efemerideModificada = efemerides.get(1);
        efemerideModificada.setNombre("Dia del Trabajo");
        efemerideModificada.setDetalle("Conmemoracion al obrero mundial");

        System.out.println("\nListado de efemerides despues de las modificaciones:");
        for (Efemeride efemeride : efemerides) {
            efemeride.mostrarDatos();
        }
    }
}
