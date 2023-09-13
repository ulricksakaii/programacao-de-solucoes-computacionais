package psc;
import javax.swing.JOptionPane;
public class ex005J {
    public static void main(String args[]){
    int data, ano, c;
    
    data = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu: "));
    
    ano = 2023 - data;
    
    c = ano + 27;
    
    JOptionPane.showMessageDialog(null, "Você tem " + ano + "anos, correto?!");
    JOptionPane.showMessageDialog(null, "Em 2050, você terá " + c + "!"); 
    }
}
