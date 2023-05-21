package juego;

/**
 * Enum que almacena el tipo de ficha.
 * @author Alejandro Sanchez Serrano
 * @version 1.0
 * @since 1.0
 */
public enum Ficha {
	/**
	 * Ficha negra.
	 */
	NEGRA("\u001B[30m 0 \u001B[0m"),
	/**
	 * Ficha blanca.
	 */
	BLANCA(" O ");
	
	/**
	 * Atributo de la clase Ficha que almacena el contenido cadena de NEGRA y BLANCA.
	 */
	private String ficha;
	
	/**
	 * Constructor de la clase Ficha.
	 * @param ficha Atributo ficha de la clase Ficha.
	 */
	Ficha(String ficha) {
		this.ficha = ficha;
	}
	
	/**
	 * Metodo de la clase Ficha que devuelve el tipo de ficha.
	 * @return Atributo ficha de la clase Ficha.
	 */
	public String getFicha() {
		return ficha;
	}
}
