package ra6.hernandez;

import java.util.Collection;

public class Principal {

    public static void main(String[] args) {

        Competicion c = new Competicion();

        // SELECCIONES Y SEDES (MUNDIAL 2026)

        // GRUPO A
        Seleccion usa = new Seleccion("Estados Unidos", "Gregg Berhalter",
                new Sede("Los Ángeles", "SoFi Stadium"));

        Seleccion bra = new Seleccion("Brasil", "Carlo Ancelotti",
                new Sede("Dallas", "AT&T Stadium"));

        Seleccion jap = new Seleccion("Japón", "Hajime Moriyasu",
                new Sede("Seattle", "Lumen Field"));

        Seleccion ned = new Seleccion("Países Bajos", "Ronald Koeman",
                new Sede("Houston", "NRG Stadium"));

        // GRUPO B (ESPAÑA)
        Seleccion esp = new Seleccion("España", "Luis de la Fuente",
                new Sede("Nueva York", "MetLife Stadium"));

        Seleccion arg = new Seleccion("Argentina", "Lionel Scaloni",
                new Sede("Miami", "Hard Rock Stadium"));

        Seleccion nga = new Seleccion("Nigeria", "José Peseiro",
                new Sede("Kansas City", "Arrowhead Stadium"));

        Seleccion can = new Seleccion("Canadá", "Jesse Marsch",
                new Sede("Vancouver", "BC Place"));

        // -------------------------
        // GRUPOS
        // -------------------------
        c.addSeleccionAGrupo("A", usa);
        c.addSeleccionAGrupo("A", bra);
        c.addSeleccionAGrupo("A", jap);
        c.addSeleccionAGrupo("A", ned);

        c.addSeleccionAGrupo("B", esp);
        c.addSeleccionAGrupo("B", arg);
        c.addSeleccionAGrupo("B", nga);
        c.addSeleccionAGrupo("B", can);

        // -------------------------
        // JUGADORES (representativos)
        // -------------------------

        // ESPAÑA
        esp.addJugador(new Jugador(21, "Oyarzábal", 29, Jugador.Demarcacion.DELANTERO));
        esp.addJugador(new Jugador(11, "Nico Williams", 24, Jugador.Demarcacion.DELANTERO));
        esp.addJugador(new Jugador(1, "Unai Simón", 29, Jugador.Demarcacion.PORTERO));

        // ARGENTINA
        arg.addJugador(new Jugador(10, "Messi", 39, Jugador.Demarcacion.DELANTERO));
        arg.addJugador(new Jugador(1, "Dibu Martínez", 34, Jugador.Demarcacion.PORTERO));

        // NIGERIA
        nga.addJugador(new Jugador(9, "Osimhen", 27, Jugador.Demarcacion.DELANTERO));
        nga.addJugador(new Jugador(1, "Okoye", 26, Jugador.Demarcacion.PORTERO));

        // CANADÁ
        can.addJugador(new Jugador(19, "Davies", 25, Jugador.Demarcacion.DEFENSA));
        can.addJugador(new Jugador(1, "Borjan", 38, Jugador.Demarcacion.PORTERO));

        // BRASIL
        bra.addJugador(new Jugador(10, "Vinicius Jr", 34, Jugador.Demarcacion.DELANTERO));
        bra.addJugador(new Jugador(1, "Alisson", 33, Jugador.Demarcacion.PORTERO));

        // JAPÓN
        jap.addJugador(new Jugador(10, "Minamino", 31, Jugador.Demarcacion.MEDIO));

        // PAÍSES BAJOS
        ned.addJugador(new Jugador(10, "Depay", 32, Jugador.Demarcacion.DELANTERO));

        // USA
        usa.addJugador(new Jugador(10, "Pulisic", 27, Jugador.Demarcacion.MEDIO));

        // -------------------------
        // GOLES (ficticios)
        // -------------------------
        c.addGol(new Jugador(21, "Oyarzábal", 29, Jugador.Demarcacion.DELANTERO));
        c.addGol(new Jugador(21, "Oyarzábal", 29, Jugador.Demarcacion.DELANTERO));
        c.addGol(new Jugador(11, "Nico Williams", 24, Jugador.Demarcacion.DELANTERO));

        c.addGol(new Jugador(10, "Messi", 39, Jugador.Demarcacion.DELANTERO));
        c.addGol(new Jugador(10, "Messi", 39, Jugador.Demarcacion.DELANTERO));
        c.addGol(new Jugador(9, "Osimhen", 27, Jugador.Demarcacion.DELANTERO));

        // -------------------------
        // RESULTADOS (ficticios)
        // -------------------------
        c.addResultado(esp, Competicion.Resultado.VICTORIA);
        c.addResultado(arg, Competicion.Resultado.EMPATE);
        c.addResultado(nga, Competicion.Resultado.VICTORIA);
        c.addResultado(can, Competicion.Resultado.DERROTA);

        // -------------------------
        // PRUEBAS
        // -------------------------
        System.out.println("=== Grupo A ===");
        c.mostrarGrupo("A");

        System.out.println("\n=== Grupo B (España) ===");
        c.mostrarGrupo("B");
        
        System.out.println("\nJugadores de España ordenados por edad:");
        for (Jugador j : esp.jugadoresOrdenadosPorEdad()) {
            System.out.println(j);
        }

        System.out.println("\nGoleadores - usando método genérico mostrarColeccion(Collection<T> col):");
        c.mostrarColeccion(c.goleadores());
        

    }
}
