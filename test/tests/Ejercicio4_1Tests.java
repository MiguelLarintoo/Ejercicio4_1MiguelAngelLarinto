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
class Ejercicio4_1Tests {

	@Test
	void testContarPalabras() {
		assertEquals(2,contarPalabras("dos palabras"));
		assertEquals(2,contarPalabras("   dos palabras  ".trim()));
		assertEquals(0,contarPalabras(" "));
		
	} 
	@Test 
	void testNoContarPalabras() {
		assertNotEquals(4,contarPalabras("dos palabras"));
		
	}
	@Test
	void testContarPalabrasVacio() {
		assertEquals(0,contarPalabras(" "));
		
	} 
	@Test
	void testcontarLetrasDiferentes() {
		assertEquals(2,contarLetrasDiferentes("papa"));
		assertEquals(2,contarLetrasDiferentes("  papa   ".trim()));
		assertEquals(0,contarLetrasDiferentes(" ")); 
	}
	@Test
	void testNoContarLetrasDiferentes() {
		assertNotEquals(4,contarLetrasDiferentes("papa"));
	}
	@Test
	void testcontarFrecuenciaPalabras() {
		Map<String, Integer> res = new HashMap<>();
		res.put("la", 2);
		res.put("mama", 2);
		res.put("de", 1);
		assertEquals(res,contarFrecuenciaPalabras("la mama de la mama".trim()));
	}
	@Test
	void testNoContarFrecuenciaPalabras() {
		Map<String, Integer> res = new HashMap<>();
		res.put("la", 2);
		res.put("mama", 2);
		assertNotEquals(res,contarFrecuenciaPalabras("la mama de la mama"));
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
	void testNoContarFrecuenciaLetras() {
		Map<Character, Integer> res = new HashMap<>();
		res.put('h',1);
		res.put('o', 1);
		assertNotEquals(res,contarFrecuenciaLetras("Holaa".trim()));
	}
	@Test
	void testcontarFrecuenciaLetrasEnEspacioVacio() {
		Map<Character, Integer> res = new HashMap<>();
		assertEquals(res,contarFrecuenciaLetras(" "));
	}
	@Test
	void testEsPalindroma() {
		assertFalse(esPalindroma("papa".trim()));
	} 
	@Test
	void testNoEsPalindroma() {
		assertFalse(esPalindroma("papa"));
	}
	@Test
	void testEsPalindromaVacia() {
		assertTrue(esPalindroma(" "));
	} 

}
