package Tests.ArvoreABB;

import Utils.Gerador;
import Utils.Timer;
import Arvore.*;

import java.util.Random;

import static Tests.warmupJVM.warmupJVM;

public class TesteBuscaABB {

    public static long testeBuscaABB(Arvore a, int valor) {

        Timer t = new Timer();

        t.start();
        a.buscar(valor);
        t.stop();

        return t.getTempo();
    }


    public static long mediaBuscaABB(Arvore a, int valor) {
        long soma = 0;

        for (int i = 0; i < 5; i++) {
            soma += testeBuscaABB(a, valor);
        }

        return soma / 5;
    }


    public static void testarTodosOsCenarios(Gerador g, int[] valores) {

        System.out.println("\n----- Teste de busca em ABB. Tamanho = " + valores.length + " -----");

        warmupJVM();

        Arvore a = new Arvore();
        a.inserir(valores);

        int n = valores.length;

        int primeiro = valores[0];
        int ultimo   = valores[n - 1];
        int meio     = valores[n / 2];

        Random r = new Random();

        int ale1 = valores[r.nextInt(n)];
        int ale2 = valores[r.nextInt(n)];
        int ale3 = valores[r.nextInt(n)];

        int inexistente = valores[n - 1] + 1;
        if (a.buscar(inexistente) != null) {
            inexistente = Integer.MIN_VALUE;
        }

        long tPrimeiro = mediaBuscaABB(a, primeiro);
        long tUltimo   = mediaBuscaABB(a, ultimo);
        long tMeio     = mediaBuscaABB(a, meio);

        long tAle1     = mediaBuscaABB(a, ale1);
        long tAle2     = mediaBuscaABB(a, ale2);
        long tAle3     = mediaBuscaABB(a, ale3);

        long tInexistente = mediaBuscaABB(a, inexistente);


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
