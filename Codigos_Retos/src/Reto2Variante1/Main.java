package Reto2Variante1;

public class Main {

	public static void main(String[] args) {
		
		Jugador j = new Jugador("Explorador", 'm', -1, -1, 130);
		Enemigo e = new Enemigo("Bitter", 'f',0, 0, 80);
		
		j.golpear(e);
		j.golpear(e);
		j.usarBotiquin();
		j.recogerBotiquin();
		j.recogerBotiquin();
		j.usarBotiquin();
		j.moverArriba(2);
		e.golpear(j);
		
		System.out.println("Datos Jugador:");
		System.out.println("Daño: " + j.getDamage());
		System.out.println("Vida: " + j.getVida());
		System.out.println("Botiquines: " + j.getNumeroBotiquines());
		System.out.println("Posicion x: " + j.getPosicionX());
		System.out.println("Posicion y: " + j.getPosicionY());
		
		System.out.println("Datos Enemigo:");
		System.out.println("Daño: " + e.getDamage());
		System.out.println("Vida: " + e.getVida());
		System.out.println("Evoluciones: " + e.getEvolucionesAplicadas());
		System.out.println("Resistencia: " + e.getResistencia());
		System.out.println("Posicion x: " + e.getPosicionX());
		System.out.println("Posicion y: " + e.getPosicionY());
		
		
		
		
		
		
		
	}

}
