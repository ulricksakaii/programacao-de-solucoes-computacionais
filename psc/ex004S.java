package psc;
import java.util.Scanner;
public class ex004S {
 public static void main(String args[]){
        Scanner input = new Scanner( System.in );
        double n1, n2, n3, total;
        
        System.out.println("Digite o valor da primeira prova: ");
        n1 = input.nextDouble();

        System.out.println("Digite o valor da segunda prova: ");
        n2 = input.nextDouble();

        System.out.println("Digite o valor da terceira prova: ");
        n3 = input.nextDouble();

        total = (n1 + n2 + n3) / 3;

        System.out.println("A média entre os valores das 3 provas é " + total + "!");
    }
}
}
