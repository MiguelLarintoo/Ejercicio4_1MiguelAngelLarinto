package boletin2Cadenas;

public class Actividad3 {

	public static void main(String[] args) {
		System.out.println(startsWith("Hola",'h'));
	}
	public static boolean startsWith(String cadena,char caracter) {
		boolean res = false;
		//pL = primeraLetra
		Character pL = cadena.charAt(0);
		if(pL.equals(caracter)) {
			res = true;
		}
		return res;
	}

}
