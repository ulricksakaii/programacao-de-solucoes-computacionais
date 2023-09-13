package psc;
import java.lang.Math;
import java.util.Scanner;

public class ex014S {
    public static void main(String args[]){
    Scanner Input = new Scanner( System.in);
    Double r, c, v, a;

    System.out.print("Vamos calcular o comprimento, área e volume de uma esfera!");
    
    System.out.print("Digite o valor do raio em cm: ");
    r = Input.nextDouble();

    c = 2 * Math.PI * r;

    a = 4 * Math.PI * (Math.pow(r, 2));

    v = (4.0 / 3.0) * Math.PI * (Math.pow(r, 3));

    
    System.out.printf("O comprimento da esfera é: %.2f", (c) + "cm; \nA área será: %.2f", (a) + "cm; \n O volume: %.2f", (v) + "cm.");

    }
}
