package psc;
import java.util.Scanner;

public class ex013S {
    public static void main(String args[]) {
    Scanner input = new Scanner( System.in);
    Double dm, dn, a;

    System.out.print("Vamos calcular a área de um Losango!");
    
    System.out.print("Digite o valor da diagonal menor: ");
    dm = input.nextDouble();
    
    System.out.print("Digite o valor da diagonal maior: ");
    dn = input.nextDouble();

    a = (dm * dn) / 2;

    System.out.printf("A área do Losango equivale á %.2f.", a);
    }  
}
