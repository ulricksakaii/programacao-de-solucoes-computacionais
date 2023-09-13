package psc;
import javax.swing.JOptionPane;

public class ex008J {
    public static void main(String args[]){
        Double c, t;
    
    c = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em ceusius: "));

    t = (c * 1.8) + 32;
    
    JOptionPane.showMessageDialog(null, "A temperatura " + c + " em graus fahrenheit será " + t + "!");
    }
}
