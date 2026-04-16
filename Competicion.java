package ra6.hernandez;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

import ra6.hernandez.Seleccion;
import ra6.hernandez.Competicion.Resultado;

public class Competicion {

	//Mapa que almacena las 4 selecciones que conforman cada grupo (A, B, C...)
	private Map<String, List<Seleccion>> grupos;
	
    //Mapa que almacena, para cada selección, los puntos que acumula en los partidos que ha jugado
    private Map<Seleccion, Integer> puntos;
	
    //Lista con los nombres de jugadores que marcan goles (se pueden repetir).
    private List<Jugador> goles;

    public enum Resultado { VICTORIA, EMPATE, DERROTA }

    public Competicion() {
        grupos = new LinkedHashMap<>();
        goles = new ArrayList<>();
        puntos = new HashMap<>();
    }

    //Añade una selección al mapa grupos. Por ejemplo, al grupo "B" añade España)
    //Añade una selección al mapa puntos, con un valor inicial de 0 puntos.
    public void addSeleccionAGrupo(String grupo, Seleccion s) {

        if (!grupos.containsKey(grupo)) {
            grupos.put(grupo, new ArrayList<>());
        }
        
    	grupos.get(grupo).add(s);
    	puntos.put(s, 0);
    }

    //Cuando un jugador marca un gol, se añade dicho jugador a la lista goles.
    public void addGol(Jugador j) {
    	goles.add(j);
    }

    // Si el resultado del partido es VICTORIA, la seleccion s debe acumular 3 puntos. Si es EMPATE, 1 punto, y en caso de derrota, 0 puntos.
    // El mapa puntos contendrá de esta forma, el total de puntos acumulados por cada selección.
    public void addResultado(Seleccion s, Resultado r) {
        int puntosActuales = puntos.containsKey(s) ? puntos.get(s) : 0;
        Integer puntosSumados = 0;
        
        if (r == Resultado.VICTORIA) {
        	puntosSumados = puntosActuales + 3;
        	puntos.put(s, puntosSumados);
        	
        }else if ( r == Resultado.EMPATE) {
        	puntosSumados = puntosActuales + 1;
        	puntos.put(s, puntosSumados);
        }
        //No ponemos la opción de derrota porque no habría que variar el valor del mapa ya que no sumaría ningún punto.
    }

    // MOSTRAR GRUPO CON PUNTOS
    // Muestra por consola las selecciones del grupo que se indica por parámetro, así como los puntos que tienen. Debes usar Iterator
    public void mostrarGrupo(String grupo) {
        List<Seleccion> listaSelecciones = grupos.get(grupo);
        if (listaSelecciones == null) return;

        Iterator<Seleccion> it = listaSelecciones.iterator();
        	while(it.hasNext()) {
        		Seleccion s = it.next();
        		System.out.println(grupos.get(grupo) + " - "+ puntos.get(s) +"puntos");
        	}
     
    }

    //Devuelve una lista con el nombre del jugador y el total de goles que ha metido
    public List<String> goleadores() {
        Map<Jugador, Integer> golesPorJugador = new HashMap<>();
        Integer sumaGoles =0;   
        List <String> goleadoresString = new ArrayList <String>();
        
       Iterator <Jugador> it = goles.iterator();
       while (it.hasNext()) {
    	   Jugador j = it.next();

    	   if(j != it.next()) {
    		   sumaGoles = 1;
    		   golesPorJugador.put(j, sumaGoles);
    
    	   } else {
    		   golesPorJugador.put(j, sumaGoles++);
    	   }
    	   
    	   String nombreJugador = "j.getNombre()";
    	   char golesJugador =  toString().charAt(golesPorJugador.get(j));
    	   
    	   String JugadoryGol = nombreJugador + " - " +golesJugador;
    	   
    	   goleadoresString.add(JugadoryGol);
       }
        return goleadoresString; 
    }
    
    //Método genérido para mostrar por consola los elementos de una colección 
    public <T> void mostrarColeccion(Collection<T> col) {
        for (T elem : col) {
            System.out.println(elem);
        }
    }

}


