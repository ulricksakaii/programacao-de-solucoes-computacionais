package psc;
import javax.swing.JOptionPane;
public class ex004J {
    public static void main(String[] args) {
        double n1, n2, n3, total;   
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digitie o valor da primeira prova: "));
        
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da segunda prova: "));
        
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da terceira prova: "));
        
        total = (n1 + n2 + n3) / 3;
        
        JOptionPane.showInputDialog(null, "A média entre as três provas é " + total + "!");
    }
}
