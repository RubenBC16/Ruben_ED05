package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
 
class Test_CalculadoraTest {
	CerebroCalculadoraED PRUEBA = new CerebroCalculadoraED();
	
	@Test
	void testSUMAR() {//BIEN
		System.out.println("comprobaremos que el metodo SUMAR funciona con un ejemplo");
		System.out.println("para ello debemos introducir 2 numeros que sumen 10");
		CerebroCalculadoraED PRUEBA = new CerebroCalculadoraED();
		System.out.println("EJEMPLOS: 5+5  9+1    8+2");
		double resu_esp=10; //resultado esperado de la operacion = 10
		PRUEBA.operarSuma(Operaciones.SUMAR);
		Assertions.assertEquals(resu_esp, PRUEBA.resultado);
	}
	
	@Test
	void testRESTAR() {
		System.out.println("comprobaremos que el metodo RESTAR funciona con un ejemplo");
		System.out.println("para ello debemos introducir un numero que al restarle el segundo numero de como resultado 2");
		System.out.println("EJEMPLOS: 7-5  9-7    8-6   2-0");
		double resu_esp=2; //resultado esperado de la operacion = 2
		PRUEBA.operarResta(Operaciones.RESTAR);
		Assertions.assertEquals(resu_esp, PRUEBA.resultado);
	}
	
	@Test
	void testMULTIP() {
		System.out.println("comprobaremos que el metodo MULTIPLICAR funciona con un ejemplo");
		System.out.println("para ello debemos introducir 2 numeros cuya multiplicacion sea 24");
		System.out.println("EJEMPLOS: 2*12     3*8     4*6");
		double resu_esp=24; //resultado esperado de la operacion = 20
		PRUEBA.operarMultiplica(Operaciones.MULTIPLICAR);
		Assertions.assertEquals(resu_esp, PRUEBA.resultado);
	}
	
	@Test
	void testDIVIDIR() {
		System.out.println("comprobaremos que el metodo DIVIDIR funciona con un ejemplo");
		System.out.println("para ello debemos introducir un numero que al dividirlo por el segundo de 3");
		System.out.println("EJEMPLOS: 9/3       6/2      21/ 7");
		double resu_esp=3; //resultado esperado de la operacion = 3
		PRUEBA.operarDivide(Operaciones.DIVIDIR);
		Assertions.assertEquals(resu_esp, PRUEBA.resultado);
	}
	
	//********************TEST DE RESULTADOS***********************
	
	@Test
	void testSUMAR_RES() {
		System.out.println("comprobaremos que el metodo SUMAR_RES funciona con un ejemplo");
		System.out.println("para ello debemos introducir un numero que al sumarselo al resultado de la operacion anterior ("+PRUEBA.resultado +") de 10");
		//EJEMPLOS: como el resultado anterior debería de ser 3, tendría que ser un 7
		double resu_esp=10; //resultado esperado de la operacion = 20
		PRUEBA.operarSumaRes(Operaciones.SUMAR_RES);
		Assertions.assertEquals(resu_esp, PRUEBA.resultado);
	}

	@Test
	void testRESTAR_RES() {
		System.out.println("comprobaremos que el metodo RESTAR_RES funciona con un ejemplo");
		System.out.println("para ello debemos introducir un numero que al sumarselo al resultado de la operacion anterior ("+PRUEBA.resultado +") de 10");
		//EJEMPLOS: como el resultado anterior debería de ser 3, tendría que ser un 7
		double resu_esp=10; //resultado esperado de la operacion = 20
		PRUEBA.operarRestaRes(Operaciones.RESTAR_RES);
		Assertions.assertEquals(resu_esp, PRUEBA.resultado);
	}
	@Test
	void testMULTIPLICAR_RES() {
		System.out.println("comprobaremos que el metodo SUMAR_RES funciona con un ejemplo");
		System.out.println("para ello debemos introducir un numero que al sumarselo al resultado de la operacion anterior ("+PRUEBA.resultado +") de 10");
		//EJEMPLOS: como el resultado anterior debería de ser 3, tendría que ser un 7
		double resu_esp=10; //resultado esperado de la operacion = 20
		PRUEBA.operarMultiplicaRes(Operaciones.MULTIPLICAR_RES);
		Assertions.assertEquals(resu_esp, PRUEBA.resultado);
	}
	@Test
	void testDIVIDIR_RES() {
		System.out.println("comprobaremos que el metodo SUMAR_RES funciona con un ejemplo");
		System.out.println("para ello debemos introducir un numero que al sumarselo al resultado de la operacion anterior ("+PRUEBA.resultado +") de 10");
		//EJEMPLOS: como el resultado anterior debería de ser 3, tendría que ser un 7
		double resu_esp=10; //resultado esperado de la operacion = 20
		PRUEBA.operarDivideRes(Operaciones.DIVIDIR_RES);

		Assertions.assertEquals(resu_esp, PRUEBA.resultado);
	}
	@Test //simple 
	void RESULTADO() {
		System.out.println("comprobaremos que el metodo RESULTADO funciona con un ejemplo");
		System.out.println("para ello debemos introducir un numero que al sumarselo al resultado de la operacion anterior ("+PRUEBA.resultado +") de 10");
		double resu_esp=10; //resultado esperado de la operacion = 20
		PRUEBA.mostrarResultado(Operaciones.RESULTADO);
		Assertions.assertEquals(resu_esp, PRUEBA.resultado);
	}
	
	@Test
	void testHISTORIAL() {
		System.out.println("comprobaremos que el metodo SUMAR_RES funciona con un ejemplo");
		System.out.println("para ello debemos introducir un numero que al sumarselo al resultado ("+ PRUEBA.resultado+") de la operacion anterior de 10");
		//EJEMPLOS: como el resultado anterior debería de ser 3, tendría que ser un 7
		double resu_esp=10; //resultado esperado de la operacion = 20
		PRUEBA.operarSuma(Operaciones.SUMAR_RES);
		Assertions.assertEquals(resu_esp, PRUEBA.resultado);
	}
		

}
