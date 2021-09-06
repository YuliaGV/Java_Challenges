package Reto4Variante3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		Inmueble casa1 =  new Inmueble("A1", "72023394", 700000.0, 5);  
		Inmueble casa2 =  new Inmueble("A12", "1037681391", 670000.0, 8);  
		Inmueble casa3 =  new Inmueble("A13", "33277591", 1000000.0, 4); 
		Inmueble casa4 =  new Inmueble("A21", "1032678245", 1340000.0, 9); 
		
	
		
		
		Condominio casasBelen= new Condominio(); 
		
		casasBelen.agregarInmueble(casa1);
		casasBelen.agregarInmueble(casa2);
		casasBelen.agregarInmueble(casa3);
		casasBelen.agregarInmueble(casa4);
		
		casasBelen.eliminarInmueble("A12");
		
		System.out.println(casasBelen.getInmuebles());
		System.out.println(casasBelen.calcularArriendoMensualCondominio());
		System.out.println(casasBelen.promedioCostoInmueble());
		System.out.println(casasBelen.desviacionEstandarCostoInmueble());
		
		
		
		
		
		
		

	}
	
	
	

}
