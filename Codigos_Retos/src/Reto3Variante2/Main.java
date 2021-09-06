package Reto3Variante2;

public class Main {
	
	
	public static void main(String[] args) {
		
		Estudiante felipe = new Estudiante("1020472951","felipe", "pipegarcia47@gmail.com", "español");
		Estudiante albert = new Estudiante("5897211897","albert", "albertm12091994@gmail.com", "aleman");
		
		
		felipe.dirigir();
		System.out.print(felipe.getUrl());
		
		
		}
	
	
	
	
	

}
