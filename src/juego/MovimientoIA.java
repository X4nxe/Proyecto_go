package juego;

public class MovimientoIA {
	private Coordenada coordenada;
	private int fichasVolteadas;
	
	public MovimientoIA(Coordenada coordenada, int fichasVolteadas) {
		this.coordenada = coordenada;
		this.fichasVolteadas = fichasVolteadas;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public int getFichasVolteadas() {
		return fichasVolteadas;
	}
}
