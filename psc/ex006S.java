package psc;
import java.util.Scanner;
public class ex006S {
    public static void main(String args[]){
        Scanner input = new Scanner( System.in);
        
        Double cot, din, total;
    
        System.out.print("Digite a cotação atual do Dólar: ");
        cot = input.nextDouble();
    
        System.out.print("Digite o valor que deseja converter: ");
        din = input.nextDouble();
    
        total = din / cot;
    
        System.out.println("R$" + din + " convetido, equivalem á U$" + total + "na cotação atual.");
    }
}
