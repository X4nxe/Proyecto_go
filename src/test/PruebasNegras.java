package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import juego.Casilla;
import juego.Coordenada;
import juego.Ficha;
import juego.Tablero;

class PruebasNegras {
	
	private void devolverJugada(Tablero tablero, Coordenada coordenada, Ficha ficha) {
		if (!tablero.comprobarCoordenada(coordenada)) {
			if(tablero.comprobarDirecciones(tablero.devolverCasilla(coordenada),ficha)) {
				tablero.colocarFicha(coordenada, ficha);
			}
		}
	}
	private void comprobacion1(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		tablero[1][0].setFicha(Ficha.NEGRA);
		tablero[2][1].setFicha(Ficha.BLANCA);
		tablero[3][2].setFicha(Ficha.BLANCA);
		
		tablero[1][3].setFicha(Ficha.NEGRA);
		tablero[2][3].setFicha(Ficha.BLANCA);
		tablero[3][3].setFicha(Ficha.BLANCA);
		
		tablero[1][6].setFicha(Ficha.NEGRA);
		tablero[2][5].setFicha(Ficha.BLANCA);
		tablero[3][4].setFicha(Ficha.BLANCA);
		
		tablero[4][0].setFicha(Ficha.NEGRA);
		tablero[4][1].setFicha(Ficha.BLANCA);
		tablero[4][2].setFicha(Ficha.BLANCA);
		
		tablero[7][0].setFicha(Ficha.NEGRA);
		tablero[6][1].setFicha(Ficha.BLANCA);
		tablero[5][2].setFicha(Ficha.BLANCA);
		
		tablero[7][3].setFicha(Ficha.NEGRA);
		tablero[6][3].setFicha(Ficha.BLANCA);
		tablero[5][3].setFicha(Ficha.BLANCA);
		
		tablero[7][6].setFicha(Ficha.NEGRA);
		tablero[6][5].setFicha(Ficha.BLANCA);
		tablero[5][4].setFicha(Ficha.BLANCA);
		
		tablero[4][6].setFicha(Ficha.NEGRA);
		tablero[4][5].setFicha(Ficha.BLANCA);
		tablero[4][4].setFicha(Ficha.BLANCA);
	}
	
	private void comprobacion2(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		tablero[0][1].setFicha(Ficha.NEGRA);
		tablero[1][2].setFicha(Ficha.BLANCA);
		tablero[2][3].setFicha(Ficha.BLANCA);
		
		tablero[0][4].setFicha(Ficha.NEGRA);
		tablero[1][4].setFicha(Ficha.BLANCA);
		tablero[2][4].setFicha(Ficha.BLANCA);
		
		tablero[0][7].setFicha(Ficha.NEGRA);
		tablero[1][6].setFicha(Ficha.BLANCA);
		tablero[2][5].setFicha(Ficha.BLANCA);
		
		tablero[3][1].setFicha(Ficha.NEGRA);
		tablero[3][2].setFicha(Ficha.BLANCA);
		tablero[3][3].setFicha(Ficha.BLANCA);
		
		tablero[6][1].setFicha(Ficha.NEGRA);
		tablero[5][2].setFicha(Ficha.BLANCA);
		tablero[4][3].setFicha(Ficha.BLANCA);
		
		tablero[6][4].setFicha(Ficha.NEGRA);
		tablero[5][4].setFicha(Ficha.BLANCA);
		tablero[4][4].setFicha(Ficha.BLANCA);
		
		tablero[6][7].setFicha(Ficha.NEGRA);
		tablero[5][6].setFicha(Ficha.BLANCA);
		tablero[4][5].setFicha(Ficha.BLANCA);
		
		tablero[3][7].setFicha(Ficha.NEGRA);
		tablero[3][6].setFicha(Ficha.BLANCA);
		tablero[3][5].setFicha(Ficha.BLANCA);
	}
	
