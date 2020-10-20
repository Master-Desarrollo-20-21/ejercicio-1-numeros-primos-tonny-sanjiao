package NumerosPrimos;
/*
 * ProgramacionOO-Ejercicio1-Numeros-primos
 * Ejercicio 1 del curso de Programación Orientada a Objetos. Algoritmos números primos.
 * 
 * Realizar dos programas, lo mejor que puedas, que calculen:
 * 		- La suma de los números primos que hay entre los 50 primeros números
 * 		- La suma de los 50 primeros números primos
 * 
 * El código de estos programas se solicita en Java, aunque eventualmente para estos primeros ejercicios si lo deseas podrías usar también 
 * otros lenguajes de programación, ya que es solamente programación estructurada de momento. Si programas en Java, simplemente coloca el 
 * código en el método main.
 */

public class NumerosPrimos {
	public static void main(String[] args) {
		System.out.println("Suma de los primeros 50 números primos: "+sumaNPrimerosPrimos(50));
		System.out.println("Suma de los números primos que hay en los primeros 50 números naturales: " + sumaPrimosNPrimerosNumeros(50));
	}

	// función que devuelve la suma de los números primos de los N primeros números. 
	public static long sumaPrimosNPrimerosNumeros(long numeroMaximo) {
		long sumaPrimos=0;
		for (long i=1;i<=numeroMaximo;i++) {
			if (esPrimo(i)) {
				sumaPrimos+=i;
			} 
		}
		return sumaPrimos;
	}

	// función que devuelve la suma de los N primeros números primos.
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

	// función que devuelve cierto si un número dado es primo y falso en caso contrario.
	public static boolean esPrimo(long numero) {
		long i;
		i=2;
		while (numero % i != 0 && i < numero){
			i++;
		}
		return i==numero || numero==1;
	}
}
