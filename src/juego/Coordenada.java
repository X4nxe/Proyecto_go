package juego;

import java.util.Objects;

/**
 * Esta clase es utilizada para almacenar la coordenada de cada casilla.
 * @author Alejandro Sanchez Serrano
 * @version 1.0
 * @since 1.0
 */
public class Coordenada {
	/**
	 * Atributo que almacena el valor del eje x.
	 */
	private int x;
	/**
	 * Atributo que almacena el valor del eje y.
	 */
	private int y;
	
	/**
	 * Constructor de la clase coordenada.
	 * @param x Eje x de la coordenada.
	 * @param y Eje y de la coordenada.
	 */
	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Metodo que devuelve el valor del eje x.
	 * @return Devuelve el valor del eje x.
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Metodo que devuelve el valor del eje y.
	 * @return Devuelve el valor del eje y.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Metodo que muestra las coordenadas.
	 * @return Muestra las coordenadas con un formato reconocible para el usuario.
	 */
	public String mostrarCoordenada() {
		return String.format("%d,%d", x+1,y+1);
	}
	
	/**
	 * Metodo heredado de la clase Object donde devuelve el hashcode del objeto.
	 * @return Hashcode del objeto.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
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
		Coordenada other = (Coordenada) obj;
		return x == other.x && y == other.y;
	}
}
