/******************************************************************************

Código Gasto de Combustivel
Aula de TPA

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int distancia, gasto_medio, consumo_total;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Distancia");
	    distancia = input.nextInt();
	    System.out.println("Gasto Medio");
	    gasto_medio = input.nextInt();
	    
	    consumo_total = distancia / gasto_medio;
	    
	    System.out.println("Consumo Total: " + consumo_total);
	}
}
