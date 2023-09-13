package psc;
import javax.swing.JOptionPane;
public class ex006J {
    public static void main(String args[]){
    
        Double cot, din, total;
    
    cot = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação atual do Dólar: "));
    
    din = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja converter: "));
    
    total = din / cot;
    
    JOptionPane.showMessageDialog(null, "O valor convertido será de U$" + total + "!");

    }
}
