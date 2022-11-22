package unidade2;

import javax.swing.*;

public class EscrevaVariaveis {
    public static  void  main(String[] args){
        //String fruta = "Banana";
        var valor = 3.50;
        var fruta = JOptionPane.showInputDialog("Digite a fruta: ");
        //System.out.println("O valor da "+fruta+" é de "+valor);
        JOptionPane.showMessageDialog(null, "O valor da "+fruta+" é de: "+valor);
    }
}
