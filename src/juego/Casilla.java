package juego;

import java.util.Objects;

/**
 * Clase utilizada para almacenar fichas en el tablero.
 * @author Alejandro Sanchez Serrano
 * @version 1.0
 * @since 1.0
 */

public class Casilla {
	/**
	 * Atributo que almacena el color de la ficha.
	 */
	private Ficha ficha;
	/**
	 * Atributo que almacena si la casilla esta llena o vacia.
	 */
	private boolean lleno;
	/**
	 * Atributo que almacena la posicion de la casilla en el tablero.
	 */
	private Coordenada coordenada;
	
	/**
	 * Metodo que devuelve la ficha que ocupa la casilla.
	 * @return devuelve la ficha.
	 */
	public Ficha getFicha() {
		return ficha;
	}
	
	/**
	 * Metodo que establece el color de la ficha almacenada e indica que la casilla esta llena.
	 * @param ficha El color de la ficha.
	 */
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
		lleno = true;
	}
	
	/**
	 * Metodo que devuelve si la casilla esta llena o vacia
	 * @return Devuelve un booleano: true: devuelve que la casilla esta llena, false: devuelve que la casilla esta vacia
	 */
	public boolean isLleno() {
		return lleno;
	}
	
	/**
	 * Metodo que devuelve la coordenada de la casilla.
	 * @return Devuelve la coordenada.
	 */
	public Coordenada getCoordenada() {
		return coordenada;
	}
	
	/**
	 * Constructor de la clase Casilla que establece que la casilla esta llena.
	 * @param coordenada Atributo Coordenada de la clase Casilla.
	 * @param ficha Atributo Ficha de la clase Casilla.
	 */
	Casilla(Coordenada coordenada,Ficha ficha) {
		this.ficha = ficha;
		this.coordenada = coordenada;
		lleno = true;
	}
	
	/**
	 * Constructor de la clase Casilla que establece que la casilla esta vacia.
	 * @param coordenada Atributo coordenada de la clase Casilla.
	 */
	public Casilla(Coordenada coordenada) {
		this.coordenada = coordenada;
		lleno = false;
	}
	
	/**
	 * Metodo que se encarga de pintar las casillas.
	 * @return Devuelve un booleano: lleno = true: devuelve la ficha, lleno = false: devuelve " . ". 
	 * @see #getCoordenada()
	 */
	public String pintarCasilla() {
		if(lleno) {
			return ficha.getFicha();
		}else {
			return " . ";
		}
	}
	
	/**
	 * Metodo heredado de la clase Object donde devuelve el hashcode del objeto.
	 * @return hashcode del objeto.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(coordenada, ficha, lleno);
	}
	
	/**
	 * Metodo heredado de la clase Object que compara la clase con otro objeto.
	 * @return Devuelve un booleano: true: son iguales, false: son distintos.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Casilla other = (Casilla) obj;
		return Objects.equals(coordenada, other.coordenada) && ficha == other.ficha && lleno == other.lleno;
	}
}
