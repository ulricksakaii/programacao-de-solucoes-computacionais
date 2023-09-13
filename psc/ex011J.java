package psc;
import javax.swing.JOptionPane;
import java.lang.Math;

public class ex011J {
    public static void main(String args[]){
        Double c1, c2, hip, r;
    
    c1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cateto: "));
    
    c2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto oposto: "));
    
    //hip = Math.sqrt((Math.pow(c1, 2) + Math.pow(c2, 2)));
    hip = Math.hypot(c1, c2);
    
    String m = String.format("A hipotenusa é: %.2f", hip);
    
    //JOptionPane.showMessageDialog(null, "A hipotenusa será: " + h);
    JOptionPane.showMessageDialog(null, m);
    }
}
