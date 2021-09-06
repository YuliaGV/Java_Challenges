package Reto1Variante1;

public class Main {

	public static void main(String[] args) {
		
		Personaje explorer = new Personaje("Explorador", 'm');
		explorer.moverDerecha(2);
		explorer.moverAbajo(5);
		explorer.moverIzquierda(1);
		
		System.out.print(explorer.calcularDistanciaRespectoOrigen());
		

	}

}
