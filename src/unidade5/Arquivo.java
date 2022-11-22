package unidade5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
    public static void main(String[] args) throws IOException {

        String[] nomes = {"Elizio", "Breno", "Hélio"};
        //vetor de nomes

        String[] fones = {"11111-1111", "1111-1111,", "44444-4444"};
        //vetor de telefones

        String[] cidades = { "mossoró", "Apodi", "Assu"};
        //vetor de cidades

        FileWriter arq = new FileWriter("contatos.txt");
        PrintWriter gravaarq = new PrintWriter(arq);
        gravaarq.println("========================================");
        gravaarq.println("Nomes || Telefones || Cidades       ");
        for (int i = 0; i < nomes.length; i++)
        {
            gravaarq.println("========================================");
            gravaarq.print(nomes[i]+"  ||  ");
            gravaarq.print(fones[i]+"  ||  ");
            gravaarq.println(cidades[i]);
        }
        gravaarq.println("========================================");
        arq.close();
        gravaarq.close();
    }
}
