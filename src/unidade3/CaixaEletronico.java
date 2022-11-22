package unidade3;

import javax.swing.*;

public class CaixaEletronico {
    public static void main(String[]args){
        int saque, resto;
        double notas100, notas50, notas10;

        saque = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor do saque! "));
        if (saque%10 == 0)
        {
            notas100 = Math.floor(saque/100);
            resto = saque % 100;
            notas50 = Math.floor(saque/50);
            resto = resto % 50;
            notas10 = Math.floor(resto/10);

            if (notas100 > 0)
                System.out.println("O número de notas de Cem = "+notas100);
            if (notas50 > 0)
                System.out.println("O número de notas de Cinquenta ="+notas50);
            if (notas10 > 0)
                System.out.println("O número de notas de Dez = "+notas10);

        }
        else
            System.out.println("Valor do saque está incorreto!");
    }
}
