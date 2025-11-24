package Tests.Vetor;

import Utils.Gerador;
import Utils.Timer;
import Vetor.*;

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


    public static void testarTodosOsCenarios(){

        Gerador g = new Gerador();

        int[] tamanhos = {100, 1000, 10000};

        for(int n : tamanhos){

            int[] crescente = g.gerarCrescente(n);
            int[] decrescente = g.gerarDecrescente(n);
            int[] aleatorio = g.gerarAleatorio(n);

            System.out.println("\n----- Testes para " + n + " elementos -----");

            System.out.println("Inserção Crescente:   " + mediaInsercaoVetor(crescente) + " ns");
            System.out.println("Inserção Decrescente: " + mediaInsercaoVetor(decrescente) + " ns");
            System.out.println("Inserção Aleatória:   " + mediaInsercaoVetor(aleatorio) + " ns");
        }
    }

}
