package ar.edu.IES6.Informatica.punto3.main;

import ar.edu.IES6.Informatica.punto3.model.Provincia;
import ar.edu.IES6.Informatica.punto3.util.Region;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provincia[] provincias = new Provincia[10];

        provincias[0] = new Provincia(1, "Salta", Region.NOA, 1340000, 155488, true);
        provincias[1] = new Provincia(2, "Jujuy", Region.NOA, 800000, 53219, false);
        provincias[2] = new Provincia(3, "Tucumán", Region.NOA, 1670000, 22524, true);
        provincias[3] = new Provincia(4, "La Rioja", Region.CUYO, 388000, 89680, false);
        provincias[4] = new Provincia(5, "Mendoza", Region.CUYO, 2000000, 148827, true);
        provincias[5] = new Provincia(6, "Misiones", Region.NEA, 1300000, 29801, false);
        provincias[6] = new Provincia(7, "Corrientes", Region.NEA, 1120000, 88199, true);
        provincias[7] = new Provincia(8, "Chaco", Region.NEA, 1200000, 99633, false);
        provincias[8] = new Provincia(9, "Formosa", Region.NEA, 606000, 72066, true);
        provincias[9] = new Provincia(10, "Santa Cruz", Region.PATAGONIA, 333000, 243943, false);

        for (Provincia provincia : provincias) {
            if (provincia.isEstado()) {
                System.out.println(provincia);
            }
        }
	}
}
