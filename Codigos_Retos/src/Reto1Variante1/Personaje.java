package Reto1Variante1;

public class Personaje {
	
	 //Inserte acá los atributos
    private String nombre;
    private char sexo;
    private double posicionX = 0;
    private double posicionY = 0;
    private double distanciaTotal= 0;
    private int numeroBotiquines = 0;
    private double vida = 100;
    
    
    
    //Inserte acá el método constructor
    
    public Personaje(String nombre, char sexo){
        this.nombre = nombre;
        this.sexo = sexo; 
    }
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void recogerBotiquin(){
        this.numeroBotiquines++;
    }
    
    public void usarBotiquin(){
        if (this.numeroBotiquines>0){
            this.numeroBotiquines--;
            this.vida += 5; 
        }
    }
    
    public void moverDerecha(double d){
        this.posicionX += d;
        this.distanciaTotal += d;
    }
    
    public void moverIzquierda(double d){
        this.posicionX -= d;
        this.distanciaTotal += d;
    }
    
    public void moverArriba(double d){
        this.posicionY += d;
        this.distanciaTotal += d;
    }
    
    public void moverAbajo(double d){
        this.posicionY -= d;
        this.distanciaTotal += d;
    }
    
    public double calcularDistanciaRespectoOrigen(){
        return Math.sqrt(Math.pow(posicionX,2) + Math.pow(posicionY,2));
    }
   
    
    //Inserte acá los SETTERS Y GETTERS
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
     
    
    public void setPosicionX(double posicion){
        this.posicionX = posicion;
    }
    

    public void setPosicionY(double posicion){
        this.posicionY = posicion;
        
        
    }
    
    public void setNumeroBotiquines(int botiquines){
        this.numeroBotiquines = botiquines;
    }
    
    public void setVida(double vida){
        this.vida = vida;
    }
    
     public void setDistanciaTotal(double distancia){
        this.distanciaTotal = distancia;
    }
    
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public double getPosicionX(){
        return this.posicionX;
    }
    
    public double getPosicionY(){
        return this.posicionY;
    }
    
    public int getNumeroBotiquines(){
        return this.numeroBotiquines;
    }
    
    
    public double getVida(){
        return this.vida;
    }
    
    
    public double getDistanciaTotal(){
        return this.distanciaTotal;
    }
    

}
