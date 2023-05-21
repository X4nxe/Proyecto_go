package consoleInput;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que almacena metodos de validacion.
 * @author Alejandro Sanchez Serrano
 * @version 1.0
 * @since 1.0
 */
public class ConsoleInput {
	
	/**
	 * Atributo final Scanner de la clase ConsoleInput.
	 */
	private final Scanner keyboard;
	
	/**
	 * Constructor de la clase ConsoleInput.
	 * @param keyboard Atributo Scanner de la clase ConsoleInput.
	 */
	public ConsoleInput(Scanner keyboard) {
		this.keyboard = keyboard;
	}
	
	/**
	 * Metodo que se encarga de limpiar la entrada por teclado.
	 */
	private void cleanInput() {
		keyboard.nextLine();
	}
	
	/**
	 * Metodo que valida si el valor introducido es de tipo int.
	 * @return El valor introducido ya validado. 
	 * @see #cleanInput()
	 */
	public int readInt() {

		boolean error = false;
		int dato_int = 0;

		do {
			try {
				dato_int = keyboard.nextInt();
				error = false;
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("Error, el valor introducido no es un int");
				error = true;
				cleanInput();
			}
		} while (error);
		return dato_int;
	}
	
	/**
	 * Metodo que valida si el valor introducido es tipo int y esta dentro del rango establecido.
	 * @param lowerBound Valor minimo.
	 * @param upperBound Valor maximo.
	 * @return Valor introducido ya validado.
	 * @see #readInt()
	 * @see #cleanInput()
	 */
	public int readIntInRange(int lowerBound, int upperBound) {

		int dato_int = 0;

		do {
			dato_int = readInt();
			if (dato_int < lowerBound || dato_int > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_int < lowerBound || dato_int > upperBound);
		return dato_int;
	}
}
