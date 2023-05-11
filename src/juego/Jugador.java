package juego;

public abstract class Jugador {
	protected Ficha ficha;
	
	Jugador(Ficha ficha) {
		this.ficha = ficha;
	}
	
	public Ficha getFicha() {
		return ficha;
	}
	public abstract boolean devolverJugada(Tablero tablero);
}
