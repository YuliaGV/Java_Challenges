package Reto2Variante3;

public class Taxi extends Vehiculo {
	
	
	//Variables
	
	private double distanciaRecorrida = 0;
	private boolean segurosActivados = false;
	
	//Constructor 
	
	public Taxi(String nombreConductor, int nMaximoPasajeros) {
		super(nombreConductor, nMaximoPasajeros);
		this.setnMaximoPasajeros(1);
		
	}
	
	
	//Getters y Setters
	
	public double getDistanciaRecorrida() {
		return distanciaRecorrida;
	}
	public void setDistanciaRecorrida(double distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}
	public boolean isSegurosActivados() {
		return segurosActivados;
	}
	public void setSegurosActivados(boolean segurosActivados) {
		this.segurosActivados = segurosActivados;
	}
	
	//Métodos de clase
	
	public void gestionarSeguros() {
		
		if(!isEnMarcha() && isSegurosActivados()) {
			setSegurosActivados(false);
		}else {
			setSegurosActivados(true);
		}
		
	}
	
	public void reiniciarTaximetro() {
		setDistanciaRecorrida(0);
	}
	
	public void recogerPasajero() {
		if(getnPasajeros() == 0) {
			setnPasajeros(getnPasajeros() + 1);
		}
		
	}
	
	private double calcularPasaje() {
		return 3000 + 2300*getDistanciaRecorrida();
	}
	
	public void dejarPasajero() {
		
		if(getnPasajeros()>0) {
			setnPasajeros(getnPasajeros() - 1);
			reiniciarTaximetro();
			setCantidadDinero(getCantidadDinero() + calcularPasaje());	
		}
		
	}
	
	public void presionarBotonPanico() {
		setEnMarcha(false);
		setSegurosActivados(false);
		setnPasajeros(getnPasajeros() - 1);
		reiniciarTaximetro();
	}

	
	public void moverDerecha(double d){
		if(isEnMarcha()) {
	        setLocalizacionX(getLocalizacionX() + d);
	        if(getnPasajeros()>0) {
	        	setDistanciaRecorrida(getDistanciaRecorrida() + d);
	        	
	        }
		}
    }
    
    public void moverIzquierda(double d){
    	if(isEnMarcha()) {
	    	setLocalizacionX(getLocalizacionX() - d);
	    	if(getnPasajeros()>0) {
	        	setDistanciaRecorrida(getDistanciaRecorrida() + d);
	        	
	        }
    	}
    }
    
    public void moverArriba(double d){
    	if(isEnMarcha()) {
	    	setLocalizacionY(getLocalizacionY() + d);
	    	if(getnPasajeros()>0) {
	        	setDistanciaRecorrida(getDistanciaRecorrida() + d);
	        	
	    	}
    	}
    }
    
    public void moverAbajo(double d){
    	if(isEnMarcha()) {
	    	setLocalizacionY(getLocalizacionY() - d);
	    	if(getnPasajeros()>0) {
	        	setDistanciaRecorrida(getDistanciaRecorrida() + d);
	        	
	        }
    	}
    }
	
	@Override
	public void gestionarMarcha() {
		
		if(!isEnMarcha() && isSegurosActivados()) {
			setEnMarcha(true);
		}else {
			setEnMarcha(false);
		}	
	
	} 

	
	
}
