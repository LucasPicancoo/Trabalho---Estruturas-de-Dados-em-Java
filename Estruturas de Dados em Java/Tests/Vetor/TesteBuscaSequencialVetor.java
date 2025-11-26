package Tests.Vetor;

import Utils.Gerador;
import Utils.Timer;
import Vetor.*;

import java.util.Random;

import static Tests.warmupJVM.warmupJVM;

public class TesteBuscaSequencialVetor {

    public static long testeBuscaSequencial(Vetor v, int numeroBuscado){

        Timer t = new Timer();

        t.start();
        v.buscaSequencial(numeroBuscado);
        t.stop();

        return t.getTempo();
    }

    public static long mediaBuscaSequencial(Vetor v, int valor) {
        long soma = 0;

        for (int i = 0; i < 5; i++) {
            soma += testeBuscaSequencial(v, valor);
        }

        return soma / 5;
    }


    public static void testarTodosOsCenarios(Gerador g, int[] valores) {

        System.out.println("\n----- Teste de busca Sequencial. Tamanho = " + valores.length + " -----");

        warmupJVM();

        Vetor v = new Vetor(valores.length);
        v.inserir(valores);

        int n = valores.length;

        int primeiro = valores[0];
        int ultimo   = valores[n - 1];
        int meio     = valores[n / 2];

        Random r = new Random();

        int ale1 = valores[r.nextInt(n)];
        int ale2 = valores[r.nextInt(n)];
        int ale3 = valores[r.nextInt(n)];

        int inexistente = -1;
        if (v.buscaSequencial(inexistente) != -1) {
            inexistente = Integer.MIN_VALUE; // valor garantido que não existe
        }

        long tPrimeiro = mediaBuscaSequencial(v, primeiro);
        long tUltimo   = mediaBuscaSequencial(v, ultimo);
        long tMeio     = mediaBuscaSequencial(v, meio);

        long tAle1     = mediaBuscaSequencial(v, ale1);
        long tAle2     = mediaBuscaSequencial(v, ale2);
        long tAle3     = mediaBuscaSequencial(v, ale3);

        long tInexistente = mediaBuscaSequencial(v, inexistente);

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
