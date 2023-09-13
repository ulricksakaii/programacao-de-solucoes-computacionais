package psc;

import java.util.Scanner;
import java.lang.Math;

public class ex002CS {
    public static void main(String args[]){
        Scanner input = new Scanner( System.in);
        Double p, a, mc;
        
        System.out.print("Digite o seu peso em kg: ");
        p = input.nextDouble();

        System.out.print("Digite a sua altura em cm: ");
        a = input.nextDouble();

        mc = p / (Math.pow((a / 100), 2));

        if(mc >= 0 && mc < 20){
            System.out.printf("Você está abaixo do peso! \nDiante de um IMC de %.0!", mc);}
        
        else if(mc >=20 && mc < 25){
            System.out.printf("Você está no peso ideal! \nDiante de um IMC de %.0f!", mc);}
        
        else if(mc >=25 && mc < 30){
           System.out.printf("Você está acima do peso ideal! \nDiante de um IMC de %.0f!", mc);}

        else if(mc >= 30 && mc < 40){
            System.out.printf("Você está com um grau de obesidade! \nDiante de um IMC de %.0f", mc);}
        
           else{
            System.out.printf("Você está com um grau de obesidade mórbida! \nDiante de um IMC de %.0f!");}
        }

    }
