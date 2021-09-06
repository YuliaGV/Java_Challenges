package Reto2Variante3;

public class Main {

	public static void main(String[] args) {
		
		/*
		
		Autobus a = new Autobus("Pepe", 30);
		a.recogerPasajero(2);
		a.gestionarPuerta();
		a.gestionarMarcha();
		
		a.recogerPasajero(2);
		a.gestionarMarcha();
		a.gestionarPuerta();
		
		a.moverArriba(2);
		a.moverDerecha(5);
		a.gestionarWifi();
		a.gestionarAireAcondicionado();
		
		a.gestionarMotor();
		a.moverIzquierda(2);
		
		System.out.println("El bus:");
		System.out.println("nombreConductor: "+ a.getNombreConductor());
		System.out.println("nPasajeros: "+ a.getnPasajeros());
		System.out.println("cantidadDinero: "+ a.getCantidadDinero());
		System.out.println("nMaximoPasajeros: "+ a.getnMaximoPasajeros());
		System.out.println("localizacionX: "+ a.getLocalizacionX());
		System.out.println("localizacionY: "+ a.getLocalizacionY());
		System.out.println("puertaAbierta: "+ a.isPuertaAbierta());
		System.out.println("aireAcondicionadoActivado: "+ a.isAireAcondicionadoActivado());
		System.out.println("motorEncendido: "+ a.isMotorEncendido());
		System.out.println("wifiEncendido: "+ a.isWifiEncendido());
		System.out.println("enMarcha: "+ a.isEnMarcha());
		
	
		
		Taxi b = new Taxi("Pepe", 1);
		b.gestionarMotor();
		b.gestionarMarcha();
		b.recogerPasajero();
		
		b.gestionarMarcha();
		b.recogerPasajero();
		b.moverArriba(10);
		b.moverDerecha(12);
		b.gestionarSeguros();
		b.moverAbajo(10);
		b.moverIzquierda(13);
		
		b.gestionarAireAcondicionado();
		b.gestionarWifi();
		b.gestionarMotor();
		b.presionarBotonPanico();
		
		System.out.println("El taxi:");
		System.out.println("nombreConductor: "+ b.getNombreConductor());
		System.out.println("nPasajeros: "+ b.getnPasajeros());
		System.out.println("cantidadDinero: "+ b.getCantidadDinero());
		System.out.println("nMaximoPasajeros: "+ b.getnMaximoPasajeros());
		System.out.println("localizacionX: "+ b.getLocalizacionX());
		System.out.println("localizacionY: "+ b.getLocalizacionY());
		System.out.println("aireAcondicionadoActivado: "+ b.isAireAcondicionadoActivado());
		System.out.println("motorEncendido: "+ b.isMotorEncendido());
		System.out.println("wifiEncendido: "+ b.isWifiEncendido());
		System.out.println("enMarcha: "+ b.isEnMarcha());
		System.out.println("distanciaRecorrida: "+ b.getDistanciaRecorrida());
		System.out.println("segurosActivados: "+ b.isSegurosActivados());
		
		*/
		
		Autobus bus = new Autobus("Filomeno", 2);
		
		bus.gestionarPuerta();
		bus.recogerPasajero(1);
		bus.recogerPasajero(3);
		bus.recogerPasajero(6);
		bus.gestionarMarcha();
		bus.gestionarPuerta();
		bus.gestionarMarcha();
		bus.gestionarMotor();
		bus.gestionarMarcha();
		bus.moverArriba(1);
		bus.moverIzquierda(2);
		bus.moverAbajo(3);
		bus.recogerPasajero(6);
		bus.gestionarMarcha();
		bus.gestionarPuerta();
		bus.recogerPasajero(4);
		
		System.out.println("El bus:");
		System.out.println("nombreConductor: "+ bus.getNombreConductor());
		System.out.println("nPasajeros: "+ bus.getnPasajeros());
		System.out.println("cantidadDinero: "+ bus.getCantidadDinero());
		System.out.println("nMaximoPasajeros: "+ bus.getnMaximoPasajeros());
		System.out.println("localizacionX: "+ bus.getLocalizacionX());
		System.out.println("localizacionY: "+ bus.getLocalizacionY());
		System.out.println("puertaAbierta: "+ bus.isPuertaAbierta());
		System.out.println("aireAcondicionadoActivado: "+ bus.isAireAcondicionadoActivado());
		System.out.println("motorEncendido: "+ bus.isMotorEncendido());
		System.out.println("wifiEncendido: "+ bus.isWifiEncendido());
		System.out.println("enMarcha: "+ bus.isEnMarcha());
		
		
		
		
	
		
		
		
		

	}

}
