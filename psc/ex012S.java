package psc;
import java.util.Scanner;

public class ex012S {
    public static void main(String args[]){    
    Scanner input = new Scanner( System.in);
    
    int x;
    
    System.out.print("Digite um número: ");
    x = input.nextInt();
    
    System.out.println("A tabuada do número " + x + " é:");
    System.out.println(x + " x 1 = " + (x * 1));
    System.out.println(x + " x 2 = " + (x * 2));
    System.out.println(x + " x 3 = " + (x * 3));
    System.out.println(x + " x 4 = " + (x * 4));
    System.out.println(x + " x 5 = " + (x * 5));
    System.out.println(x + " x 6 = " + (x * 6));
    System.out.println(x + " x 7 = " + (x * 7));
    System.out.println(x + " x 8 = " + (x * 8));
    System.out.println(x + " x 9 = " + (x * 9));
    System.out.println(x + " x 10 = " + (x * 10));
    }
}