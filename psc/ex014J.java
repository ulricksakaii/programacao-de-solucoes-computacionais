package psc;
import javax.swing.JOptionPane;
import java.lang.Math;

public class ex014J {
    public static void main(String args[]){   
    Double r, c, v, a;
    
    JOptionPane.showMessageDialog(null, "Vamos calcular o comprimento, área e volume de uma esfera!");
    
    r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio em cm: "));
    
    c = 2 * Math.PI * r;
    
    a = 4 * Math.PI * (Math.pow(r, 2));
    
    v = (4.0/3.0) * Math.PI * (Math.pow(r, 3));
    
    String c1 = String.format("é %.2f", c);
    String a1 = String.format("é %.2f", a);
    String v1 = String.format("é %.2f", v);
    
    JOptionPane.showMessageDialog(null, "O comprimento da esfera é " + c1 + "cm. A área " + a1 + "cm e o volume " + v1 + "cm.");

    }
}
