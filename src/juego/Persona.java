package juego;

import java.util.Scanner;

import consoleInput.ConsoleInput;

/**
 * Clase hija de la clase Jugador, que representa al usuario.
 * @author Alejandro Sanchez Serrano
 * @version 1.0
 * @since 1.0
 */
public class Persona extends Jugador {
	
	/**
	 * Constructor de la clase persona.
	 * @param ficha Tipo de ficha del jugador.
	 */
	Persona(Ficha ficha) {
		super(ficha);
	}
	
	/**
	 * Metodo heredado de la clase abstracta Jugador que devuelve una jugada valida introducida por el usuario.
	 * @param tablero El tablero sobre el que se realiza la partida.
	 * @see #pedirCoordenada()
	 */
	public void devolverJugada(Tablero tablero) {
		boolean turno = true;
		Coordenada coordenada;
		do {
			coordenada = pedirCoordenada();
			if (!tablero.comprobarCoordenada(coordenada)) {
				if(tablero.comprobarDirecciones(tablero.devolverCasilla(coordenada),ficha)) {
					System.out.printf("Fichas volteadas: %d\n",tablero.fichasVolteadas(tablero.devolverCasilla(coordenada), ficha));
					tablero.colocarFicha(coordenada, ficha);
					System.out.println();
					turno = false;
				}else {
					System.out.println("Introduce un movimiento valido");
					tablero.interfaz();
				}		
			}
		}while(turno);
	}
	
	/**
	 * Metodo que se encarga de pedir una jugada al usuario.
	 * @return Devuelve la jugada.
	 */
	private Coordenada pedirCoordenada() {
		ConsoleInput console = new ConsoleInput(new Scanner(System.in));
		int x;
		int y;
		System.out.println("Introduce el eje x");
		x = console.readIntInRange(1, 8)-1;
		System.out.println("Introduce el eje y");
		y = console.readIntInRange(1, 8)-1;
		return new Coordenada(x,y);
	}
}
