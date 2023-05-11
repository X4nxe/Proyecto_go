package juego;

import java.util.Scanner;

import consoleInput.ConsoleInput;

public class Partida {
	private Jugador jugador1;
	private Jugador jugador2;
	private boolean ganar;
	@SuppressWarnings("unused")
	private boolean turno;
	
	public void partida() {
		int tipo;
		tipo = pedirJuego();
			
		if(tipo == 1 || tipo == 2 || tipo == 3) {
			partidaJugadores();	
		}		
	}
	
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
