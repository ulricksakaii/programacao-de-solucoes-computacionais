package psc;
import java.util.Scanner;

public class ex010S {
    public static void main(String args[]){
    Scanner input = new Scanner( System.in);
    Double p, q, v;

    System.out.print("Digite o seu peso atual: ");
    p = input.nextDouble();

    q = p - (p * 0.15);

    v = p - (p *0.20);
    
    System.out.printf("O seu peso, considerando perder 15% seria equivalente á %.1fKg.", q);

    System.out.printf("O seu peso, considerando perder 20% será equivalente á %.1fKg.", v);
    }
}
