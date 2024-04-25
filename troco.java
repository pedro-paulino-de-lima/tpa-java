/******************************************************************************

Código: Troco
Aula: TPA - 25/04/2024

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int troco, cedulas;
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Insira o Troco");
	    troco = input.nextInt();
	    
	    cedulas = troco / 20;
	    System.out.println(cedulas + " cedulas de 20 reais");
	    
	    troco = troco % 20;
	    cedulas = troco / 10;
	    
	    System.out.println(cedulas + " cedulas de 10 reais");
	    
	    troco = troco % 10;
	    cedulas = troco / 5;
	    
	    System.out.println(cedulas + " cedulas de 5 reais");
	    
	    troco = troco % 5;
	    cedulas = troco / 2;
	    
	    System.out.println(cedulas + "cedulas de 2 reais");
	}
}
