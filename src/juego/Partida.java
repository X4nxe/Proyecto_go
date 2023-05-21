package juego;

import java.util.Scanner;

import consoleInput.ConsoleInput;
/**
 * Clase que define la partida.
 * @author Alejandro Sanchez Serrano
 * @version 1.0
 * @since 1.0
 */
public class Partida {
	/**
	 * Almacena el primer jugador.
	 */
	private Jugador jugador1;
	/**
	 * Almacena el segundo jugador.
	 */
	private Jugador jugador2;
	
	/**
	 * Amacena un booleano: true: fin de la partida, false: continua la partida.
	 */
	private boolean ganar;
	
	/**
	 * Metodo que recoge los metodos principales de la partida.
	 * @see #pedirJuego()
	 * @see #partidaJugadores()
	 */
	public void partida() {
		int tipo;
		tipo = pedirJuego();
			
		if(tipo == 1 || tipo == 2 || tipo == 3) {
			partidaJugadores();	
		}		
	}
	
	/**
	 * Metodo que define el tipo de partida segun quiera el usuario
	 * @return Devuelve la eleccion del usuario.
	 */
	private int pedirJuego() {
		ConsoleInput console = new ConsoleInput(new Scanner(System.in));
		int lector;
		
		System.out.println("Bienvenidos jugador 1 y jugador 2\n");
		System.out.println("1. Jugador vs Jugador");
		System.out.println("2. Jugador vs IA");
		System.out.println("3. IA vs IA");
		System.out.println("4. Salir");
		lector=console.readIntInRange(1, 4);
		switch (lector) {
		case 1:
				jugador1 = new Persona(Ficha.NEGRA);
				jugador2 = new Persona(Ficha.BLANCA);
	
			break;
		case 2:
				jugador1 = new Persona(Ficha.NEGRA);
				jugador2 = new IA(Ficha.BLANCA);		
			break;
		case 3:
				jugador1 = new IA(Ficha.NEGRA);
				jugador2 = new IA(Ficha.BLANCA);	
			break;
		}	
		return lector;
	}
	
	/**
	 * Metodo que se encarga de las comprobaciones relacionadas con los turnos y el fin de la partida.
	 */
	private void partidaJugadores() {
		Tablero tablero = new Tablero();
		do {
			ganar=true;
			if (tablero.finalPartida(jugador1.getFicha())) {
				System.out.println("Turno del jugador1 --> " + jugador1.getFicha());
					tablero.interfaz();
					jugador1.devolverJugada(tablero);
			}
			if(tablero.finalPartida(jugador2.getFicha())){
				System.out.println("Turno del jugador2 --> " + jugador2.getFicha());
					tablero.interfaz();
					jugador2.devolverJugada(tablero);
			}
			if(tablero.finalPartida(jugador1.getFicha())||tablero.finalPartida(jugador2.getFicha())) {
				ganar=false;
			}
		} while (!ganar);
		tablero.interfaz();
		if(tablero.contarFichasNegras() > tablero.contarFichasBlancas()) {
			System.out.println("Gana el jugador1");
		}else {
			System.out.println("Gana el jugador2");
		}	
	}
}
