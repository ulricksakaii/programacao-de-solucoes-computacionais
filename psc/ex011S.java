package psc;
import java.util.Scanner;

public class ex011S {
        public static void main(String args[]){
    Scanner input = new Scanner( System.in);
    Double c1, c2, hip;

    System.out.print("Digite o valor do cateto: ");
    c1 = input.nextDouble();

    System.out.print("Digite o valor do cateto oposto: ");
    c2 = input.nextDouble();

    hip = Math.hypot(c1, c2);

    System.out.printf("O valor da hipotenusa será: %.2f", (hip));
    }
}
