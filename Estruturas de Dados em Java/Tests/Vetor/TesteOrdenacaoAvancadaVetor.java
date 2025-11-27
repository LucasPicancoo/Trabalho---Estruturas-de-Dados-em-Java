package Tests.Vetor;

import Utils.Gerador;
import Utils.Timer;
import Vetor.*;

import static Tests.warmupJVM.warmupJVM;

public class TesteOrdenacaoAvancadaVetor {

    public static long testeQuickSort(Vetor v){

        Timer t = new Timer();

        t.start();
        OrdenacaoAvancada.quickSort(v);
        t.stop();

        return t.getTempo();
    }

    public static long mediaQuickSort(Vetor v) {
        long soma = 0;

        // warmup para esquentar JIT
        Vetor warmup = v.copiar();
        OrdenacaoAvancada.quickSort(warmup);

        // roda 5 vezes, sempre com cópia
        for (int i = 0; i < 5; i++) {
            Vetor copia = v.copiar();
            soma += testeQuickSort(copia);
        }

        return soma / 5;
    }

    public static void testarTodosOsCenarios(Gerador g, int[] valores) {

        int n = valores.length;

        System.out.println("\n----- Teste QuickSort. Tamanho = " + n + " -----");

        warmupJVM();

        Vetor v = new Vetor(n);
        v.inserir(valores); // vetor original desordenado

        long tempo = mediaQuickSort(v);

        System.out.println("Tempo médio QuickSort: " + tempo + " ns");
    }
}
