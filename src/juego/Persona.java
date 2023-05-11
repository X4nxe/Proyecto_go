package juego;

import java.util.Scanner;

import consoleInput.ConsoleInput;

public class Persona extends Jugador {

	Persona(Ficha ficha) {
		super(ficha);
	}
	
	public boolean devolverJugada(Tablero tablero) {
		boolean turno = true;
		do {
			Coordenada coordenada = pedirCoordenada();
			if (!tablero.comprobarCoordenada(coordenada)) {
				if(tablero.comprobarDirecciones(tablero.devolverCasilla(coordenada),ficha)) {
					System.out.printf("Fichas volteadas: %d\n",tablero.fichasVolteadas(tablero.devolverCasilla(coordenada), ficha));
					tablero.colocarFicha(coordenada, ficha);
					System.out.println();
					turno = false;
				}else {
					System.out.println("Introduce un movimiento válido");
					tablero.interfaz();
				}		
			}
		}while(turno);
		
		return turno;
	}
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
