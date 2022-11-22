package unidade3;

import javax.swing.*;

public class FormaPagamento {
    public static void main(String[]args){

        double valor_produto, valor_final_produto;
        int codigo;
        valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do produto R$"));
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o tipo de pagamento [1 - 10% de desconto à vista R$]" +
                " [2 - 5% de desconto no cartão R$] [3 - 2x sem juros R$] [4 - 3x com juros R$] "));
        switch (codigo)
        {
            case 1: //desconto 10%
            {
                valor_final_produto = valor_produto * 0.9;
                JOptionPane.showMessageDialog(null,"O valor final com desconto de 10% será de R$ "+valor_final_produto+ " Reais");
                break;
            }
            case 2: // desconto de 5%
            {
                valor_final_produto = valor_produto * 0.95;
                JOptionPane.showMessageDialog(null,"O valor final com desconto de 5% será de R$ "+valor_final_produto+ " Reais");
                break;
            }
            case 3: // 2x sem juross
            {
                valor_final_produto = valor_produto;
                JOptionPane.showMessageDialog(null,"O valor em 2x sem juros será de R$ "+valor_final_produto/2 + " Reais");
                break;
            }
            case 4: //3x com juros de 10%
            {
                valor_final_produto = valor_produto * 1.1;
                JOptionPane.showMessageDialog(null,"O valor em 3x com juros de 10% será de R$ "+valor_final_produto/3 +" Reais");
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "Opção incorreta");
                FormaPagamento.main(null);
        }

    }
}
