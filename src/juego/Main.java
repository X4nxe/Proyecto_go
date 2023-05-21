package juego;

/**
 * Clase que muestra la partida.
 * @author Alejandro Sanchez Serrano
 * @version 1.0
 * @since 1.0
 */
public class Main {
	
	/**
	 * Metodo que muestra la partida.
	 */
	private void show() {
		Partida partida = new Partida();
		partida.partida();
	}
	
	/**
	 * Metodo donde se inicia el metodo show.
	 * @param args Array de Strings.
	 */
	public static void main(String[] args) {
		new Main().show();
	}

}
