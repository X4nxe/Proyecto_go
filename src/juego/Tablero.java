package juego;

public class Tablero {
	private Casilla[][] tablero = new Casilla[8][8];
	
	public Casilla[][] getTablero() {
		return tablero;
	}

	private void iniciarTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		tablero[4][4].setFicha(Ficha.BLANCA);
		tablero[3][3].setFicha(Ficha.BLANCA);
		tablero[3][4].setFicha(Ficha.NEGRA);
		tablero[4][3].setFicha(Ficha.NEGRA);
	}
	
	public Tablero() {
		iniciarTablero();
	}
	
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
		System.out.println("");
	}
	
	public Casilla devolverCasilla(Coordenada coordenada) {
		return tablero[coordenada.getY()][coordenada.getX()];
	}
	
	public void colocarFicha(Coordenada coordenada,Ficha ficha) {
		tablero[coordenada.getY()][coordenada.getX()].setFicha(ficha);
		System.out.printf("Coordenadas: %s\n",coordenada.toString());
		voltearFichas(devolverCasilla(coordenada), ficha);
	}
	
	public boolean comprobarCoordenada(Coordenada coordenada) {
		return tablero[coordenada.getY()][coordenada.getX()].isLleno();
	}
	
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
	
	public void interfaz() {
		imprimirTablero();
		contarFichas();
	}
	
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
	
	public void contarFichas() {
		System.out.printf("Negras: %d Blancas: %d\n\n",contarFichasNegras(),contarFichasBlancas());
	}
	
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
	
	private boolean comprobarArriba(Casilla casilla, Ficha ficha) {
		boolean exit = false;
		boolean validar = false;
		int count = casilla.getCoordenada().getY() - 1;
		Ficha fichaContraria = ficha == Ficha.NEGRA ? Ficha.BLANCA : Ficha.NEGRA;
		
		if(count >= 0) {
			if(tablero[count][casilla.getCoordenada().getX()].getFicha() == fichaContraria) {
				do {
					if(count < 0) {
						validar = false;
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
						validar = false;
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
						validar = false;
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
}
