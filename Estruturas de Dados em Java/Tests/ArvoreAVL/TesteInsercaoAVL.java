package Tests.ArvoreAVL;

import Utils.Gerador;
import Utils.Timer;
import Arvore.*;

import static Tests.warmupJVM.warmupJVM;

public class TesteInsercaoAVL {

    public static long testeInsercaoAVL(ArvoreAVL a, int[] valores){

        Timer t = new Timer();

        t.start();
        a.inserir(valores);
        t.stop();

        return t.getTempo();

    }


    public static long mediaInsercaoAVL(int[] valores) {
        long soma = 0;

        for (int i = 0; i < 5; i++) {
            ArvoreAVL atemp = new ArvoreAVL();
            soma += testeInsercaoAVL(atemp, valores);
        }

        return soma / 5;
    }


    public static void testarTodosOsCenarios(Gerador g, int n){

        System.out.println("\n----- Teste de inserção em AVL. Tamanho = " + n + " -----");

        warmupJVM();

        int[] crescente = g.gerarCrescente(n);
        int[] decrescente = g.gerarDecrescente(n);
        int[] aleatorio = g.gerarAleatorio(n);

        // Aquecer AVL antes de medir
        int[] a = g.gerarAleatorio(n);
        TesteInsercaoAVL.mediaInsercaoAVL(a);

        long tempoCrescente   = TesteInsercaoAVL.mediaInsercaoAVL(crescente);
        long tempoDecrescente = TesteInsercaoAVL.mediaInsercaoAVL(decrescente);
        long tempoAleatorio   = TesteInsercaoAVL.mediaInsercaoAVL(aleatorio);

        System.out.println("Tempo médio inserção (Crescente):   " + tempoCrescente   + " ns");
        System.out.println("Tempo médio inserção (Decrescente): " + tempoDecrescente + " ns");
        System.out.println("Tempo médio inserção (Aleatório):   " + tempoAleatorio   + " ns");
    }

}
