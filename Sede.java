package ra6.hernandez;

public class Sede {

    private String ciudad;
    private String estadio;

    public Sede(String ciudad, String estadio) {
        this.ciudad = ciudad;
        this.estadio = estadio;
    }

    public String getCiudad() { 
    	return ciudad; 
    }
    
    public String getEstadio() { 
    	return estadio; 
    }

    @Override
    public String toString() {
        return ciudad + " - " + estadio;
    }
}
