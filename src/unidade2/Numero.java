package unidade2;

import javax.swing.*;

public class Numero {
    public static void main(String[]args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informar o número: "));
        int anterior = numero - 1;
        int posterior = numero + 1;
        JOptionPane.showMessageDialog(null, "O valor do número anterior é = " +anterior+" e o posterior = " +posterior);
    }
}
