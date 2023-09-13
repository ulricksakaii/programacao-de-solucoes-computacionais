package psc;
import javax.swing.JOptionPane;

public class ex013J {
    public static void main(String args[]) {
    Double dm, dn, a;
    
    JOptionPane.showMessageDialog(null, "Vamos calcular a área de um losango!");
    
    dm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal menor: "));
    
    dn = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal maior: "));
    
    a = (dm * dn) / 2;
    
    JOptionPane.showMessageDialog(null,"A área do losango é " + a + ".");
    }
}
