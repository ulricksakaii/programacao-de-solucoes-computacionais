package psc;
import javax.swing.JOptionPane;

public class ex010J {
    public static void main(String args[]){
        double p, q, v;
    
    p = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso atual: "));
    
    q = p - (p * 0.15);
    
    v = p - (p * 0.20);
    
    
    String q1 = String.format("%.1fKg", q);
    String v1 = String.format("%.1fKg", v);
    
    JOptionPane.showMessageDialog(null, "O seu peso, condirerando perder 15% será de " + q1 + ".");
    
    JOptionPane.showMessageDialog(null, "O seu peso, considerando perder 20% será de " + v1 + ".");
    }
}
