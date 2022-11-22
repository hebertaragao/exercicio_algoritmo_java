package unidade5;

import javax.swing.*;
import java.util.Scanner;

public class Matematica {
    public static void tabuada(int numero)
    {
        int total;
        for (int i=1; i<=10; i++)
        {
            total = numero *i;
            System.out.println("Número: " +numero+ "x" +i+ " = ="+ total);

        }

    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar o número ");
        int numero = teclado.nextInt();
        tabuada(numero);
        teclado.close();

    }
}