	private void comprobacion3(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		tablero[1][1].setFicha(Ficha.NEGRA);
		tablero[1][2].setFicha(Ficha.BLANCA);
		tablero[1][3].setFicha(Ficha.BLANCA);
		tablero[1][4].setFicha(Ficha.BLANCA);
		tablero[1][5].setFicha(Ficha.BLANCA);
		
		tablero[6][1].setFicha(Ficha.NEGRA);
		tablero[5][2].setFicha(Ficha.BLANCA);
		tablero[4][3].setFicha(Ficha.BLANCA);
		tablero[3][4].setFicha(Ficha.BLANCA);
		tablero[2][5].setFicha(Ficha.BLANCA);
		
		tablero[6][6].setFicha(Ficha.NEGRA);
		tablero[5][6].setFicha(Ficha.BLANCA);
		tablero[4][6].setFicha(Ficha.BLANCA);
		tablero[3][6].setFicha(Ficha.BLANCA);
		tablero[2][6].setFicha(Ficha.BLANCA);
	}
	
	private void comprobacion4(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}

		tablero[0][1].setFicha(Ficha.BLANCA);
		tablero[0][2].setFicha(Ficha.BLANCA);
		tablero[0][3].setFicha(Ficha.BLANCA);
		tablero[0][4].setFicha(Ficha.NEGRA);
		
		
		tablero[1][0].setFicha(Ficha.BLANCA);
		tablero[2][0].setFicha(Ficha.BLANCA);
		tablero[3][0].setFicha(Ficha.BLANCA);
		tablero[4][0].setFicha(Ficha.BLANCA);
		tablero[5][0].setFicha(Ficha.BLANCA);
		tablero[6][0].setFicha(Ficha.BLANCA);
		tablero[7][0].setFicha(Ficha.NEGRA);
		
