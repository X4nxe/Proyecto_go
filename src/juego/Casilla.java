package juego;

public class Casilla {
	private Ficha ficha;
	private boolean lleno;
	private Coordenada coordenada;
	
	public Ficha getFicha() {
		return ficha;
	}
	
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
		lleno = true;
	}
	
	public boolean isLleno() {
		return lleno;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	Casilla(Coordenada coordenada,Ficha ficha) {
		this.ficha = ficha;
		this.coordenada = coordenada;
		lleno = true;
	}

	Casilla(Coordenada coordenada) {
		this.coordenada = coordenada;
		lleno = false;
	}

	String pintarCasilla() {
		if(lleno) {
			return ficha.getFicha();
		}else {
			return " . ";
		}
	}
}
