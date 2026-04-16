package ra6.hernandez;

public class Jugador implements Comparable<Jugador> {

    public enum Demarcacion { PORTERO, DEFENSA, MEDIO, DELANTERO }

    public int dorsal;
    private String nombre;
    private int edad;
    private Demarcacion demarcacion;

    public Jugador(int dorsal, String nombre, int edad, Demarcacion demarcacion) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.edad = edad;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() { 
    	return dorsal; 
    }
    
    public String getNombre() {
    	return nombre; 
    }
    
    public int getEdad() {
    	return edad; 
    }
    
    public Demarcacion getDemarcacion() {
    	return demarcacion; 
    }

    @Override
    public String toString() {
        return dorsal + " - " + nombre + " (" + edad + ", " + demarcacion + ")";
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(dorsal);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Jugador)) return false;
        Jugador j = (Jugador) o;
        return this.dorsal == j.dorsal;
    }

    // ORDEN NATURAL: POR EDAD
    @Override
    public int compareTo(Jugador otro) {
        return Integer.compare(otro.edad, this.edad);
    }
}

