package psc;

import java.util.Scanner;

public class ex009S {
    public static void main(String args[]){
    Scanner input = new Scanner( System.in );
    Double sal, min, rec;

    min = (1320.00);

    System.out.print("Digite o valor atual do seu salário: ");
    sal = input.nextDouble();

    rec = sal/ min;
    
    System.out.println("Você recebe um total de " + rec + " salário(s) mínimos!");
        }
}
