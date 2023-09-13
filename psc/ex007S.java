package psc;
import java.util.Scanner;
public class ex007S {
    public static void main(String args[]){
    Scanner input = new Scanner ( System.in );
    Double s, p, a, m;

    System.out.print("Digite o valor do seu salário: ");
    s = input.nextDouble();

    System.out.print("Digite a porcentagem que irá receber de aumento: ");
    p = input.nextDouble();

    m = p / 100;

    a = s + (s*m);

    System.out.println("O seu salário será de R$" + a + ("!"));
    }
}
