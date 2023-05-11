package juego;

public enum Ficha {
	NEGRA("\u001B[30m 0 \u001B[0m"),BLANCA(" O ");

	private String ficha;
	
	Ficha(String ficha) {
		this.ficha = ficha;
	}

	public String getFicha() {
		return ficha;
	}
}
