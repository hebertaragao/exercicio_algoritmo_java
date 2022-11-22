package unidade2;

import javax.swing.*;

public class CalculoHoras {
    public static void main(String[]args){
        int dias = Integer.parseInt((JOptionPane.showInputDialog("Informar o número de dias da viagem")));
        int horas = Integer.parseInt((JOptionPane.showInputDialog("Informe o número de horas da viagem")));
        int total_horas = (dias*24) + horas;
        JOptionPane.showMessageDialog(null, "O valor total da viagem em horas foi: "+total_horas +" horas");
    }
}
