package juego;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Clase hija de la clase Jugador, que representa la inteligencia artificial del juego.
 * @author Alex
 * @version 1.0
 * @since 1.0
 */
public class IA extends Jugador{
	
	/**
	 * Constructor de la clase IA.
	 * @param ficha Tipo de ficha de la IA.
	 */
	IA(Ficha ficha) {
		super(ficha);
	}
	
	/**
	 * Metodo heredado de la clase abstracta Jugador que devuelve una jugada.
	 */
	public void devolverJugada(Tablero tablero) {
		List<MovimientoIA> coordenadas = new ArrayList<MovimientoIA>();
		int a;
		int b;
		for (int i = 0; i < tablero.getTablero().length; i++) {
			for (int j = 0; j < tablero.getTablero()[i].length; j++) {
				if(!tablero.comprobarCoordenada(tablero.getTablero()[i][j].getCoordenada())&&tablero.comprobarDirecciones(tablero.getTablero()[i][j], ficha)) {
					coordenadas.add(new MovimientoIA(tablero.getTablero()[i][j].getCoordenada(),tablero.fichasVolteadas(tablero.getTablero()[i][j], ficha)));
				}
			}
		}
		
		coordenadas.sort(Comparator.comparing(MovimientoIA::getFichasVolteadas).reversed());
		a = coordenadas.get(0).getFichasVolteadas();
		b = (int) coordenadas.stream().filter(t -> t.getFichasVolteadas() == a).count();
		System.out.printf("Fichas volteadas: %d\n",tablero.fichasVolteadas(tablero.devolverCasilla(coordenadas.get(0).getCoordenada()),ficha));
		tablero.colocarFicha(coordenadas.stream().filter(t -> t.getFichasVolteadas() == a).toList().get(new Random().nextInt(b)).getCoordenada(), ficha);
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {

		}
	}	
}
