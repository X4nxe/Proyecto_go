package consoleInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {

	private final Scanner keyboard;

	public ConsoleInput(Scanner keyboard) {
		this.keyboard = keyboard;
	}

	private void cleanInput() {
		keyboard.nextLine();
	}

	// TIPO byte

	// 1. readByte
	public byte readByte() {

		boolean error = true;
		byte dato_byte = 0;

		do {
			try {
				dato_byte = keyboard.nextByte();
				error = false;
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("Error, el valor introducido no es un byte\n");
			}finally {
				cleanInput();
			}
		} while (error);
		return dato_byte;
	}
	
	// 2. readByteLessThan
	public byte readByteLessThan(byte upperBound) {

		byte dato_byte = 0;

		do {
			System.out.println("Introduce un byte menor que " + upperBound);
			dato_byte = readByte();

			if (dato_byte >= upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
		} while (dato_byte >= upperBound);
		return dato_byte;
	}

	// 3. readByteLessorEqualThan
	public byte readByteLessorEqualThan(byte upperBound) {

		byte dato_byte = 0;

		do {
			System.out.println("Introduce un byte menor que " + upperBound);
			dato_byte = readByte();
			if (dato_byte > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
		} while (dato_byte > upperBound);
		return dato_byte;
	}

	// 4. readByteGreaterThan
	public byte readByteGreaterThan(byte lowerBound) {

		byte dato_byte = 0;

		do {
			System.out.println("Introduce un byte mayor que " + lowerBound);
			dato_byte = readByte();
			if (dato_byte <= lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
		} while (dato_byte <= lowerBound);
		return dato_byte;
	}

	// 5. readByteGreaterorEqualThan
	public byte readByteGreaterorEqualThan(byte lowerBound) {

		byte dato_byte = 0;

		do {
			System.out.println("Introduce un byte mayor que " + lowerBound);
			dato_byte = readByte();
			if (dato_byte < lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
		} while (dato_byte < lowerBound);
		return dato_byte;
	}

	// 6. readByteInRange
	public byte readByteInRange(byte lowerBound, byte upperBound) {

		byte dato_byte = 0;

		do {
			System.out.println("Introduce un byte entre " + lowerBound + "y entre " + upperBound);
			dato_byte = readByte();
			if (dato_byte < lowerBound || dato_byte > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
		} while (dato_byte < lowerBound || dato_byte > upperBound);
		return dato_byte;
	}

	// TIPO short

	// 7. readShort
	public short readShort() {

		boolean error = false;
		short dato_short = 0;

		do {
			try {
				dato_short = keyboard.nextShort();
				error = false;
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("Error, el valor introducido no es un short");
				error = true;
				cleanInput();
			}
		} while (error);
		return dato_short;
	}

	// 8. readShortLessThan
	public short readShortLessThan(short upperBound) {

		short dato_short = 0;

		do {
			System.out.println("Introduce un short menor que " + upperBound);
			dato_short = readShort();
			if (dato_short >= upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_short >= upperBound);
		return dato_short;
	}

	// 9. readShortLessorEqualThan
	public short readShortLessorEqualThan(short upperBound) {

		short dato_short = 0;

		do {
			System.out.println("Introduce un short menor que " + upperBound);
			dato_short = readShort();
			if (dato_short > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_short > upperBound);
		return dato_short;
	}

	// 10. readShortGreaterThan
	public short readShortGreaterThan(short lowerBound) {

		short dato_short = 0;

		do {
			System.out.println("Introduce un short mayor que " + lowerBound);
			dato_short = readShort();
			if (dato_short <= lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_short <= lowerBound);
		return dato_short;
	}

	// 11. readShortGreaterorEqualThan
	public short readShortGreaterorEqualThan(short lowerBound) {

		short dato_short = 0;

		do {
			System.out.println("Introduce un short mayor que " + lowerBound);
			dato_short = readShort();
			if (dato_short < lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_short < lowerBound);
		return dato_short;
	}

	// 12. readShortInRange
	public short readShortInRange(short lowerBound, short upperBound) {

		short dato_short = 0;

		do {
			System.out.println("Introduce un short entre " + lowerBound + "y entre " + upperBound);
			dato_short = readShort();
			if (dato_short < lowerBound || dato_short > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_short < lowerBound || dato_short > upperBound);
		return dato_short;
	}

	// TIPO long

	// 13. readInt
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

	// 14. readIntLessThan
	public int readIntLessThan(int upperBound) {

		int dato_int = 0;

		do {
			System.out.println("Introduce un número menor que " + upperBound);
			dato_int = readInt();
			if (dato_int >= upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_int >= upperBound);
		return dato_int;
	}

	// 15. readIntLessorEqualThan
	public int readIntLessorEqualThan(int upperBound) {

		int dato_int = 0;

		do {
			System.out.println("Introduce un int menor que " + upperBound);
			dato_int = readInt();
			if (dato_int > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_int > upperBound);
		return dato_int;
	}

	// 16. readIntGreaterThan
	public int readIntGreaterThan(int lowerBound) {

		int dato_int = 0;

		do {
			System.out.println("Introduce un int mayor que " + lowerBound);
			dato_int = readInt();
			if (dato_int <= lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_int <= lowerBound);
		return dato_int;
	}

	// 17. readIntGreaterorEqualThan
	public int readIntGreaterorEqualThan(int lowerBound) {

		int dato_int = 0;

		do {
			System.out.println("Introduce un int mayor que " + lowerBound);
			dato_int = readInt();
			if (dato_int < lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_int < lowerBound);
		return dato_int;
	}

	// 18. readIntInRange
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

	// TIPO long

	// 19. readLong
	public long readLong() {

		boolean error = false;
		long dato_long = 0;

		do {
			try {
				dato_long = keyboard.nextLong();
				error = false;
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("Error, el valor introducido no es un long");
				error = true;
				cleanInput();
			}
		} while (error);
		return dato_long;
	}

	// 20. readLongLessThan
	public long readLongLessThan(long upperBound) {

		long dato_long = 0;

		do {
			System.out.println("Introduce un long menor que " + upperBound);
			dato_long = readLong();
			if (dato_long >= upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_long >= upperBound);
		return dato_long;
	}

	// 21. readLongLessorEqualThan
	public long readLongLessorEqualThan(long upperBound) {

		long dato_long = 0;

		do {
			System.out.println("Introduce un long menor que " + upperBound);
			dato_long = readLong();
			if (dato_long > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_long > upperBound);
		return dato_long;
	}

	// 22. readLongGreaterThan
	public long readLongGreaterThan(long lowerBound) {

		long dato_long = 0;

		do {
			System.out.println("Introduce un long mayor que " + lowerBound);
			dato_long = readLong();
			if (dato_long < lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_long <= lowerBound);
		return dato_long;
	}

	// 23. readLongGreaterorEqualThan
	public long readLongGreaterorEqualThan(long lowerBound) {

		long dato_long = 0;

		do {
			System.out.println("Introduce un long mayor que " + lowerBound);
			dato_long = readLong();
			if (dato_long < lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_long < lowerBound);
		return dato_long;
	}

	// 24. readLongInRange
	public long readLongInRange(long lowerBound, long upperBound) {

		long dato_long = 0;

		do {
			System.out.println("Introduce un long entre " + lowerBound + "y entre " + upperBound);
			dato_long = readLong();
			if (dato_long < lowerBound || dato_long > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_long < lowerBound || dato_long > upperBound);
		return dato_long;
	}

	// TIPO float

	// 25. readFloat
	public float readFloat() {

		boolean error = false;

		float dato_float = 0;

		do {
			try {
				dato_float = keyboard.nextFloat();
				error = false;
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("Error, el valor introducido no es un float");
				error = true;
				cleanInput();
			}
		} while (error);
		return dato_float;
	}

	// 26. readFloatLessThan
	public float readFloatLessThan(float upperBound) {

		float dato_float = 0;

		do {
			System.out.println("Introduce un float menor que " + upperBound);
			dato_float = readFloat();
			if (dato_float >= upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_float >= upperBound);
		return dato_float;
	}

	// 27. readFloatLessorEqualThan
	public float readFloatLessorEqualThan(float upperBound) {

		float dato_float = 0;

		do {
			System.out.println("Introduce un float menor que " + upperBound);
			dato_float = readFloat();
			if (dato_float > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_float > upperBound);
		return dato_float;
	}

	// 28. readFloatGreaterThan
	public float readFloatGreaterThan(float lowerBound) {

		float dato_float = 0;

		do {
			System.out.println("Introduce un float mayor que " + lowerBound);
			dato_float = readFloat();
			if (dato_float <= lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_float <= lowerBound);
		return dato_float;
	}

	// 29. readFloatGreaterorEqualThan
	public float readFloatGreaterorEqualThan(float lowerBound) {

		float dato_float = 0;

		do {
			System.out.println("Introduce un float mayor que " + lowerBound);
			dato_float = readFloat();
			if (dato_float < lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_float < lowerBound);
		return dato_float;
	}

	// 30. readFloatInRange
	public float readFloatInRange(float lowerBound, float upperBound) {

		float dato_float = 0;

		do {
			System.out.println("Introduce un float entre " + lowerBound + "y entre " + upperBound);
			dato_float = readFloat();
			if (dato_float < lowerBound || dato_float > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_float < lowerBound || dato_float > upperBound);
		return dato_float;
	}

	// TIPO double

	// 25. readDouble
	public double readDouble() {

		boolean error = false;
		double dato_double = 0;

		do {
			try {
				dato_double = keyboard.nextDouble();
				error = false;
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("Error, el valor introducido no es un double");
				error = true;
				cleanInput();
			}
		} while (error);
		return dato_double;
	}

	// 26. readDoubleLessThan
	public double readDoubleLessThan(double upperBound) {

		double dato_double = 0;

		do {
			System.out.println("Introduce un double menor que " + upperBound);
			dato_double = readDouble();
			if (dato_double >= upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_double >= upperBound);
		return dato_double;
	}

	// 27. readDoubleLessorEqualThan
	public double readDoubleLessorEqualThan(double upperBound) {

		double dato_double = 0;

		do {
			System.out.println("Introduce un double menor que " + upperBound);
			dato_double = readDouble();
			if (dato_double > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_double > upperBound);
		return dato_double;
	}

	// 28. readDoubleGreaterThan
	public double readDoubleGreaterThan(double lowerBound) {

		double dato_double = 0;

		do {
			System.out.println("Introduce un double mayor que " + lowerBound);
			dato_double = readDouble();
			if (dato_double <= lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_double <= lowerBound);
		return dato_double;
	}

	// 29. readDoubleGreaterorEqualThan
	public double readDoubleGreaterorEqualThan(double lowerBound) {

		double dato_double = 0;

		do {
			System.out.println("Introduce un double mayor que " + lowerBound);
			dato_double = readDouble();
			if (dato_double < lowerBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_double < lowerBound);
		return dato_double;
	}

	// 30. readDoubleInRange
	public double readDoubleInRange(double lowerBound, double upperBound) {

		double dato_double = 0;

		do {
			System.out.println("Introduce un double entre " + lowerBound + "y entre " + upperBound);
			dato_double = readDouble();
			if (dato_double < lowerBound || dato_double > upperBound) {
				System.out.println("Error, el valor introducido esta fuera de rango");
			}
			cleanInput();
		} while (dato_double < lowerBound || dato_double > upperBound);
		return dato_double;
	}

	// TIPO char

	// 31. readChar
	public char readChar() {

		String dato_char;
		do {
			System.out.println("Introduce un carácter");
			dato_char = keyboard.nextLine();
			
		}while(dato_char.length() > 1);
		return dato_char.charAt(0);
	}

	// 32. readChar(String ValidCharacter)
	public char readChar(String Validcharacter) {

		char dato_char;
		boolean dato_boolean;
		String strchar = "";

		do {
			System.out.println("Introduce el siguiente caracter: a");
			dato_char = readChar();
			dato_boolean = String.valueOf(dato_char).equalsIgnoreCase(strchar);
			if (dato_boolean == false) {
				System.out.println("Error, el carácter introducido no es: a");
				System.out.println("");
			}
		} while (dato_boolean == false);
		return dato_char;
	}

	// 33. readVowel
	public char readVowel() {

		char dato_char;

		do {
			System.out.println("Introduce una o mas vocales");
			dato_char = readChar();
			if (dato_char != 'a' && dato_char != 'e' && dato_char != 'i' && dato_char != 'o' && dato_char != 'u') {
				System.out.println("Error, el carácter introducido no es una vocal");
				System.out.println("");
			}
		} while (dato_char != 'a' && dato_char != 'e' && dato_char != 'i' && dato_char != 'o' && dato_char != 'u');
		return dato_char;
	}

	// 34. readDigit
	public char readDigit() {

		char dato_char;
		boolean dato_boolean;

		do {
			System.out.println("Introduce un número");
			dato_char = readChar();
			dato_boolean = Character.isDigit(dato_char);
			if (dato_boolean == false) {
				System.out.println("Error, el carácter introducido no es un número");
				System.out.println("");
			}
		} while (dato_boolean == false);
		return dato_char;
	}

	// 35. readLowerCase
	public char readLowerCase() {

		char dato_char;
		boolean dato_boolean;

		do {
			System.out.println("Introduce una letra minúscula");
			dato_char = readChar();
			dato_boolean = Character.isLowerCase(dato_char);
			if (dato_boolean == false) {
				System.out.println("El carácter introducido no es una letra minúscula");
				System.out.println("");
			}
		} while (dato_boolean == false);
		return dato_char;
	}

	// 36. readUpperCase
	public char readUpperCase() {

		char dato_char;
		boolean dato_boolean;

		do {
			System.out.println("Introduce una letra mayúscula");
			dato_char = readChar();
			dato_boolean = Character.isUpperCase(dato_char);
			if (dato_boolean == false) {
				System.out.println("El carácter introducido no es una letra mayúscula");
				System.out.println("");
			}
		} while (dato_boolean == false);
		return dato_char;
	}

	// 37. readUppercase
	public char readUppercase() {

		char dato_char;
		boolean dato_boolean;

		do {
			System.out.println("Introduce un carácter en mayúscula");
			dato_char = readChar();
			dato_boolean = Character.isUpperCase(dato_char);
			if (dato_boolean == false) {
				System.out.println("Error, el carácter introducido esta en minúscula");
				System.out.println("");
			}
		} while (dato_boolean == false);
		return dato_char;
	}

	// TIPO string

	// 38. readString
	public String readString() {

		String dato_str;

		System.out.println("Introduce una cadena");
		dato_str = keyboard.nextLine();
		return dato_str;
	}

	// 39. readString(sobrecargado)
	public String readString(int maxLength) {

		String dato_str;

		do {
			System.out.println("Introduce una cadena");
			dato_str = readString();

			if (dato_str.length() >= maxLength) {
				System.out.println("Error, la cadena es más larga de lo establecido");
				System.out.println("");
			}

		} while (dato_str.length() > maxLength);
		return dato_str;
	}

	// TIPO boolean

	// 40. readBooleanUsingChar(char AffirmativeValue)
	public boolean readBooleanUsingChar(char affirmativeValue) {

		char dato_char;
		boolean dato_boolean;

		System.out.println(
				"Introducer el carácter: " + affirmativeValue + " o " + Character.toUpperCase(affirmativeValue));
		dato_char = readChar();

		if (dato_char == affirmativeValue || dato_char == Character.toUpperCase(affirmativeValue)) {
			dato_boolean = true;
		} else {
			dato_boolean = false;
		}
		return dato_boolean;
	}

	// 41. readBooleanUsingChar
	public boolean readBooleanUsingChar() {

		char dato_char;
		boolean dato_boolean;

		System.out.println("Introduce el carácter: s o S");
		dato_char = readChar();

		if (dato_char == 's' || dato_char == 'S') {
			dato_boolean = true;
		} else {
			dato_boolean = false;
		}
		return dato_boolean;
	}

	// 42. readBooleanUsingChar(char affirmativeValue, char negativeValue)
	public boolean readBooleanUsingChar(char affirmativeValue, char negativeValue) {

		char dato_char = ' ';
		boolean dato_boolean = true;

		while (dato_char != affirmativeValue && dato_char != Character.toUpperCase(affirmativeValue)
				&& dato_char != negativeValue && dato_char != Character.toUpperCase(negativeValue)) {

			System.out.println(
					"Introduce el carácter: " + affirmativeValue + " o " + negativeValue + " en mayúscula o minúscula");
			dato_char = readChar();

			if (dato_char == affirmativeValue || dato_char == Character.toUpperCase(affirmativeValue)) {
				dato_boolean = true;
			} else if (dato_char == negativeValue || dato_char == Character.toUpperCase(negativeValue)) {
				dato_boolean = false;
			} else {
				System.out.println("Error, el carácter introducido no se corresponde con los establecidos");
				System.out.println("");
			}
		}
		return dato_boolean;
	}

	// 43. readBooleanUsingInt
	public boolean readBooleanUsingInt(int affirmativeValue) {

		char dato_char;
		boolean dato_boolean;

		System.out.println("Introduce el carácter: " + affirmativeValue);
		dato_char = readChar();

		if (Character.getNumericValue(dato_char) == affirmativeValue) {
			dato_boolean = true;
		} else {
			dato_boolean = false;
		}
		return dato_boolean;
	}

	// 44. readBooleanUsingInt
	public boolean readBooleanUsingInt() {

		char dato_char;
		boolean dato_boolean;

		System.out.println("Introduce el carácter: 1");
		dato_char = readChar();

		if (Character.getNumericValue(dato_char) == 1) {
			dato_boolean = true;
		} else {
			dato_boolean = false;
		}
		return dato_boolean;
	}

	// 45. readBooleanUsingInt(int affirmativeValue,int negativeValue)
	public boolean readBooleanUsingInt(int affirmativeValue, int negativeValue) {

		char dato_char;
		boolean dato_boolean = true;

		do {

			System.out.println("Introduce el carácter: " + affirmativeValue + " o " + negativeValue);
			dato_char = readChar();

			if (Character.getNumericValue(dato_char) == affirmativeValue) {
				dato_boolean = true;
				System.out.println(dato_boolean);
			} else if (Character.getNumericValue(dato_char) == negativeValue) {
				dato_boolean = false;
				System.out.println(dato_boolean);
			} else {
				System.out.println("Error, el carácter introducido no se corresponde con los establecidos");
				System.out.println("");
			}
		} while (Character.getNumericValue(dato_char) != affirmativeValue
				&& Character.getNumericValue(dato_char) != negativeValue);
		return dato_boolean;
	}
}
