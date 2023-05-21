package juego;

import java.util.Arrays;

/**
 * Clase que representa el tablero del juego.
 * @author Alejandro Sanchez Serrano
 * @version 1.0
 * @since 1.0
 */
public class Tablero {
	/**
	 * Atributo array de dos dimensiones de la clase Tablero que almacena el taablero.
	 */
	private Casilla[][] tablero = new Casilla[8][8];
	
	/**
	 * Metodo que devuelve el tablero.
	 * @return Devuelve el tablero.
	 */
	public Casilla[][] getTablero() {
		return tablero;
	}
	
	/**
	 * Metodo que se encarga de iniciar el tablero.
	 */
	private void iniciarTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}

		tablero[3][3].setFicha(Ficha.BLANCA);
		tablero[3][4].setFicha(Ficha.NEGRA);
		tablero[4][3].setFicha(Ficha.NEGRA);
		tablero[4][4].setFicha(Ficha.BLANCA);
	}
	
	/**
	 * Constructor de la clase tablero.
	 */
	public Tablero() {
		iniciarTablero();
	}
	
	/**
	 * Metodo que imprime el tablero.
	 */
	public void imprimirTablero() {
		System.out.printf("%5s%s%s%s%s%s%s%s"," 1 "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 ", " 8 ");
		System.out.println();
		
		for (int i = 0; i < tablero.length; i++) {
			System.out.print(i + 1 +" ");
			for (int j = 0; j < tablero[i].length; j++) {		
				System.out.print(tablero[i][j].pintarCasilla());
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * Metodo que recibe una coordenada y devuelve la casilla a la que pertenece.
	 * @param coordenada Coordenada que recibe.
	 * @return Devuelve la casilla a la que pertenece la coordenada.
	 */
	public Casilla devolverCasilla(Coordenada coordenada) {
		return tablero[coordenada.getY()][coordenada.getX()];
	}
	
	/**
	 * Metodo que coloca una ficha segun la coordenada y el tipo de ficha recibidos por parametro.
	 * @param coordenada Coordenada donde se quiere colocar la ficha.
	 * @param ficha Tipo de ficha.
	 * @see #voltearFichas(Casilla, Ficha)
	 */
	public void colocarFicha(Coordenada coordenada,Ficha ficha) {
		tablero[coordenada.getY()][coordenada.getX()].setFicha(ficha);
		System.out.printf("Coordenadas: %s\n",coordenada.mostrarCoordenada());
		voltearFichas(devolverCasilla(coordenada), ficha);
	}
	
	/**
	 * Metodo que se encarga de comprobar si la casilla esta llena o vacia.
	 * @param coordenada Coordenada de la casilla que se quiere comprobar.
	 * @return Devuelve si la casilla esta llena o vacia.
	 */
	public boolean comprobarCoordenada(Coordenada coordenada) {
		return tablero[coordenada.getY()][coordenada.getX()].isLleno();
	}
	
	/**
	 * Metodo que comprueba si el jugador tiene  turno.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Devuelve un booleano: true: quedan jugadas para ese jugador, false: no queda ninguna jugada para ese jugador.
	 * @see #comprobarDirecciones(Casilla, Ficha) 
	 */
	public boolean finalPartida(Ficha ficha) {
		boolean fin = false;
		
		for (int i = 0; i < tablero.length&&!fin; i++) {
			for (int j = 0; j < tablero[i].length&&!fin; j++) {
				if(!tablero[i][j].isLleno()&&comprobarDirecciones(tablero[i][j], ficha)) {
					fin = true;
				}
			} 
		}
		return fin;
	}
	
	/**
	 * Metodo que imprime el tablero y la informacion relacionada con este.
	 * @see #imprimirTablero() 
	 * @see #contarFichasNegras()
	 */
	public void interfaz() {
		imprimirTablero();
		contarFichas();
	}
	
	/**
	 * Metodo que comprueba que la jugada sea valida.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Ficha del jugador.
	 * @return Devuelve un booleano: true: la jugada es valida, false: la jugada no es valida.
	 * @see #comprobarIzquierda(Casilla, Ficha)
	 * @see #comprobarDerecha(Casilla, Ficha)
	 * @see #comprobarArriba(Casilla, Ficha)
	 * @see #comprobarAbajo(Casilla, Ficha)
	 * @see #comprobarArribaIzquierda(Casilla, Ficha)
	 * @see #comprobarArribaDerecha(Casilla, Ficha)
	 * @see #comprobarAbajoIzquierda(Casilla, Ficha)
	 * @see #comprobarAbajoDerecha(Casilla, Ficha)
	 */
	public boolean comprobarDirecciones(Casilla casilla,Ficha ficha) {
			return comprobarIzquierda(casilla,ficha)||
					comprobarDerecha(casilla,ficha)||
					comprobarArriba(casilla,ficha)||
					comprobarAbajo(casilla,ficha)||
					comprobarArribaIzquierda(casilla,ficha)||
					comprobarArribaDerecha(casilla,ficha)||
					comprobarAbajoIzquierda(casilla,ficha)||
					comprobarAbajoDerecha(casilla,ficha);
	}
	
	/**
	 * Metodo que voltea las fichas si la jugada es valida.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @see #voltearIzquierda(Casilla, Ficha)
	 * @see #voltearDerecha(Casilla, Ficha)
	 * @see #voltearArriba(Casilla, Ficha)
	 * @see #voltearAbajo(Casilla, Ficha)
	 * @see #voltearArribaIzquierda(Casilla, Ficha)
	 * @see #voltearArribaDerecha(Casilla, Ficha)
	 * @see #voltearAbajoIzquierda(Casilla, Ficha)
	 * @see #voltearAbajoDerecha(Casilla, Ficha)
	 */
	public void voltearFichas(Casilla casilla, Ficha ficha) {
		voltearIzquierda(casilla,ficha);
		voltearDerecha(casilla,ficha);
		voltearArriba(casilla,ficha);
		voltearAbajo(casilla,ficha);
		voltearArribaIzquierda(casilla,ficha);
		voltearArribaDerecha(casilla,ficha);
		voltearAbajoIzquierda(casilla,ficha);
		voltearAbajoDerecha(casilla,ficha);
	}
	
	/**
	 * Metodo que devuelve la cantidad de fichas volteadas.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Cantidad de fichas volteadas.
	 * @see #fichasVolteadasIzquierda(Casilla, Ficha)
	 * @see #fichasVolteadasDerecha(Casilla, Ficha)
	 * @see #fichasVolteadasArriba(Casilla, Ficha)
	 * @see #fichasVolteadasAbajo(Casilla, Ficha)
	 * @see #fichasVolteadasArribaIzquierda(Casilla, Ficha)
	 * @see #fichasVolteadasArribaDerecha(Casilla, Ficha)
	 * @see #fichasVolteadasAbajoIzquierda(Casilla, Ficha)
	 * @see #fichasVolteadasAbajoDerecha(Casilla, Ficha)
	 */
	public int fichasVolteadas(Casilla casilla, Ficha ficha) {
		return ( fichasVolteadasIzquierda(casilla, ficha)
		+fichasVolteadasDerecha(casilla, ficha)
		+fichasVolteadasArriba(casilla, ficha)
		+fichasVolteadasAbajo(casilla, ficha)
		+fichasVolteadasArribaIzquierda(casilla, ficha)
		+fichasVolteadasArribaDerecha(casilla, ficha)
		+fichasVolteadasAbajoIzquierda(casilla, ficha)
		+fichasVolteadasAbajoDerecha(casilla, ficha));
	}
	
	/**
	 * Metodo que cuenta la cantidad de fichas de cada tipo que hay en el tablero.
	 * @see #contarFichasNegras()
	 * @see #contarFichasBlancas()
	 */
	public void contarFichas() {
		System.out.printf("Negras: %d Blancas: %d\n\n",contarFichasNegras(),contarFichasBlancas());
	}
	
	/**
	 * Metododo que cuenta la cantidad de fichas negras que hay en el tablero.
	 * @return Cantidad de fichas negras que hay en el tablero.
	 */
	public int contarFichasNegras() {
		int negras = 0;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j].getFicha() == Ficha.NEGRA) {
					negras++;
				}
			}
		}
		return negras;
	}
	
	/**
	 * Metododo que cuenta la cantidad de fichas blancas que hay en el tablero.
	 * @return Cantidad de fichas blancas que hay en el tablero.
	 */
	public int contarFichasBlancas() {
		int blancas = 0;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j].getFicha() == Ficha.BLANCA) {
					blancas++;
				}
			}
		}
		return blancas;
	}
	
	/**
	 * Metodo que comprueba la direccion izquierda de una casilla para ver si la jugada es posible.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Devuelve un booleano: true: la jugada es posible, false: la jugada no es posible.
	 */
	private boolean comprobarIzquierda(Casilla casilla,Ficha ficha) {
		boolean exit = false;
		boolean validar = false;
		int count = casilla.getCoordenada().getX() - 1;
		Ficha fichaContraria = ficha == Ficha.NEGRA ? Ficha.BLANCA : Ficha.NEGRA;
		
		if(count >= 0) {
			if(tablero[casilla.getCoordenada().getY()][count].getFicha() == fichaContraria) {
				do {					
					if(count < 0) {
						exit = true;
					}else if(tablero[casilla.getCoordenada().getY()][count].getFicha() == ficha){
						validar = true;
						exit = true;
					}else if(!tablero[casilla.getCoordenada().getY()][count].isLleno()) {
						exit = true;
					}			
					count--;
			    } while(!exit);
			}
		}	
		return validar;
	}
	
	/**
	 * Metodo que comprueba la direccion derecha de una casilla para ver si la jugada es posible.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Devuelve un booleano: true: la jugada es posible, false: la jugada no es posible.
	 */
	private boolean comprobarDerecha(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		boolean validar = false;
		int count = casilla.getCoordenada().getX() + 1;
		Ficha fichaContraria = ficha == Ficha.NEGRA ? Ficha.BLANCA : Ficha.NEGRA;
		
		if(count <= 7) {
			if(tablero[casilla.getCoordenada().getY()][count].getFicha() == fichaContraria) {
				do {					
					if(count >= tablero.length) {
						exit = true;
					}else if(tablero[casilla.getCoordenada().getY()][count].getFicha() == ficha){
						validar = true;
						exit = true;
					}else if(!tablero[casilla.getCoordenada().getY()][count].isLleno()) {
						exit = true;
					}			
					count++;
			    } while(!exit);
			}
		}	
		return validar;
	}
	
	/**
	 * Metodo que comprueba la direccion arriba de una casilla para ver si la jugada es posible.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Devuelve un booleano: true: la jugada es posible, false: la jugada no es posible.
	 */
	private boolean comprobarArriba(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		boolean validar = false;
		int count = casilla.getCoordenada().getY() - 1;
		Ficha fichaContraria = ficha == Ficha.NEGRA ? Ficha.BLANCA : Ficha.NEGRA;
		
		if(count >= 0) {
			if(tablero[count][casilla.getCoordenada().getX()].getFicha() == fichaContraria) {
				do {
					if(count < 0) {
						exit = true;
					}else if(tablero[count][casilla.getCoordenada().getX()].getFicha() == ficha) {
						validar = true;
						exit = true;
					}else if (!tablero[count][casilla.getCoordenada().getX()].isLleno()){
						exit = true;
					}
					count--;
			    } while(!exit);
			}
		}	
		return validar;
	}
	
	/**
	 * Metodo que comprueba la direccion abajo de una casilla para ver si la jugada es posible.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Devuelve un booleano: true: la jugada es posible, false: la jugada no es posible.
	 */
	private boolean comprobarAbajo(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		boolean validar = false;
		int count = casilla.getCoordenada().getY() + 1;
		Ficha fichaContraria = ficha == Ficha.NEGRA ? Ficha.BLANCA : Ficha.NEGRA;
		
		if(count <= 7) {
			if(tablero[count][casilla.getCoordenada().getX()].getFicha() == fichaContraria) {
				do {
					
					if(count >= tablero.length) {
						exit = true;
					}else if(tablero[count][casilla.getCoordenada().getX()].getFicha() == ficha){
						validar = true;
						exit = true;
					}else if(!tablero[count][casilla.getCoordenada().getX()].isLleno()) {
						exit = true;
					}
					
					count++;
			    } while(!exit);
			}
		}	
		return validar;
	}
	
	/**
	 * Metodo que comprueba la direccion arriba izquierda de una casilla para ver si la jugada es posible.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Devuelve un booleano: true: la jugada es posible, false: la jugada no es posible.
	 */
	private boolean comprobarArribaIzquierda(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		boolean validar = false;
		int countY = casilla.getCoordenada().getY() - 1;
		int countX = casilla.getCoordenada().getX() - 1;
		Ficha fichaContraria = ficha == Ficha.NEGRA ? Ficha.BLANCA : Ficha.NEGRA;
		
		if(countX >= 1 && countY >= 0) {
			if(tablero[countY][countX].getFicha() == fichaContraria) {
				do {
					if(countX < 0 || countY < 0) {
						exit = true;
					}else if(tablero[countY][countX].getFicha() == ficha) {
						validar = true;
						exit = true;
				}else if (!tablero[countY][countX].isLleno()){
					exit = true;
				}
					countX--;
					countY--;
			    } while(!exit);
			}
		}
		return validar;
	}
	
	/**
	 * Metodo que comprueba la direccion arriba derecha de una casilla para ver si la jugada es posible.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Devuelve un booleano: true: la jugada es posible, false: la jugada no es posible.
	 */
	private boolean comprobarArribaDerecha(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		boolean validar = false;
		int countY = casilla.getCoordenada().getY() - 1;
		int countX = casilla.getCoordenada().getX() + 1;
		Ficha fichaContraria = ficha == Ficha.NEGRA ? Ficha.BLANCA : Ficha.NEGRA;
		
		if(countX <= 7 && countY >= 0) {
			if(tablero[countY][countX].getFicha() == fichaContraria) {
				do {
					if(countX >= 8 || countY < 0) {
						exit = true;
					}else if(tablero[countY][countX].getFicha() == ficha) {
						validar = true;
						exit = true;
				}else if (!tablero[countY][countX].isLleno()){
					exit = true;
				}
					countX++;
					countY--;
			    } while(!exit);
			}
		}	
		return validar;
	}
	
	/**
	 * Metodo que comprueba la direccion abajo izquierda de una casilla para ver si la jugada es posible.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Devuelve un booleano: true: la jugada es posible, false: la jugada no es posible.
	 */
	private boolean comprobarAbajoIzquierda(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		boolean validar = false;
		int countY = casilla.getCoordenada().getY()+1;
		int countX = casilla.getCoordenada().getX()-1;
		Ficha fichaContraria = ficha == Ficha.NEGRA ? Ficha.BLANCA : Ficha.NEGRA;
		
		if(countX >= 0 && countY <= 7) {
			if(tablero[countY][countX].getFicha() == fichaContraria) {
				do {
					if(countX < 0 || countY >= 8) {
						exit = true;
					}else if(tablero[countY][countX].getFicha() == ficha) {
							validar = true;
							exit = true;
					}else if (!tablero[countY][countX].isLleno()){
						exit = true;
					}
					countX--;
					countY++;
			    } while(!exit);
			}
		}
		return validar;
	}
	
	/**
	 * Metodo que comprueba la direccion abajo derecha de una casilla para ver si la jugada es posible.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Devuelve un booleano: true: la jugada es posible, false: la jugada no es posible.
	 */
	private boolean comprobarAbajoDerecha(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		boolean validar = false;
		int countY = casilla.getCoordenada().getY() + 1;
		int countX = casilla.getCoordenada().getX() + 1;
		Ficha fichaContraria = ficha == Ficha.NEGRA ? Ficha.BLANCA : Ficha.NEGRA;
		
		if(countX <= 7 && countY <= 7) {
			if(tablero[countY][countX].getFicha() == fichaContraria) {
				do {
					if(countX >= 8 || countY >= 8) {
						exit = true;
					}else if(tablero[countY][countX].getFicha() == ficha) {				
						validar = true;
						exit = true;
					}else if (!tablero[countY][countX].isLleno()){
						exit = true;
					}
					countX++;
					countY++;
			    } while(!exit);			
			}
		}	
		return validar;
	}
	
	/**
	 * Metodo que voltea fichas a la izquierda de una casilla si es posible.
	 * @param casilla Casilla que queremos comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @see #comprobarIzquierda(Casilla, Ficha)
	 */
	private void voltearIzquierda(Casilla casilla, Ficha ficha) {		
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() - 1;
		if(comprobarIzquierda(casilla, ficha)) {
			do {
				if(ficha != tablero[casilla.getCoordenada().getY()][countX].getFicha()) {
					tablero[casilla.getCoordenada().getY()][countX].setFicha(ficha);
				}else {
					exit = true;
				}
				countX--;
			}while(!exit);
		}
	}
	
	/**
	 * Metodo que voltea fichas a la derecha de una casilla si es posible.
	 * @param casilla Casilla que queremos comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @see #comprobarDerecha(Casilla, Ficha)
	 */
	private void voltearDerecha(Casilla casilla, Ficha ficha) {		
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() + 1;
		if(comprobarDerecha(casilla, ficha)) {
			do {
				if(ficha != tablero[casilla.getCoordenada().getY()][countX].getFicha()) {
					tablero[casilla.getCoordenada().getY()][countX].setFicha(ficha);
				}else {
					exit = true;
				}
				countX++;
			}while(!exit);
		}
	}
	
	/**
	 * Metodo que voltea fichas arriba de una casilla si es posible.
	 * @param casilla Casilla que queremos comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @see #comprobarArriba(Casilla, Ficha)
	 */
	private void voltearArriba(Casilla casilla,Ficha ficha) {		
		boolean exit = false;
		int countY = casilla.getCoordenada().getY() - 1;
		if(comprobarArriba(casilla,ficha)) {
			do {
				if(ficha != tablero[countY][casilla.getCoordenada().getX()].getFicha()) {
					tablero[countY][casilla.getCoordenada().getX()].setFicha(ficha);
				}else {
					exit = true;
				}
				countY--;
			}while(!exit);
		}
	}
	
	/**
	 * Metodo que voltea fichas abajo de una casilla si es posible.
	 * @param casilla Casilla que queremos comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @see #comprobarAbajo(Casilla, Ficha)
	 */
	private void voltearAbajo(Casilla casilla, Ficha ficha) {		
		boolean exit = false;
		int countY = casilla.getCoordenada().getY() + 1;
		if(comprobarAbajo(casilla, ficha)) {
			do {
				if(ficha != tablero[countY][casilla.getCoordenada().getX()].getFicha()) {
					tablero[countY][casilla.getCoordenada().getX()].setFicha(ficha);
				}else {
					exit = true;
				}
				countY++;
			}while(!exit);
		}
	}
	
	/**
	 * Metodo que voltea fichas arriba izquierda de una casilla si es posible.
	 * @param casilla Casilla que queremos comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @see #comprobarArribaIzquierda(Casilla, Ficha)
	 */
	private void voltearArribaIzquierda(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() - 1;
		int countY = casilla.getCoordenada().getY() - 1;
		if(comprobarArribaIzquierda(casilla, ficha)) {
			do {
				if(ficha != tablero[countY][countX].getFicha()) {
					tablero[countY][countX].setFicha(ficha);
				}else {
					exit = true;
				}
				countX--;
				countY--;
			}while(!exit);
		}
	}
	
	/**
	 * Metodo que voltea fichas arriba derecha de una casilla si es posible.
	 * @param casilla Casilla que queremos comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @see #comprobarArribaDerecha(Casilla, Ficha)
	 */
	private void voltearArribaDerecha(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() + 1;
		int countY = casilla.getCoordenada().getY() - 1;
		if(comprobarArribaDerecha(casilla,ficha)) {
			do {
				if(ficha != tablero[countY][countX].getFicha()) {
					tablero[countY][countX].setFicha(ficha);
				}else {
					exit = true;
				}
				countX++;
				countY--;
			}while(!exit);
		}
	}
	
	/**
	 * Metodo que voltea fichas abajo izquierda de una casilla si es posible.
	 * @param casilla Casilla que queremos comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @see #comprobarAbajoIzquierda(Casilla, Ficha)
	 */
	private void voltearAbajoIzquierda(Casilla casilla,Ficha ficha) {
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() - 1;
		int countY = casilla.getCoordenada().getY() + 1;
		if(comprobarAbajoIzquierda(casilla,ficha)) {
			do {

				if(ficha != tablero[countY][countX].getFicha()) {
					tablero[countY][countX].setFicha(ficha);
				}else {
					exit = true;
				}
				countX--;
				countY++;
			}while(!exit);
		}
	}
	
	/**
	 * Metodo que voltea fichas abajo derecha de una casilla si es posible.
	 * @param casilla Casilla que queremos comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @see #comprobarAbajoDerecha(Casilla, Ficha)
	 */
	private void voltearAbajoDerecha(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() + 1;
		int countY = casilla.getCoordenada().getY() + 1;
		if(comprobarAbajoDerecha(casilla, ficha)) {
			do {
				if(ficha != tablero[countY][countX].getFicha()) {
					tablero[countY][countX].setFicha(ficha);
				}else {
					exit = true;
				}
				countX++;
				countY++;
			}while(!exit);
		}
	}
	
	/**
	 * Metodo que cuenta la cantidad de fichas volteadas a la izquierda.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Cantidad de fichas volteadas.
	 * @see #comprobarIzquierda(Casilla, Ficha)
	 */
	private int fichasVolteadasIzquierda(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() - 1;
		int contarFichas = 0;
		if(comprobarIzquierda(casilla, ficha)) {
			do {
				if(ficha != tablero[casilla.getCoordenada().getY()][countX].getFicha()) {
					contarFichas++;
				}else {
					exit = true;
				}
				countX--;
			}while(!exit);
		}
		return contarFichas;
	}
	
	/**
	 * Metodo que cuenta la cantidad de fichas volteadas a la derecha.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Cantidad de fichas volteadas.
	 * @see #comprobarDerecha(Casilla, Ficha)
	 */
	private int fichasVolteadasDerecha(Casilla casilla, Ficha ficha) {		
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() + 1;
		int contarFichas = 0;
		if(comprobarDerecha(casilla, ficha)) {
			do {
				if(ficha != tablero[casilla.getCoordenada().getY()][countX].getFicha()) {
					contarFichas++;
				}else {
					exit = true;
				}
				countX++;
			}while(!exit);
		}
		return contarFichas;
	}
	
	/**
	 * Metodo que cuenta la cantidad de fichas volteadas arriba.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Cantidad de fichas volteadas.
	 * @see #comprobarArriba(Casilla, Ficha)
	 */
	private int fichasVolteadasArriba(Casilla casilla,Ficha ficha) {		
		boolean exit = false;
		int countY = casilla.getCoordenada().getY() - 1;
		
		int contarFichas = 0;
		if(comprobarArriba(casilla,ficha)) {
			do {
				if(ficha != tablero[countY][casilla.getCoordenada().getX()].getFicha()) {
					contarFichas++;
				}else {
					exit = true;
				}
				countY--;
			}while(!exit);
		}
		return contarFichas;
	}
	
	/**
	 * Metodo que cuenta la cantidad de fichas volteadas abajo.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Cantidad de fichas volteadas.
	 * @see #comprobarAbajo(Casilla, Ficha)
	 */
	private int fichasVolteadasAbajo(Casilla casilla, Ficha ficha) {		
		boolean exit = false;
		int countY = casilla.getCoordenada().getY() + 1;
		int contarFichas = 0;
		if(comprobarAbajo(casilla, ficha)) {
			do {
				if(ficha != tablero[countY][casilla.getCoordenada().getX()].getFicha()) {
					contarFichas++;
				}else {
					exit = true;
				}
				countY++;
			}while(!exit);
		}
		return contarFichas;
	}
	
	/**
	 * Metodo que cuenta la cantidad de fichas volteadas arriba izquierda.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Cantidad de fichas volteadas.
	 * @see #comprobarArribaIzquierda(Casilla, Ficha)
	 */
	private int fichasVolteadasArribaIzquierda(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() - 1;
		int countY = casilla.getCoordenada().getY() - 1;
		int contarFichas = 0;
		if(comprobarArribaIzquierda(casilla, ficha)) {
			do {
				if(ficha != tablero[countY][countX].getFicha()) {
					contarFichas++;
				}else {
					exit = true;
				}
				countX--;
				countY--;
			}while(!exit);
		}
		return contarFichas;
	}
	
	/**
	 * Metodo que cuenta la cantidad de fichas volteadas arriba derecha.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Cantidad de fichas volteadas.
	 * @see #comprobarArribaDerecha(Casilla, Ficha)
	 */
	private int fichasVolteadasArribaDerecha(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() + 1;
		int countY = casilla.getCoordenada().getY() - 1;
		int contarFichas = 0;
		if(comprobarArribaDerecha(casilla,ficha)) {
			do {
				if(ficha != tablero[countY][countX].getFicha()) {
					contarFichas++;
				}else {
					exit = true;
				}
				countX++;
				countY--;
			}while(!exit);
		}
		return contarFichas;
	}
	
	/**
	 * Metodo que cuenta la cantidad de fichas volteadas abajo izquierda.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Cantidad de fichas volteadas.
	 * @see #comprobarAbajoIzquierda(Casilla, Ficha)
	 */
	private int fichasVolteadasAbajoIzquierda(Casilla casilla,Ficha ficha) {
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() - 1;
		int countY = casilla.getCoordenada().getY() + 1;
		int contarFichas = 0;
		if(comprobarAbajoIzquierda(casilla,ficha)) {
			do {
				if(ficha != tablero[countY][countX].getFicha()) {
					contarFichas++;
				}else {
					exit = true;
				}
				countX--;
				countY++;
			}while(!exit);
		}
		return contarFichas;
	}
	
	/**
	 * Metodo que cuenta la cantidad de fichas volteadas abajo derecha.
	 * @param casilla Casilla que se quiere comprobar.
	 * @param ficha Tipo de ficha del jugador.
	 * @return Cantidad de fichas volteadas.
	 * @see #comprobarAbajoDerecha(Casilla, Ficha)
	 */
	private int fichasVolteadasAbajoDerecha(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		int countX = casilla.getCoordenada().getX() + 1;
		int countY = casilla.getCoordenada().getY() + 1;
		int contarFichas = 0;
		if(comprobarAbajoDerecha(casilla, ficha)) {
			do {
				if(ficha != tablero[countY][countX].getFicha()) {
					contarFichas++;
				}else {
					exit = true;
				}
				countX++;
				countY++;
			}while(!exit);
		}
		return contarFichas;
	}
	
	/**
	 * Metodo heredado de la clase Object donde devuelve el hashcode del objeto.
	 * @return hashcode del objeto.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(tablero);
		return result;
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
		Tablero other = (Tablero) obj;
		return Arrays.deepEquals(tablero, other.tablero);
	}
	
}