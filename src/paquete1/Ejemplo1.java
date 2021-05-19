/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Fran
 */
public class Ejemplo1 {
	
	public static void main (String[] args) {
		double num;
		double suma = 0;
		double contador = 0;
		double med;
		do { 
			num = teclado.leer_double("Introduce un numero real positivo: (0 para terminar)");
			if (num != 0){
				contador ++;
				suma=suma+num;
			}
		} while (num != 0);
			med=suma/contador;
				if (contador==0) {
					System.out.println("No se puede calcular la media con 0 numeros");
				} else {
					System.out.println("La media de los numeros introducidos es " + med);
				}
	}
}
