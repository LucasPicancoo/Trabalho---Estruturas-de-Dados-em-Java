package Tests.ArvoreAVL;

import Utils.Gerador;
import Utils.Timer;
import Arvore.*;

public class TesteInsercaoAVL {

    public static long testeInsercaoAVL(ArvoreAVL a, int[] valores){

        Timer t = new Timer();

        t.start();
        a.inserir(valores);
        t.stop();

        return t.getTempo();

    }


    public static long mediaInsercaoAVL(int[] valores){
        long soma = 0;

        for (int i = 0; i < 5; i++) {
            ArvoreAVL atemp = new ArvoreAVL();
            soma += testeInsercaoAVL(atemp, valores);
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

            System.out.println("\n----- Testes para " + n + " elementos - Árvore AVL -----");

            System.out.println("Inserção Crescente:   " + mediaInsercaoAVL(crescente) + " ns");
            System.out.println("Inserção Decrescente: " + mediaInsercaoAVL(decrescente) + " ns");
            System.out.println("Inserção Aleatória:   " + mediaInsercaoAVL(aleatorio) + " ns");
        }
    }
}
