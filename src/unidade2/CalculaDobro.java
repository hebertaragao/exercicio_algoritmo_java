package unidade2;

import java.util.Scanner;

public class CalculaDobro {
public static void main(String[]args){

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o seu número: ");
    double numero = teclado.nextDouble();
    double dobro = numero * 2;
    System.out.println("O dobro do número é: "+dobro);
}

}
