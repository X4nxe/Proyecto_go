package juego;
/**
 * Clase utilizada para realizar el movimiento de la IA.
 * @author Alejandro Sanchez Serrano
 * @version 1.0
 * @since 1.0
 */
public class MovimientoIA {
	/**
	 * Atributo de la clase MovimientoIA que almacena las coordenadas.
	 */
	private Coordenada coordenada;
	
	/**
	 * Atributo de la clase MovimientoIA que almacena las posibles fichas volteadas en cada jugada.
	 */
	private int fichasVolteadas;
	
	/**
	 * Constructor de la clase MovimientoIA.
	 * @param coordenada Atributo coordenada de la clase MovimientoIA.
	 * @param fichasVolteadas Atributo int de la clase MovimientoIA.
	 */
	public MovimientoIA(Coordenada coordenada, int fichasVolteadas) {
		this.coordenada = coordenada;
		this.fichasVolteadas = fichasVolteadas;
	}
	
	/**
	 * Metodo que devuelve el atributo coordenada de la clase MovimientoIA.
	 * @return Devuelve el atributo coordenada de la clase MovimientoIA.
	 */
	public Coordenada getCoordenada() {
		return coordenada;
	}
	
	/**
	 * Metodo que devuelve el atributo FichasVolteadas de la clase MovimientoIA.
	 * @return Devuelve el atributo FichasVolteadas de la clase MovimientoIA.
	 */
	public int getFichasVolteadas() {
		return fichasVolteadas;
	}
}
