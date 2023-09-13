package psc;

import javax.swing.JOptionPane;
import java.lang.Math;

public class ex002CJ {
    public static void main(String args[]){
        Double p, a, mc;

        p = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso em kg: "));

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em centímetros: "));

        mc = p / (Math.pow((a / 100), 2));
        
        String mc1 = String.format("%.0f", mc);

        if(mc >= 0 && mc < 20){
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso! \nSendo o seu IMC: " + mc1);}
        
        else if(mc >= 20 && mc < 25){
            JOptionPane.showMessageDialog(null, "Você está em um peso ideal! \nSendo o seu IMC: " + mc1);}
        
        else if(mc >= 20 && mc < 30){
            JOptionPane.showMessageDialog(null, "Você está acima do peso ideal! \nSendo o seu IMC: " + mc1);}
        
        else if(mc >= 30 && mc < 40){
            JOptionPane.showMessageDialog(null, "Você está com um grau de obesidade! \nSendo o seu IMC: " + mc1);}

        else{
            JOptionPane.showMessageDialog(null, "Você está com um grau de obesidade! \nSendo o seu IMC: " + mc1);} 
    }
}
