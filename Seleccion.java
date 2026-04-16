package ra6.hernandez;
import java.util.TreeMap;
import java.util.*;


public class Seleccion {

    private String pais;
    private String entrenador;
    private Sede sede;
    private Set<Jugador> jugadores;

    //Conjunto de jugadores de una seleccion
    public Seleccion(String pais, String entrenador, Sede sede) {
        this.pais = pais;
        this.entrenador = entrenador;
        this.sede = sede;
        this.jugadores = new HashSet<>();
    }

    public String getPais() {
        return pais;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    // MÉTODOS DE GESTIÓN DE JUGADORES (CON ITERADORES)

    //Añade un jugador al Set jugadores
    public boolean addJugador(Jugador j) {
    	return jugadores.add(j);
    }

    //Elimina del Set jugadores el jugador con el dorsal indicado. Debes usar Iterator
    public boolean removeJugador(int dorsal) {
    	Boolean eliminado = false;
        Iterator<Jugador> it = jugadores.iterator();
        
        while(it.hasNext()) {
        	Jugador j = it.next();
        		if (j.getDorsal() == dorsal) {
        			jugadores.remove(j);
        			eliminado = true;
        	}
        		eliminado = false;
        }
		return eliminado;
        
      //*AQUI*
    }

    // Devuelve un Set con los jugadores ordenados por edad (observa que Jugador implementa Comparable)
   public Set<Jugador> jugadoresOrdenadosPorEdad() {
    	Set <Jugador> ordenadosPorEdad =new TreeSet<Jugador>();
    	
    	Iterator<Jugador> it = jugadores.iterator();
    	while(it.hasNext()) {
    		Jugador j = it.next();
    		j.compareTo(it.next());
    		
    		ordenadosPorEdad.add(j);
    	}
    	return ordenadosPorEdad;
    }

    @Override
    public String toString() {
        return pais + " (" + entrenador + ")";
    }

    @Override
    public int hashCode() {
        return pais.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Seleccion)) return false;
        Seleccion s = (Seleccion) o;
        return this.pais.equals(s.pais);
    }
}

