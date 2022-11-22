package unidade2;

import javax.swing.*;

public class Locadora {
    public static void main(String[]args){
        var titulo_filme = JOptionPane.showInputDialog("Digite o Título do filme ");
        int duracao_filme_horas = Integer.parseInt((JOptionPane.showInputDialog("Informar o número de horas do filme")));
        int duracao_filme_minutos = Integer.parseInt((JOptionPane.showInputDialog("Informar o número de minutos do filme ")));
        int nova_duracao_filme = duracao_filme_horas*60 + duracao_filme_minutos;
        JOptionPane.showMessageDialog(null, "A duração total do filme é de: "+nova_duracao_filme+ " minutos");
    }
}
