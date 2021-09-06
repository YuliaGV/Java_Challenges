package Reto3Variante2;

public abstract class Persona {

    //Inserte acá los atributos
    private String id;
    private String nombre;
    private String email;
    private String idioma;
    private String url = "educursos.com";
    
    //Inserte acá el método constructor
    
    public Persona(String id, String nombre, String email, String idioma){
        
        this.setId(id);
        this.setNombre(nombre);
        this.setEmail(email);
        this.setIdioma(idioma);
        
    }


    //Inserte acá los SETTERS Y GETTERS
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
    
    
    //Inserte acá el método abstracto
	public abstract void dirigir();
    
}
