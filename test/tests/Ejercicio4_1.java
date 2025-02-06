package tests;

import static org.junit.jupiter.api.Assertions.*;



import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import static ejercicio.Ejercicio4_1.contarPalabras;
import static ejercicio.Ejercicio4_1.contarLetrasDiferentes;
import static ejercicio.Ejercicio4_1.contarFrecuenciaPalabras;
import static ejercicio.Ejercicio4_1.contarFrecuenciaLetras;
import static ejercicio.Ejercicio4_1.esPalindroma;
class Ejercicio4_1 {

	@Test
	void testContarPalabras() {
		assertEquals(2,contarPalabras("dos palabras"));
		assertEquals(0,contarPalabras(" "));
		
	}
	@Test
	void testcontarLetrasDiferentes() {
		assertEquals(2,contarLetrasDiferentes("papa"));
		assertEquals(0,contarLetrasDiferentes(" ")); 
	}
	@Test
	void testcontarFrecuenciaPalabras() {
		Map<String, Integer> res = new HashMap<>();
		res.put("la", 2);
		res.put("mama", 2);
		res.put("de", 1);
		assertEquals(res,contarFrecuenciaPalabras("la mama de la mama"));
	}
	@Test
	void testcontarFrecuenciaPalabrasEnEspacioVacio() {
		Map<String, Integer> res = new HashMap<>();
		assertEquals(res,contarFrecuenciaPalabras(" "));
	}
	@Test
	void testcontarFrecuenciaLetras() {
		Map<Character, Integer> res = new HashMap<>();
		res.put('h',1);
		res.put('o', 1);
		res.put('l', 1);
		res.put('a', 2);
		assertEquals(res,contarFrecuenciaLetras("Holaa"));
	}
	@Test
	void testEsPalindroma() {
		assertTrue(esPalindroma("apa"));
	}

}
