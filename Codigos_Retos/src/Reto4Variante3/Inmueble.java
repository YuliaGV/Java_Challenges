package Reto4Variante3;

public class Inmueble {
	
	//Inserte ac� los atributos
    private String nCasa;
    private String IDArrendador;
    private double costoMensual;
    private int cantidadMesesArrendado;

    //Inserte ac� el m�todo constructor
    public Inmueble(String num, String id, double costo, int meses ){
        this.setnCasa(num);
        this.setIDArrendador(id);
        this.setCostoMensual(costo);
        this.setCantidadMesesArrendado(meses);
    }
    
    //Inserte ac� los SETTERS Y GETTERS

	public String getnCasa() {
		return nCasa;
	}

	public void setnCasa(String nCasa) {
		this.nCasa = nCasa;
	}

	public String getIDArrendador() {
		return IDArrendador;
	}

	public void setIDArrendador(String iDArrendador) {
		IDArrendador = iDArrendador;
	}

	public double getCostoMensual() {
		return costoMensual;
	}

	public void setCostoMensual(double costoMensual) {
		this.costoMensual = costoMensual;
	}

	public int getCantidadMesesArrendado() {
		return cantidadMesesArrendado;
	}

	public void setCantidadMesesArrendado(int cantidadMesesArrendado) {
		this.cantidadMesesArrendado = cantidadMesesArrendado;
	}
	
	
	
	
	

}
