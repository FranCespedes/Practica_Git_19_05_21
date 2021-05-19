/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Fran
 */
public class Ejemplo2 {
 	public static void main (String[] args) {
		int num = teclado.leer_entero ("Introduce un numero entero: ");
		int maximo = num, minimo = num;
		
		for (int i=1; i < 20; i++) {
			num = teclado.leer_entero ("Introduce un numero entero : ");
			
			if (num > maximo)
				maximo = num;
			if (num < minimo)
				minimo = num;
		}
		System.out.println ("El maximo es " + maximo + " y el minimo es " + minimo);
	}
}
