package Reto3Variante2;

public class Estudiante extends Persona {
    
    //Inserte ac� el m�todo constructor
    public Estudiante(String id, String nombre, String email, String idioma){
        super(id, nombre, email, idioma);
    }

    //Inserte ac� la implementaci�n del m�todo abstracto de la clase padre
    
	public void dirigir(){
	        
			String urlNueva = getUrl()+"/"+getIdioma()+"/estudiante";
		    setUrl(urlNueva);
	       
	        
	    }
}
