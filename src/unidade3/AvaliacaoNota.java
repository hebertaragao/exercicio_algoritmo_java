package unidade3;

import java.util.Scanner;

public class AvaliacaoNota {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da nota ");
        var nota = teclado.nextInt();

        if ((nota >= 0) && (nota <= 100)) {
            if (nota >= 90)
                System.out.println("Conceito Excelente!");
            else if (nota >= 70)
                System.out.println("Conceito Bom!");
            else if (nota >= 50)
                System.out.println("Conceito Regular!");
            else
                System.out.println("Conceito Insuficiente");
        } else
            System.out.println("Nota inválida!");
    }
}
