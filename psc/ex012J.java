package psc;
import javax.swing.JOptionPane;

public class ex012J {
    public static void main(String args[]){
    int x;
    
    x = Integer.parseInt((JOptionPane.showInputDialog("Digire um número: ")));

    JOptionPane.showMessageDialog(null, x + " x 1 = " + (x * 1) + "\n" +  x + " x 2 = " + (x * 2) + "\n" +  x + " x 3 = " + (x * 3) + "\n" + x + " x 4 = " + (x * 4) + "\n" + x + " x 5 = " + (x * 5) + "\n" + x + " x 6 = " + (x * 6) + "\n" + x + " x 7 = " + (x * 7) + "\n" + x + " x 8 = " + (x * 8) + "\n" + x + " x 9 = " + (x * 9) + "\n" +  x + " x 10 = " + (x *10));
    
    //JOptionPane.showMessageDialog(null, x + " x 2 = " + (x * 2));
    //JOptionPane.showMessageDialog(null, x + " x 3 = " + (x * 3));
    //JOptionPane.showMessageDialog(null, x + " x 4 = " + (x * 4));
    //JOptionPane.showMessageDialog(null, x + " x 5 = " + (x * 5));
    //JOptionPane.showMessageDialog(null, x + " x 6 = " + (x * 6));
    //JOptionPane.showMessageDialog(null, x + " x 7 = " + (x * 7));
    //JOptionPane.showMessageDialog(null, x + " x 8 = " + (x * 8));
    //JOptionPane.showMessageDialog(null, x + " x 9 = " + (x * 9));
    //JOptionPane.showMessageDialog(null, x + " x 10 = " + (x *10));
    }
}
