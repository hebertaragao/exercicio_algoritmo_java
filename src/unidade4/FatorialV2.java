package unidade4;

import java.util.Scanner;

public class FatorialV2 {
    public static void main(String[] args) {
        double fatorial = 1;
        int numero, i;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar um número: ");
        numero = teclado.nextInt();
        i = numero;

        do
        {
            fatorial = fatorial * i;
            i--;

        }while (i >=1);
        System.out.println("O fatorial do número é: " +numero+ " = " +fatorial);
    }
}
