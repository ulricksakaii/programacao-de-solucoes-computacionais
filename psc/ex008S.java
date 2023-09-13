package psc;
import java.util.Scanner;

public class ex008S {
    public static void main(String args[]){
    Scanner input = new Scanner( System.in );
    
        Double c, t;

    System.out.print("Digite a temperatura em graus ceusius: ");
    c = input.nextDouble();
    
    t = (c * 18) + 32;

    System.out.println("A temperatura" + c + " em graus fahrenheit será" + t + "!");
        }
}
