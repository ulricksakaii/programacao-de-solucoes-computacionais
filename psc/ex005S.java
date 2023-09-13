package psc;
import java.util.Scanner;
public class ex005S {
public static void main(String args[]){
    Scanner input = new Scanner( System.in);
    int data, ano, c;

    System.out.print("Digite em que ano você nasceu: ");
    data = input.nextInt();

    ano = 2023 - data;

    c = ano + 27;

    System.out.println("Você tem " + ano + " anos, Certo? \nEm 2050 você terá " + c + "  anos!");

    }
}
