package unidade5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MatrizIdentidadeV2 {
    public static void main(String[] args) throws IOException {
        int i, j;
        int I[][] = new int[3][3];

        //Arquivo para guardar aas informações da Matriz Identidadde
        FileWriter arq = new FileWriter("matriz.txt");
        PrintWriter gravaarq = new PrintWriter(arq);
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                if (i == j)
                    I[i][j] = 1;
                else
                    I[i][j] = 0;
            }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                gravaarq.print(I[i][j]);
                gravaarq.println();
        }
        arq.close();
        gravaarq.close();
    }
}
