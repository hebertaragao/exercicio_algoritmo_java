package unidade5;

import javax.swing.*;

public class Aluno {
    public static void main(String[] args) {
        int i;
        String nome;
        String lista_alunos [] = new  String[5];
        for (i=0; i<5; i++)
        {
            nome = JOptionPane.showInputDialog("Digite o nome do aluno ");
            lista_alunos[i] = nome;
        }
        for (i=0; i<5; i++)
        {
            System.out.println("Nome "+lista_alunos[i]);
        }

    }
}
