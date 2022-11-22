package unidade4;

public class PopulacaoAB {
    public static void main(String[] args) {
        //constantes
        final int habitantesA = 5000000;
        final int habitantesB = 7000000;
        final double taxaA = 0.03;
        final double taxaB = 0.02;

        //variaveis
        int tempo = 0;
        double populacaoA = habitantesA;
        double populacaoB = habitantesB;

        //inicio código
        while (populacaoB >= populacaoA){
            populacaoB = populacaoB + populacaoB*taxaB;
            populacaoA = populacaoA + populacaoA*taxaA;
            tempo++;
        }
        System.out.println("A população de A levará "+tempo+" anos para superar a população de B");
    }
}