		tablero[1][1].setFicha(Ficha.BLANCA);
		tablero[2][2].setFicha(Ficha.BLANCA);
		tablero[3][3].setFicha(Ficha.BLANCA);
		tablero[4][4].setFicha(Ficha.BLANCA);
		tablero[5][5].setFicha(Ficha.NEGRA);
	}
	
	private void comprobacion5(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}

		tablero[0][0].setFicha(Ficha.NEGRA);
		tablero[1][0].setFicha(Ficha.BLANCA);
		tablero[2][0].setFicha(Ficha.BLANCA);
		tablero[3][0].setFicha(Ficha.BLANCA);
		tablero[4][0].setFicha(Ficha.BLANCA);
		tablero[5][0].setFicha(Ficha.BLANCA);
		tablero[6][0].setFicha(Ficha.BLANCA);
		
		tablero[6][1].setFicha(Ficha.BLANCA);
		tablero[5][2].setFicha(Ficha.BLANCA);
		tablero[4][3].setFicha(Ficha.BLANCA);
		tablero[3][4].setFicha(Ficha.BLANCA);
		tablero[2][5].setFicha(Ficha.BLANCA);
		tablero[1][6].setFicha(Ficha.BLANCA);
		tablero[0][7].setFicha(Ficha.NEGRA);
		
		tablero[7][1].setFicha(Ficha.BLANCA);
		tablero[7][2].setFicha(Ficha.BLANCA);
		tablero[7][3].setFicha(Ficha.BLANCA);
		tablero[7][4].setFicha(Ficha.BLANCA);
		tablero[7][5].setFicha(Ficha.BLANCA);
		tablero[7][6].setFicha(Ficha.BLANCA);
		tablero[7][7].setFicha(Ficha.NEGRA);
	}
	
	private void comprobacion6(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		
		tablero[3][0].setFicha(Ficha.NEGRA);
		tablero[3][1].setFicha(Ficha.BLANCA);
		tablero[3][2].setFicha(Ficha.BLANCA);
		tablero[3][3].setFicha(Ficha.BLANCA);
		tablero[3][4].setFicha(Ficha.BLANCA);
		tablero[3][5].setFicha(Ficha.BLANCA);
		tablero[3][6].setFicha(Ficha.BLANCA);
		
		tablero[4][7].setFicha(Ficha.BLANCA);
		tablero[5][7].setFicha(Ficha.NEGRA);
		
		tablero[1][7].setFicha(Ficha.NEGRA);
		tablero[2][7].setFicha(Ficha.BLANCA);
		
		tablero[1][5].setFicha(Ficha.NEGRA);
		tablero[2][6].setFicha(Ficha.BLANCA);
		
		tablero[4][6].setFicha(Ficha.BLANCA);
		tablero[5][5].setFicha(Ficha.NEGRA);
			
	}
	
	private void comprobacion7(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		
		tablero[2][0].setFicha(Ficha.NEGRA);
		tablero[2][1].setFicha(Ficha.BLANCA);
		
		tablero[4][0].setFicha(Ficha.NEGRA);
		tablero[3][1].setFicha(Ficha.BLANCA);
		
		tablero[0][2].setFicha(Ficha.NEGRA);
		tablero[1][2].setFicha(Ficha.BLANCA);
		
		tablero[3][3].setFicha(Ficha.BLANCA);
		tablero[4][4].setFicha(Ficha.NEGRA);
		
		tablero[2][3].setFicha(Ficha.BLANCA);
		tablero[2][4].setFicha(Ficha.NEGRA);
			
	}
	
	private void comprobacion8(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		
		tablero[2][2].setFicha(Ficha.NEGRA);
		tablero[3][3].setFicha(Ficha.BLANCA);
		tablero[4][4].setFicha(Ficha.BLANCA);
		
		tablero[5][3].setFicha(Ficha.NEGRA);
		tablero[5][4].setFicha(Ficha.BLANCA);
		
		tablero[6][4].setFicha(Ficha.BLANCA);
		tablero[7][3].setFicha(Ficha.NEGRA);
		
		tablero[6][5].setFicha(Ficha.BLANCA);
		tablero[7][5].setFicha(Ficha.NEGRA);
		
		tablero[6][6].setFicha(Ficha.BLANCA);
		tablero[7][7].setFicha(Ficha.NEGRA);
			
		tablero[5][6].setFicha(Ficha.BLANCA);
		tablero[5][7].setFicha(Ficha.NEGRA);
		
		tablero[4][6].setFicha(Ficha.BLANCA);
		tablero[3][7].setFicha(Ficha.NEGRA);
	}
	
	private void comprobacion9(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		
		tablero[1][1].setFicha(Ficha.NEGRA);
		tablero[2][2].setFicha(Ficha.BLANCA);
		tablero[3][3].setFicha(Ficha.BLANCA);
		tablero[4][4].setFicha(Ficha.BLANCA);
		tablero[5][5].setFicha(Ficha.BLANCA);
	}
	
	private void comprobacion10(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		
		tablero[2][2].setFicha(Ficha.BLANCA);
		tablero[3][3].setFicha(Ficha.BLANCA);
		tablero[4][4].setFicha(Ficha.BLANCA);
		tablero[5][5].setFicha(Ficha.BLANCA);
		tablero[6][6].setFicha(Ficha.NEGRA);
	}
	
	private void comprobacion11(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		
		tablero[1][1].setFicha(Ficha.NEGRA);
		tablero[2][2].setFicha(Ficha.BLANCA);
		tablero[3][3].setFicha(Ficha.BLANCA);
		tablero[4][4].setFicha(Ficha.BLANCA);
		tablero[5][5].setFicha(Ficha.BLANCA);
	}
	
	private void comprobacion12(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		
		tablero[1][5].setFicha(Ficha.NEGRA);
		tablero[2][4].setFicha(Ficha.BLANCA);
		
		tablero[4][4].setFicha(Ficha.BLANCA);
		tablero[5][5].setFicha(Ficha.BLANCA);
		tablero[6][6].setFicha(Ficha.NEGRA);
	}
	
	private void comprobacion13(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		tablero[1][6].setFicha(Ficha.BLANCA);
		tablero[2][5].setFicha(Ficha.BLANCA);
		tablero[3][4].setFicha(Ficha.BLANCA);
		tablero[4][3].setFicha(Ficha.BLANCA);
		tablero[5][2].setFicha(Ficha.BLANCA);
		tablero[6][1].setFicha(Ficha.BLANCA);
		tablero[7][0].setFicha(Ficha.NEGRA);
	}
	
	private void comprobacion14(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		tablero[0][0].setFicha(Ficha.NEGRA);
		tablero[1][1].setFicha(Ficha.BLANCA);
	}
	
	private void comprobacion15(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}
		tablero[0][0].setFicha(Ficha.NEGRA);
		tablero[1][1].setFicha(Ficha.BLANCA);
		tablero[2][2].setFicha(Ficha.BLANCA);
		tablero[3][3].setFicha(Ficha.BLANCA);
		tablero[4][4].setFicha(Ficha.BLANCA);
		tablero[5][5].setFicha(Ficha.BLANCA);
		tablero[6][6].setFicha(Ficha.BLANCA);
	}
	
	private void comprobacion16(Casilla[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] =new Casilla(new Coordenada(j,i));
			}
		}

		tablero[1][6].setFicha(Ficha.NEGRA);
		tablero[2][5].setFicha(Ficha.BLANCA);
		tablero[3][4].setFicha(Ficha.BLANCA);
		tablero[4][3].setFicha(Ficha.BLANCA);
		tablero[5][2].setFicha(Ficha.BLANCA);
	}
	
	@Test
	void comprobacion1() {
		Tablero tablero = new Tablero();

		Casilla[][] tableroCasillas = new Casilla[8][8];
		comprobacion1(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		tableroCasillas[1][0].setFicha(Ficha.NEGRA);
		tableroCasillas[2][1].setFicha(Ficha.NEGRA);
		tableroCasillas[3][2].setFicha(Ficha.NEGRA);
		
		tableroCasillas[1][3].setFicha(Ficha.NEGRA);
		tableroCasillas[2][3].setFicha(Ficha.NEGRA);
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		
		tableroCasillas[1][6].setFicha(Ficha.NEGRA);
		tableroCasillas[2][5].setFicha(Ficha.NEGRA);
		tableroCasillas[3][4].setFicha(Ficha.NEGRA);
		
		tableroCasillas[4][0].setFicha(Ficha.NEGRA);
		tableroCasillas[4][1].setFicha(Ficha.NEGRA);
		tableroCasillas[4][2].setFicha(Ficha.NEGRA);
		
		tableroCasillas[7][0].setFicha(Ficha.NEGRA);
		tableroCasillas[6][1].setFicha(Ficha.NEGRA);
		tableroCasillas[5][2].setFicha(Ficha.NEGRA);
		
		tableroCasillas[7][3].setFicha(Ficha.NEGRA);
		tableroCasillas[6][3].setFicha(Ficha.NEGRA);
		tableroCasillas[5][3].setFicha(Ficha.NEGRA);
		
		tableroCasillas[7][6].setFicha(Ficha.NEGRA);
		tableroCasillas[6][5].setFicha(Ficha.NEGRA);
		tableroCasillas[5][4].setFicha(Ficha.NEGRA);
		
		tableroCasillas[4][6].setFicha(Ficha.NEGRA);
		tableroCasillas[4][5].setFicha(Ficha.NEGRA);
		tableroCasillas[4][4].setFicha(Ficha.NEGRA);
		
		tableroCasillas[4][3].setFicha(Ficha.NEGRA);
		devolverJugada(tablero, new Coordenada(3,4), Ficha.NEGRA);

		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
	}
	
	@Test
	void comprobacion2() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion2(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		tableroCasillas[0][1].setFicha(Ficha.NEGRA);
		tableroCasillas[1][2].setFicha(Ficha.NEGRA);
		tableroCasillas[2][3].setFicha(Ficha.NEGRA);
		
		tableroCasillas[0][4].setFicha(Ficha.NEGRA);
		tableroCasillas[1][4].setFicha(Ficha.NEGRA);
		tableroCasillas[2][4].setFicha(Ficha.NEGRA);
		
		tableroCasillas[0][7].setFicha(Ficha.NEGRA);
		tableroCasillas[1][6].setFicha(Ficha.NEGRA);
		tableroCasillas[2][5].setFicha(Ficha.NEGRA);
		
		tableroCasillas[3][1].setFicha(Ficha.NEGRA);
		tableroCasillas[3][2].setFicha(Ficha.NEGRA);
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][1].setFicha(Ficha.NEGRA);
		tableroCasillas[5][2].setFicha(Ficha.NEGRA);
		tableroCasillas[4][3].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][4].setFicha(Ficha.NEGRA);
		tableroCasillas[5][4].setFicha(Ficha.NEGRA);
		tableroCasillas[4][4].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][7].setFicha(Ficha.NEGRA);
		tableroCasillas[5][6].setFicha(Ficha.NEGRA);
		tableroCasillas[4][5].setFicha(Ficha.NEGRA);
		
		tableroCasillas[3][7].setFicha(Ficha.NEGRA);
		tableroCasillas[3][6].setFicha(Ficha.NEGRA);
		tableroCasillas[3][5].setFicha(Ficha.NEGRA);
		
		tableroCasillas[3][4].setFicha(Ficha.NEGRA);
		devolverJugada(tablero, new Coordenada(4,3), Ficha.NEGRA);

		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);		
	}
	
	@Test
	void comprobacion3() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion3(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		tableroCasillas[1][1].setFicha(Ficha.NEGRA);
		tableroCasillas[1][2].setFicha(Ficha.NEGRA);
		tableroCasillas[1][3].setFicha(Ficha.NEGRA);
		tableroCasillas[1][4].setFicha(Ficha.NEGRA);
		tableroCasillas[1][5].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][1].setFicha(Ficha.NEGRA);
		tableroCasillas[5][2].setFicha(Ficha.NEGRA);
		tableroCasillas[4][3].setFicha(Ficha.NEGRA);
		tableroCasillas[3][4].setFicha(Ficha.NEGRA);
		tableroCasillas[2][5].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][6].setFicha(Ficha.NEGRA);
		tableroCasillas[5][6].setFicha(Ficha.NEGRA);
		tableroCasillas[4][6].setFicha(Ficha.NEGRA);
		tableroCasillas[3][6].setFicha(Ficha.NEGRA);
		tableroCasillas[2][6].setFicha(Ficha.NEGRA);
		
		tableroCasillas[1][6].setFicha(Ficha.NEGRA);
		devolverJugada(tablero, new Coordenada(6,1), Ficha.NEGRA);
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);	
	}
	@Test
	void comprobacion4() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion4(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[0][1].setFicha(Ficha.NEGRA);
		tableroCasillas[0][2].setFicha(Ficha.NEGRA);
		tableroCasillas[0][3].setFicha(Ficha.NEGRA);
		tableroCasillas[0][4].setFicha(Ficha.NEGRA);
		
		
		tableroCasillas[1][0].setFicha(Ficha.NEGRA);
		tableroCasillas[2][0].setFicha(Ficha.NEGRA);
		tableroCasillas[3][0].setFicha(Ficha.NEGRA);
		tableroCasillas[4][0].setFicha(Ficha.NEGRA);
		tableroCasillas[5][0].setFicha(Ficha.NEGRA);
		tableroCasillas[6][0].setFicha(Ficha.NEGRA);
		tableroCasillas[7][0].setFicha(Ficha.NEGRA);
		
		tableroCasillas[1][1].setFicha(Ficha.NEGRA);
		tableroCasillas[2][2].setFicha(Ficha.NEGRA);
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		tableroCasillas[4][4].setFicha(Ficha.NEGRA);
		tableroCasillas[5][5].setFicha(Ficha.NEGRA);
		
		tableroCasillas[0][0].setFicha(Ficha.NEGRA);
		devolverJugada(tablero, new Coordenada(0,0), Ficha.NEGRA);

		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
		
	}
	
	@Test
	void comprobacion5() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion5(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[0][0].setFicha(Ficha.NEGRA);
		tableroCasillas[1][0].setFicha(Ficha.NEGRA);
		tableroCasillas[2][0].setFicha(Ficha.NEGRA);
		tableroCasillas[3][0].setFicha(Ficha.NEGRA);
		tableroCasillas[4][0].setFicha(Ficha.NEGRA);
		tableroCasillas[5][0].setFicha(Ficha.NEGRA);
		tableroCasillas[6][0].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][1].setFicha(Ficha.NEGRA);
		tableroCasillas[5][2].setFicha(Ficha.NEGRA);
		tableroCasillas[4][3].setFicha(Ficha.NEGRA);
		tableroCasillas[3][4].setFicha(Ficha.NEGRA);
		tableroCasillas[2][5].setFicha(Ficha.NEGRA);
		tableroCasillas[1][6].setFicha(Ficha.NEGRA);
		tableroCasillas[0][7].setFicha(Ficha.NEGRA);
		
		tableroCasillas[7][1].setFicha(Ficha.NEGRA);
		tableroCasillas[7][2].setFicha(Ficha.NEGRA);
		tableroCasillas[7][3].setFicha(Ficha.NEGRA);
		tableroCasillas[7][4].setFicha(Ficha.NEGRA);
		tableroCasillas[7][5].setFicha(Ficha.NEGRA);
		tableroCasillas[7][6].setFicha(Ficha.NEGRA);
		tableroCasillas[7][7].setFicha(Ficha.NEGRA);
		
		tableroCasillas[7][0].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(0,7), Ficha.NEGRA);
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
		
	} 
	
	@Test
	void comprobacion6() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion6(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[3][0].setFicha(Ficha.NEGRA);
		tableroCasillas[3][1].setFicha(Ficha.NEGRA);
		tableroCasillas[3][2].setFicha(Ficha.NEGRA);
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		tableroCasillas[3][4].setFicha(Ficha.NEGRA);
		tableroCasillas[3][5].setFicha(Ficha.NEGRA);
		tableroCasillas[3][6].setFicha(Ficha.NEGRA);
		
		tableroCasillas[4][7].setFicha(Ficha.NEGRA);
		tableroCasillas[5][7].setFicha(Ficha.NEGRA);
		
		tableroCasillas[1][7].setFicha(Ficha.NEGRA);
		tableroCasillas[2][7].setFicha(Ficha.NEGRA);
		
		tableroCasillas[1][5].setFicha(Ficha.NEGRA);
		tableroCasillas[2][6].setFicha(Ficha.NEGRA);
		
		tableroCasillas[4][6].setFicha(Ficha.NEGRA);
		tableroCasillas[5][5].setFicha(Ficha.NEGRA);
		
		tableroCasillas[3][7].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(7,3), Ficha.NEGRA);
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
		
	} 
	
	@Test
	void comprobacion7() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion7(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[2][0].setFicha(Ficha.NEGRA);
		tableroCasillas[2][1].setFicha(Ficha.NEGRA);
		
		tableroCasillas[4][0].setFicha(Ficha.NEGRA);
		tableroCasillas[3][1].setFicha(Ficha.NEGRA);
		
		tableroCasillas[0][2].setFicha(Ficha.NEGRA);
		tableroCasillas[1][2].setFicha(Ficha.NEGRA);
		
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		tableroCasillas[4][4].setFicha(Ficha.NEGRA);
		
		tableroCasillas[2][3].setFicha(Ficha.NEGRA);
		tableroCasillas[2][4].setFicha(Ficha.NEGRA);
		
		tableroCasillas[2][2].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(2,2), Ficha.NEGRA);

		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);		
	} 
	
	@Test
	void comprobacion8() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion8(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[2][2].setFicha(Ficha.NEGRA);
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		tableroCasillas[4][4].setFicha(Ficha.NEGRA);
		
		tableroCasillas[5][3].setFicha(Ficha.NEGRA);
		tableroCasillas[5][4].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][4].setFicha(Ficha.NEGRA);
		tableroCasillas[7][3].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][5].setFicha(Ficha.NEGRA);
		tableroCasillas[7][5].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][6].setFicha(Ficha.NEGRA);
		tableroCasillas[7][7].setFicha(Ficha.NEGRA);
			
		tableroCasillas[5][6].setFicha(Ficha.NEGRA);
		tableroCasillas[5][7].setFicha(Ficha.NEGRA);
		
		tableroCasillas[4][6].setFicha(Ficha.NEGRA);
		tableroCasillas[3][7].setFicha(Ficha.NEGRA);
		
		tableroCasillas[5][5].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(5,5), Ficha.NEGRA);

		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);		
	} 
	
	@Test
	void comprobacion9() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion9(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[1][1].setFicha(Ficha.NEGRA);
		tableroCasillas[2][2].setFicha(Ficha.NEGRA);
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		tableroCasillas[4][4].setFicha(Ficha.NEGRA);
		tableroCasillas[5][5].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][6].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(6,6), Ficha.NEGRA);
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
		
	} 
	
	@Test
	void comprobacion10() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion10(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[2][2].setFicha(Ficha.NEGRA);
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		tableroCasillas[4][4].setFicha(Ficha.NEGRA);
		tableroCasillas[5][5].setFicha(Ficha.NEGRA);
		tableroCasillas[6][6].setFicha(Ficha.NEGRA);
		
		tableroCasillas[1][1].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(1,1), Ficha.NEGRA);
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
	} 
	
	@Test
	void comprobacion11() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion11(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[1][1].setFicha(Ficha.NEGRA);
		tableroCasillas[2][2].setFicha(Ficha.NEGRA);
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		tableroCasillas[4][4].setFicha(Ficha.NEGRA);
		tableroCasillas[5][5].setFicha(Ficha.NEGRA);
		tableroCasillas[6][6].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][6].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(6,6), Ficha.NEGRA);
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
	} 
	
	@Test
	void comprobacion12() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion12(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[1][5].setFicha(Ficha.NEGRA);
		tableroCasillas[2][4].setFicha(Ficha.NEGRA);
		
		tableroCasillas[4][4].setFicha(Ficha.NEGRA);
		tableroCasillas[5][5].setFicha(Ficha.NEGRA);
		tableroCasillas[6][6].setFicha(Ficha.NEGRA);
		
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(3,3), Ficha.NEGRA);
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
	} 
	
	@Test
	void comprobacion13() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion13(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[1][6].setFicha(Ficha.NEGRA);
		tableroCasillas[2][5].setFicha(Ficha.NEGRA);
		tableroCasillas[3][4].setFicha(Ficha.NEGRA);
		tableroCasillas[4][3].setFicha(Ficha.NEGRA);
		tableroCasillas[5][2].setFicha(Ficha.NEGRA);
		tableroCasillas[6][1].setFicha(Ficha.NEGRA);
		tableroCasillas[7][0].setFicha(Ficha.NEGRA);
		
		tableroCasillas[0][7].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(7,0), Ficha.NEGRA);
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
	} 
	
	@Test
	void comprobacion14() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion14(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[0][0].setFicha(Ficha.NEGRA);
		tableroCasillas[1][1].setFicha(Ficha.NEGRA);
		
		tableroCasillas[2][2].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(2,2), Ficha.NEGRA);
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
	} 
	
	@Test
	void comprobacion15() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion15(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[0][0].setFicha(Ficha.NEGRA);
		tableroCasillas[1][1].setFicha(Ficha.NEGRA);
		tableroCasillas[2][2].setFicha(Ficha.NEGRA);
		tableroCasillas[3][3].setFicha(Ficha.NEGRA);
		tableroCasillas[4][4].setFicha(Ficha.NEGRA);
		tableroCasillas[5][5].setFicha(Ficha.NEGRA);
		tableroCasillas[6][6].setFicha(Ficha.NEGRA);
		
		tableroCasillas[7][7].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(7,7), Ficha.NEGRA);
		
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
	} 
	
	@Test
	void comprobacion16() {
		Tablero tablero = new Tablero();
		Casilla[][] tableroCasillas = new Casilla[8][8];
		
		comprobacion16(tablero.getTablero());
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			for (int j = 0; j < tableroCasillas[i].length; j++) {
				tableroCasillas[i][j] = new Casilla(new Coordenada(j,i));
			}
		}
		
		tableroCasillas[1][6].setFicha(Ficha.NEGRA);
		tableroCasillas[2][5].setFicha(Ficha.NEGRA);
		tableroCasillas[3][4].setFicha(Ficha.NEGRA);
		tableroCasillas[4][3].setFicha(Ficha.NEGRA);
		tableroCasillas[5][2].setFicha(Ficha.NEGRA);
		
		tableroCasillas[6][1].setFicha(Ficha.NEGRA);
		
		devolverJugada(tablero, new Coordenada(1,6), Ficha.NEGRA);
		Assert.assertArrayEquals(tablero.getTablero(), tableroCasillas);
	} 
}
