package unidade5;

public class MatrizIdentidade {
    public static void main(String[] args) {
        int i, j;
        int I[][] = new int[3][3];
        for (i=0;i<3;i++)
            for (j=0; j<3; j++)
            {
                if (i == j)
                    I[i][j] = 1;
                else
                    I[i][j] = 0;
            }
        for (i=0;i<3;i++) {
            for (j = 0; j < 3; j++)
                System.out.print(I[i][j]);
            System.out.println();
        }
    }
}
