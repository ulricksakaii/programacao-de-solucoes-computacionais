package psc;
import javax.swing.JOptionPane;

public class ex009J {
    public static void main(String args[]){
    
        Double sal, min, rec;
    
    sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário: "));
    
    min = (1320.00);
    
    rec = sal / min;
    
    JOptionPane.showMessageDialog(null, "Você recebe o total de " + rec + "salário(s) mínimos!");
    }
}
