package Reto2Variante1;

public class Enemigo extends Personaje{
    //              ^ (Enemigo hereda de Personaje)
    //Inserte acá los atributos
    private int evolucionesAplicadas = 0;
    private int resistencia = 1;
    
    
    //Inserte acá el método constructor
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
		super(nombre, sexo, posicionX, posicionY, damage);
		// TODO Auto-generated constructor stub
	}
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void evolucionar(){
        
    	if(this.getVida()<=30 && evolucionesAplicadas==0){
            this.setDamage(getDamage()+20);
            this.evolucionesAplicadas++;
            
        }
        if(this.getVida()<=10 && evolucionesAplicadas == 1){
            this.resistencia++;
            this.evolucionesAplicadas++;
            
        }
    }
    
    public void recibirImpacto(double d){
    	
    	 if(getVida() <= d){
             setVida(0);
         }else{
             setVida(getVida()-d); 
         }
    }
    
    
    
    //Inserte acá los SETTERS Y GETTERS
   
    public int getEvolucionesAplicadas() {
		return evolucionesAplicadas;
	}
	public void setEvolucionesAplicadas(int evolucionesAplicadas) {
		this.evolucionesAplicadas = evolucionesAplicadas;
	}
	public int getResistencia() {
	    return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
}