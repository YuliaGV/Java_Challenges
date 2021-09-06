package Reto3Variante2;

public class Estudiante extends Persona {
    
    //Inserte acá el método constructor
    public Estudiante(String id, String nombre, String email, String idioma){
        super(id, nombre, email, idioma);
    }

    //Inserte acá la implementación del método abstracto de la clase padre
    
	public void dirigir(){
	        
			String urlNueva = getUrl()+"/"+getIdioma()+"/estudiante";
		    setUrl(urlNueva);
	       
	        
	    }
}
