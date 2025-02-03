package boletin2Cadenas;

public class Actividad1 {

	public static void main(String[] args) {
		System.out.println(cadenaParOImparDoWhile("Hola Dios", "par"));
	}
	public static void cadenaParOImpar (String cadena,String bandera) {
		/*
		Una Ternaria para iniciar desde un numero impar o par para que aparezca
		la cadena pero solo con letras impares o pares
		*/
		int inicioCadena = bandera.toLowerCase().equals("par") ? 0 : 1;
		
		for(int i = inicioCadena ; i < cadena.length() ; i+=2) {
			System.out.println(cadena.charAt(i));
		}
	}
	
	public static void cadenaParOImparWhile(String cadena,String bandera) {
		int inicioCadena = bandera.toLowerCase().equals("par") ? 0 : 1;
		
		while(inicioCadena < cadena.length()) {
			System.out.println(cadena.charAt(inicioCadena));
			inicioCadena += 2;
		}
	}
	
	public static String cadenaParOImparDoWhile(String cadena,String bandera) {
		int inicioCadena = bandera.toLowerCase().equals("par") ? 0 : 1;
		String resultado = "";
		do {
			resultado+= cadena.charAt(inicioCadena);
			inicioCadena += 2;
		}while (inicioCadena < cadena.length());
		
		return resultado;
	}
}
