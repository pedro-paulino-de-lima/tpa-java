/******************************************************************************

Código de IMC
Aula de TPA

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    double weight, height, imc;
	    String name;
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Qual o seu nome?");
	    name = input.nextLine();
	    
	    System.out.println("Qual é a sua altura?");
	    height = input.nextDouble();
	    
	    System.out.println("Qual é o sua peso?");
	    weight = input.nextDouble();
	    
	    imc = weight / height * height;
	    
	    if (imc < 18)
	    {
	        System.out.println("Sr(a)." + name + " está abaixo do peso!");
	    }else if (imc >= 18 <= 24,99)
	}
}
