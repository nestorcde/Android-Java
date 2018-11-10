package py.com.prestosoftware.facepet.model;

public class Ciudad {
	
	private int id;
	private String nombre;
	private String imagenUrl;
	
	public Ciudad() {
		this.id = 0;
		this.nombre = "";
		this.imagenUrl = "";
	}
	
	
	// Metodos Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagenUrl() {
		return imagenUrl;
	}

	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}

}
