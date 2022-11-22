package unidade4;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar o valor: ");
        var valor = teclado.nextInt();

        var soma_valor = 0;
        var cont = 0;

        while (valor != -1) {// inicio while
            soma_valor = soma_valor + valor;
            cont++;
            System.out.println("Favor informar o valor: ");
            valor = teclado.nextInt();

        }// fim while
        System.out.println("Média = " + soma_valor / cont);
    }
}
