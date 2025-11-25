package Tests.Vetor;

import Utils.Gerador;
import Utils.Timer;
import Vetor.*;

import static Tests.warmupJVM.warmupJVM;

public class TesteInsercaoVetor {

    public static long testeInsercaoVetor(Vetor v, int[] valores){

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


    public static void testarTodosOsCenarios(Gerador g, int n){

        System.out.println("\n----- Teste de inserção em vetor. Tamanho = " + n + " -----");

        warmupJVM();

        int[] crescente = g.gerarCrescente(n);
        int[] decrescente = g.gerarDecrescente(n);
        int[] aleatorio = g.gerarAleatorio(n);

        int[] a = g.gerarAleatorio(n);
        TesteInsercaoVetor.mediaInsercaoVetor(a);

        long tempoCrescente = TesteInsercaoVetor.mediaInsercaoVetor(crescente);
        long tempoDecrescente = TesteInsercaoVetor.mediaInsercaoVetor(decrescente);
        long tempoAleatorio = TesteInsercaoVetor.mediaInsercaoVetor(aleatorio);

        System.out.println("Tempo médio inserção (Crescente):   " + tempoCrescente   + " ns");
        System.out.println("Tempo médio inserção (Decrescente): " + tempoDecrescente + " ns");
        System.out.println("Tempo médio inserção (Aleatório):   " + tempoAleatorio   + " ns");
    }

}
