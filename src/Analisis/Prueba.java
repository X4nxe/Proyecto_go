package Analisis;

public class Prueba {

	public static void main(String[] args) {
		boolean exit = false;
		
		do {
			for (int i = 1; i < 10; i++) {
				System.out.println(i);
				if(i == 5) {
					exit = true;
					break;
				}
			}
		}while(!exit);
	}

}
