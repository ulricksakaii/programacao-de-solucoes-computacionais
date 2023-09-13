package psc;

import java.util.Scanner;

public class ex001CS {
    public static void main(String args[]){
    Scanner input = new Scanner( System.in);
    Double n1, n2, n3, m;

    System.out.print("Digite a nota da sua primeira prova: ");
    n1 = input.nextDouble();

    System.out.print("Digite a nota da sua segunda prova: ");
    n2 = input.nextDouble();

    System.out.print("Digite a nota da sua terceira prova: ");
    n3 = input.nextDouble();

    m = (n1 + n1 + n3) / 3;

    if (m >= 0 && m < 3){
        System.out.printf("Você foi reprovado! Obteve uma média de %.1f pontos.", (m));}
    
    else if (m >= 3 && m < 7){
        System.out.printf("Você terá que fazer um novo exame, obteve a média de %.1f pontos.", (m));}
    
    else{
        System.out.printf("Parabéns, você foi aprovado! Obteve uma média de %.1f pontos.", (m));}
    
    }
}
