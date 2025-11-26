package Tests.ArvoreAVL;

import Utils.Gerador;
import Utils.Timer;
import Arvore.*;

import java.util.Random;

import static Tests.warmupJVM.warmupJVM;

public class TesteBuscaAVL {

    public static long testeBuscaAVL(ArvoreAVL avl, int valor) {

        Timer t = new Timer();

        t.start();
        avl.buscar(valor);
        t.stop();

        return t.getTempo();
    }


    public static long mediaBuscaAVL(ArvoreAVL avl, int valor) {
        long soma = 0;

        for (int i = 0; i < 5; i++) {
            soma += testeBuscaAVL(avl, valor);
        }

        return soma / 5;
    }


    public static void testarTodosOsCenarios(Gerador g, int[] valores) {

        System.out.println("\n----- Teste de busca em AVL. Tamanho = " + valores.length + " -----");

        warmupJVM();

        ArvoreAVL avl = new ArvoreAVL();
        avl.inserir(valores);

        int n = valores.length;

        int primeiro = valores[0];
        int ultimo   = valores[n - 1];
        int meio     = valores[n / 2];

        Random r = new Random();

        int ale1 = valores[r.nextInt(n)];
        int ale2 = valores[r.nextInt(n)];
        int ale3 = valores[r.nextInt(n)];

        int inexistente = -1;
        if (avl.buscar(inexistente) != null) {
            inexistente = Integer.MIN_VALUE; // fallback extremo
        }

        long tPrimeiro = mediaBuscaAVL(avl, primeiro);
        long tUltimo   = mediaBuscaAVL(avl, ultimo);
        long tMeio     = mediaBuscaAVL(avl, meio);

        long tAle1     = mediaBuscaAVL(avl, ale1);
        long tAle2     = mediaBuscaAVL(avl, ale2);
        long tAle3     = mediaBuscaAVL(avl, ale3);

        long tInexistente = mediaBuscaAVL(avl, inexistente);


        // --------- Saída ---------
        System.out.println("Tempo médio busca (Primeiro elemento):     " + tPrimeiro + " ns");
        System.out.println("Tempo médio busca (Último elemento):       " + tUltimo   + " ns");
        System.out.println("Tempo médio busca (Elemento do meio):      " + tMeio    + " ns");
        System.out.println("Tempo médio busca (Aleatório 1):           " + tAle1    + " ns");
        System.out.println("Tempo médio busca (Aleatório 2):           " + tAle2    + " ns");
        System.out.println("Tempo médio busca (Aleatório 3):           " + tAle3    + " ns");
        System.out.println("Tempo médio busca (Inexistente):           " + tInexistente + " ns");
    }

}
