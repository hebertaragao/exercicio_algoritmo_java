package unidade3;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o lado A do triângulo ");
        var a = teclado.nextInt();
        System.out.println("Digite o lado B do triângulo");
        var b = teclado.nextInt();
        System.out.println("Digite o lado C do triângulo");
        var c = teclado.nextInt();
        if ((a < b + c) && (b < a + c) && (c < a + b))
        {
            if ((a == b) && (b == c))
                System.out.println("Triângulo Equilátero!");
            else
            {
                if ((a == b) || (b == c))
                    System.out.println("Triângulo Isóceles!");
                else
                    System.out.println("Triângulo Escaleno!");
            }
        } else
            System.out.println("Os lados informados não formam um triângulo!");
    }
}
