package Reto2Variante1;

public class Jugador extends Personaje{
    //              ^ (Jugador hereda de Personaje)
    //Inserte ac� los atributos
    private int numeroBotiquines = 0;
    
    
    
    //Inserte ac� el m�todo constructor
    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage){
        super(nombre, sexo, posicionX, posicionY, damage);
        
    }
    
   
    //Inserte ac� los m�todos (NO LOS GETTER Y SETTERS)
    
    public void usarBotiquin(){
        
        if(this.numeroBotiquines > 0){
            
            if(getVida()>=100){
                this.numeroBotiquines--;
            }else{
                this.numeroBotiquines--;
                setVida(getVida()+5);
                
            }
            
        }
            
    }
    
    public void recogerBotiquin(){
        this.numeroBotiquines++;
    }
    
     public void moverDerecha(double d){
        setPosicionX(getPosicionX() + d);
    }
    
    public void moverIzquierda(double d){
    	setPosicionX(getPosicionX() - d);
    }
    
    public void moverArriba(double d){
    	setPosicionY(getPosicionY() + d);
    }
    
    public void moverAbajo(double d){
    	setPosicionY(getPosicionY() - d);
    }
    
    public void golpear(Enemigo p){
        double golpe =  this.getDamage()/calcularDistanciaRespectoPersonaje(p);
        
        if(p.getVida() <= golpe){
            p.setVida(0);
        }else{
            p.setVida(p.getVida()-golpe); 
        }
        
        p.evolucionar();
        
    }
    
    
    
    //Inserte ac� los SETTERS Y GETTERS
    
    public int getNumeroBotiquines() {
		return numeroBotiquines;
	}

	public void setNumeroBotiquines(int numeroBotiquines) {
		this.numeroBotiquines = numeroBotiquines;
	}
    
    
    
}