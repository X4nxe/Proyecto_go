package juego;

/**
 * Clase abstracta padre de Persona e IA.
 * @author Alex
 * @version 1.0
 * @since 1.0
 */
public abstract class Jugador {
	
	/**
	 * Atributo tipo Ficha que almacena la ficha del jugador.
	 */
	protected Ficha ficha;
	
	/**
	 * Constructor de la clase Jugador.
	 * @param ficha Tipo de ficha.
	 */
	Jugador(Ficha ficha) {
		this.ficha = ficha;
	}
	
	/**
	 * Metodo que devuelve el tipo de ficha del jugador.
	 * @return Tipo de ficha del jugador.
	 */
	public Ficha getFicha() {
		return ficha;
	}
	
	/**
	 * Metodo abstracto que devuelve una jugada.
	 * @param tablero Tablero usado en la partida.
	 */
	public abstract void devolverJugada(Tablero tablero);
}
