package Tests.ArvoreABB;

import Utils.Gerador;
import Utils.Timer;
import Arvore.*;

import static Tests.warmupJVM.warmupJVM;

public class TesteInsercaoABB {

    public static long testeInsercaoABB(Arvore a, int[] valores){

        Timer t = new Timer();

        t.start();
        a.inserir(valores);
        t.stop();

        return t.getTempo();

    }


    public static long mediaInsercaoABB(int[] valores) {
        long soma = 0;

        for (int i = 0; i < 5; i++) {
            Arvore atemp = new Arvore();
            soma += testeInsercaoABB(atemp, valores);
        }

        return soma / 5;
    }


    public static void testarTodosOsCenarios(Gerador g, int n){

        System.out.println("\n----- Teste de inserção em ABB. Tamanho = " + n + " -----");

        warmupJVM();

        int[] crescente = g.gerarCrescente(n);
        int[] decrescente = g.gerarDecrescente(n);
        int[] aleatorio = g.gerarAleatorio(n);

        // Aquecimento antes de medir
        int[] a = g.gerarAleatorio(n);
        TesteInsercaoABB.mediaInsercaoABB(a);

        long tempoCrescente   = TesteInsercaoABB.mediaInsercaoABB(crescente);
        long tempoDecrescente = TesteInsercaoABB.mediaInsercaoABB(decrescente);
        long tempoAleatorio   = TesteInsercaoABB.mediaInsercaoABB(aleatorio);

        System.out.println("Tempo médio inserção (Crescente):   " + tempoCrescente   + " ns");
        System.out.println("Tempo médio inserção (Decrescente): " + tempoDecrescente + " ns");
        System.out.println("Tempo médio inserção (Aleatório):   " + tempoAleatorio   + " ns");
    }

}
