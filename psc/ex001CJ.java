package psc;

import javax.swing.JOptionPane;

public class ex001CJ {
    public static void main(String args[]){
    Double n1, n2, n3, m;

    n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da sua primeira prova: "));

    n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da sua segunda prova: "));

    n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da sua terceira prova: "));

    m = (n1 + n2 + n3) / 3;

    String m1 = String.format("%.1f", m);
    
    if(m >= 0 && m < 3){
        JOptionPane.showMessageDialog(null, "Você foi reprovado! \nObteve uma média de " + m1 + " pontos.");}
    
    else if (m >= 3 && m < 7){
        JOptionPane.showMessageDialog(null, "Você terá que fazer um novo exame! \nObteve uma média de " + m1 + " pontos.");}
    
    else{
        JOptionPane.showMessageDialog(null, "Parabéns, você foi aprovado! \nObteve uma média de " + m1 + " pontos.");}
    }
}
