package NumerosPrimos;
/*
 * ProgramacionOO-Ejercicio1-Numeros-primos
 * Ejercicio 1 del curso de Programaci�n Orientada a Objetos. Algoritmos n�meros primos.
 * 
 * Realizar dos programas, lo mejor que puedas, que calculen:
 * 		- La suma de los n�meros primos que hay entre los 50 primeros n�meros
 * 		- La suma de los 50 primeros n�meros primos
 * 
 * El c�digo de estos programas se solicita en Java, aunque eventualmente para estos primeros ejercicios si lo deseas podr�as usar tambi�n 
 * otros lenguajes de programaci�n, ya que es solamente programaci�n estructurada de momento. Si programas en Java, simplemente coloca el 
 * c�digo en el m�todo main.
 */

public class NumerosPrimos {
	public static void main(String[] args) {
		System.out.println("Suma de los primeros 50 n�meros primos: "+sumaNPrimerosPrimos(50));
		System.out.println("Suma de los n�meros primos que hay en los primeros 50 n�meros naturales: " + sumaPrimosNPrimerosNumeros(50));
	}

	// funci�n que devuelve la suma de los n�meros primos de los N primeros n�meros. 
	public static long sumaPrimosNPrimerosNumeros(long numeroMaximo) {
		long sumaPrimos=0;
		for (long i=1;i<=numeroMaximo;i++) {
			if (esPrimo(i)) {
				sumaPrimos+=i;
			} 
		}
		return sumaPrimos;
	}

	// funci�n que devuelve la suma de los N primeros n�meros primos.
	public static long sumaNPrimerosPrimos(long numeroDePrimos) {
		long cuentaPrimos=0;
		long sumaPrimos=0;
		long numero=1;
		while (cuentaPrimos<numeroDePrimos) {
			if (esPrimo(numero)) {
				sumaPrimos+=numero;
				cuentaPrimos++;
			}
			numero++;
		}
		return sumaPrimos;
	}

	// funci�n que devuelve cierto si un n�mero dado es primo y falso en caso contrario.
	public static boolean esPrimo(long numero) {
		long i;
		i=2;
		while (numero % i != 0 && i < numero){
			i++;
		}
		return i==numero || numero==1;
	}
}
