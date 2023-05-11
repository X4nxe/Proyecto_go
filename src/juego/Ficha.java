package juego;

public enum Ficha {
	NEGRA(" 0 "),BLANCA(" O ");

	private String ficha;
	
	Ficha(String ficha) {
		this.ficha = ficha;
	}

	public String getFicha() {
		return ficha;
	}
}
