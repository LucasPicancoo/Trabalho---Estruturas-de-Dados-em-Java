package Tests.Vetor;

import Utils.Gerador;
import Utils.Timer;
import Vetor.Vetor;
import Vetor.OrdenacaoSimples;

import static Tests.warmupJVM.warmupJVM;

public class TesteOrdenacaoSimplesVetor {

    public static long testeBubbleSort(Vetor v) {

        Timer timer = new Timer();

        timer.start();
        OrdenacaoSimples.bubbleSort(v);
        timer.stop();

        return timer.getTempo();
    }

    public static long mediaBubbleSort(Vetor v) {
        long soma = 0;

        Vetor warmup = v.copiar();
        OrdenacaoSimples.bubbleSort(warmup);

        for (int i = 0; i < 5; i++) {
            // precisa clonar o vetor para não ordenar sempre o mesmo
            Vetor copia = v.copiar();
            soma += testeBubbleSort(copia);
        }

        return soma / 5;
    }

    public static void testarTodosOsCenarios(Gerador g, int[] valores) {

        int n = valores.length;

        System.out.println("\n----- Teste Bubble Sort. Tamanho = " + n + " -----");

        warmupJVM();

        Vetor v = new Vetor(n);
        v.inserir(valores);

        long tempo = mediaBubbleSort(v);

        System.out.println("Tempo médio Bubble Sort: " + tempo + " ns");
    }
}
