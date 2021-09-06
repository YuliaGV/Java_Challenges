package Reto4Variante3;

import java.util.ArrayList;

public class Condominio {
	//Inserte acá los atributos
    private ArrayList<Inmueble> inmuebles;

	
    //Inserte acá el método constructor
    public Condominio() {
    	this.inmuebles = new ArrayList<Inmueble>();
    }
    

    //Inserte acá los SETTERS Y GETTERS
    
    public ArrayList<Inmueble> getInmuebles() {
		return inmuebles;
	}

	public void setInmuebles(ArrayList<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
	
	public void agregarInmueble(Inmueble i) {
		
		if(this.inmuebles.size()==0) {
			this.inmuebles.add(i);
		}else {
			boolean existe = false;
			for(int j=0; j<this.inmuebles.size(); j++) {
				if(i.getnCasa().equals(this.inmuebles.get(j).getnCasa())) {
					existe = true;
				}
			}
			if(existe==false) {
				this.inmuebles.add(i);
			}
		}
		
		
	}
	
	public void eliminarInmueble(String ID) {
		
		for(int j=0; j<this.inmuebles.size(); j++) {
			
			if(this.inmuebles.get(j).getnCasa() == ID) {
				this.inmuebles.remove(j);
			}	
		}	
		
	}
	
	public double calcularArriendoMensualCondominio() {
		
		double sumArriendos = 0;
		
		for(int j=0; j<this.inmuebles.size(); j++) {
			
			sumArriendos += this.inmuebles.get(j).getCostoMensual();
		}
		
		return sumArriendos;	
			
	}
	
	public double promedioCostoInmueble() {
		
		int numInmuebles = this.inmuebles.size();
		double totalArriendos = calcularArriendoMensualCondominio();
		double promArriendos = totalArriendos/numInmuebles;
		
		return promArriendos;		
		
	}
	
	public double desviacionEstandarCostoInmueble() {
		
		double varianza = 0; 
		
		for(int j=0; j<this.inmuebles.size(); j++) {
			
			double sumatoria = Math.pow(this.inmuebles.get(j).getCostoMensual() - promedioCostoInmueble(), 2);
			varianza = varianza + sumatoria; 
			
		}
		
		varianza = varianza/this.inmuebles.size();
		
		double desviacion =  Math.sqrt(varianza);
		
		
		return desviacion;
		
	}
	
	
	
		

	
	
	

	

}
