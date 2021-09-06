package Reto2Variante3;

public abstract class Vehiculo {
	
	

	//Variables
	
	private String nombreConductor;
	private int nPasajeros = 0;
	private double cantidadDinero = 0;
	private int nMaximoPasajeros;
	private double localizacionX = 0;
	private double localizacionY = 0; 
	private boolean aireAcondicionadoActivado = false; 
	private boolean motorEncendido = false;
	private boolean wifiEncendido = false;
	private boolean enMarcha = false;

	
	//Constructor
	
	public Vehiculo(String nombreConductor, int nMaximoPasajeros) {
		this.nombreConductor = nombreConductor;
		this.nMaximoPasajeros = nMaximoPasajeros;
		
	}
	
	
	
	//Getters y Setters

	public String getNombreConductor() {
		return nombreConductor;
	}
	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}
	public int getnPasajeros() {
		return nPasajeros;
	}
	public void setnPasajeros(int nPasajeros) {
		this.nPasajeros = nPasajeros;
	}
	public double getCantidadDinero() {
		return cantidadDinero;
	}
	public void setCantidadDinero(double cantidadDinero) {
		this.cantidadDinero = cantidadDinero;
	}
	public int getnMaximoPasajeros() {
		return nMaximoPasajeros;
	}
	public void setnMaximoPasajeros(int nMaximoPasajeros) {
		this.nMaximoPasajeros = nMaximoPasajeros;
	}
	public double getLocalizacionX() {
		return localizacionX;
	}
	public void setLocalizacionX(double localizacionX) {
		this.localizacionX = localizacionX;
	}
	public double getLocalizacionY() {
		return localizacionY;
	}
	public void setLocalizacionY(double localizacionY) {
		this.localizacionY = localizacionY;
	}
	public boolean isAireAcondicionadoActivado() {
		return aireAcondicionadoActivado;
	}
	public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
		this.aireAcondicionadoActivado = aireAcondicionadoActivado;
	}
	public boolean isMotorEncendido() {
		return motorEncendido;
	}
	public void setMotorEncendido(boolean motorEncendido) {
		this.motorEncendido = motorEncendido;
	}
	public boolean isWifiEncendido() {
		return wifiEncendido;
	}
	public void setWifiEncendido(boolean wifiEncendido) {
		this.wifiEncendido = wifiEncendido;
	}
	public boolean isEnMarcha() {
		return enMarcha;
	}
	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	

	//Métodos propios de clase
	
	public void dejarPasajero() {
		if(getnPasajeros()>0) {
			setnPasajeros(getnPasajeros()-1);
		}else {
			setnPasajeros(0);
		}
		
	}
	
	public double calcularDistanciaAcopio() {
		return Math.sqrt(Math.pow(getLocalizacionY(), 2) + Math.pow(getLocalizacionY(), 2));
	}
	
	public void gestionarAireAcondicionado() {
		
		if(isMotorEncendido() && !isAireAcondicionadoActivado()) {
			setAireAcondicionadoActivado(true);	
		}else {
			setAireAcondicionadoActivado(false);
		}
	}
	
	public void gestionarMotor() {
		
		if(!isMotorEncendido()) {
			setMotorEncendido(true);
		}else {
			setMotorEncendido(false);
			setAireAcondicionadoActivado(false);
			setWifiEncendido(false);
			setEnMarcha(false);	
		}	
	}
	
	public void gestionarWifi() {
		
		if(isMotorEncendido() && !isWifiEncendido()) {
			setWifiEncendido(true);
		}else {
			setWifiEncendido(false);
		}
		
	}
	
	public abstract void gestionarMarcha();
	
	public void moverDerecha(double d){
		if(isEnMarcha()) {
			setLocalizacionX(getLocalizacionX() + d);
		}
    }
    
    public void moverIzquierda(double d){
    	if(isEnMarcha()) {
    		setLocalizacionX(getLocalizacionX() - d);
    	}
    }
    
    public void moverArriba(double d){
    	if(isEnMarcha()) {
    		setLocalizacionY(getLocalizacionY() + d);
    	}
    }
    
    public void moverAbajo(double d){
    	if(isEnMarcha()) {
    		setLocalizacionY(getLocalizacionY() - d);
    	}
    }
	

	

}
