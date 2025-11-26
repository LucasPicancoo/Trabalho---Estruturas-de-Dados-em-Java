package Tests.Vetor;

import Utils.Gerador;
import Utils.Timer;
import Vetor.Vetor;

import java.util.Arrays;
import java.util.Random;

import static Tests.warmupJVM.warmupJVM;

public class TesteBuscaBinariaVetor {

    public static long testeBuscaBinaria(Vetor v, int numeroBuscado){

        int meioValor = v.getValorNoIndice(v.getTamanho() / 2);

        // Warmup
        for (int i = 0; i < 200; i++) {
            v.buscaBinaria(meioValor);
        }

        Timer t = new Timer();

        t.start();
        v.buscaBinaria(numeroBuscado);
        t.stop();

        return t.getTempo();
    }

    public static long mediaBuscaBinaria(Vetor v, int valor) {
        long soma = 0;

        for (int i = 0; i < 5; i++) {
            soma += testeBuscaBinaria(v, valor);
        }

        return soma / 5;
    }

    public static void testarTodosOsCenarios(Gerador g, int[] valores) {

        System.out.println("\n----- Teste de busca Binária. Tamanho = " + valores.length + " -----");

        warmupJVM();

        Arrays.sort(valores);

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
        if (v.buscaBinaria(inexistente) != -1) {
            inexistente = Integer.MIN_VALUE;
        }

        long tPrimeiro = mediaBuscaBinaria(v, primeiro);
        long tUltimo   = mediaBuscaBinaria(v, ultimo);
        long tMeio     = mediaBuscaBinaria(v, meio);

        long tAle1     = mediaBuscaBinaria(v, ale1);
        long tAle2     = mediaBuscaBinaria(v, ale2);
        long tAle3     = mediaBuscaBinaria(v, ale3);

        long tInexistente = mediaBuscaBinaria(v, inexistente);


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
