package Tests.Vetor;

import Utils.Timer;
import Vetor.*;

public class TesteInsercao {

    private static long testeInsercaoVetor(Vetor v, int[] valores){

        Timer t = new Timer();

        t.start();
        v.inserir(valores);
        t.stop();

        return t.getTempo();
    }

    public static long mediaInsercaoVetor(int[] valores) {
        long soma = 0;

        for (int i = 0; i < 5; i++) {
            Vetor vtemp = new Vetor(valores.length);
            soma += testeInsercaoVetor(vtemp, valores);
        }

        return soma / 5;
    }

}
