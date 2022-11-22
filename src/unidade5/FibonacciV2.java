package unidade5;

import java.util.Scanner;

public class FibonacciV2
{
    public static void fibo(int numero)
    {
        int s1 = 1;
        int s2 = 1;
        int s = 0;
        System.out.print(s1 + "," + s2 + ",");

        for (int i = 3; i <= numero; i++)
        {
            s = s1 + s2;
            s1 = s2;
            s2 = s;
            System.out.print(s+ ",");
        }
    }
        public static void main (String[]args)
        {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Favor informar o número: ");
            int numero = teclado.nextInt();
            fibo(numero);
            teclado.close();
        }


}
