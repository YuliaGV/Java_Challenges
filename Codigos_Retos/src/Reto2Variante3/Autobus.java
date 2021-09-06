package Reto2Variante3;

public class Autobus extends Vehiculo{
	
	//Variables
	
	private boolean puertaAbierta = false;
	
	//Constructor
	
	public Autobus(String nombreConductor, int nMaximoPasajeros) {
		super(nombreConductor, nMaximoPasajeros);
		
	}
	
	//Getters y Setters
	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}

	public void setPuertaAbierta(boolean puertaAbierta) {
		this.puertaAbierta = puertaAbierta;
	}
		
		
	
	//Métodos de clase
	
	public double calcularPasaje(int estrato) {
		
		double pasaje = 0; 
		
		switch(estrato) {
			case 0: case 1: case 2:
				pasaje = 1500;
				break;
			case 3: case 4:
				pasaje = 2600;
				break;
			case 5: case 6:
				pasaje = 3000;	
				break;
			default:
				pasaje = -1; 
		}
		
		return pasaje;
		
	}
	
	public void recogerPasajero(int estrato) {
		
		if(getnPasajeros()< getnMaximoPasajeros() && isPuertaAbierta()) {
			setnPasajeros(getnPasajeros() + 1);
			double pasajeActual = this.calcularPasaje(estrato);
			setCantidadDinero(getCantidadDinero() + pasajeActual);
		}
		
		
		
	}
	
	public void gestionarPuerta() {
		
		if(!isPuertaAbierta() && !isEnMarcha()) {
			setPuertaAbierta(true);
		}else {
			setPuertaAbierta(false);	
		}
		
	}

	@Override
	public void gestionarMarcha() {
		
		if(!isEnMarcha() && !isPuertaAbierta()) {
			setEnMarcha(true);
		}else {
			setEnMarcha(false);
		}
		
	}


}
