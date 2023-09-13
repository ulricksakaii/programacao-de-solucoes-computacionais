package psc;
import javax.swing.JOptionPane;
public class ex007J {
    public static void main(String args[]){
        
        Double s, p, a, m;
    
        s = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário: "));
    
        p = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem que irá receber de aumento: "));
    
        m = p / 100;
    
        a = s + (s * m);
    
        JOptionPane.showMessageDialog(null, "O seu salário será R$" + a + "!");
    }
}