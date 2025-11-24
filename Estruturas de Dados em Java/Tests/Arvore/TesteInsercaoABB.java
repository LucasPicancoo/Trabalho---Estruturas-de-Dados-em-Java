package Tests.Arvore;

import Utils.Gerador;
import Utils.Timer;
import Arvore.*;

public class TesteInsercaoABB {

    public static long testeInsercaoABB(Arvore a, int[] valores){

        Timer t = new Timer();

        t.start();
        a.inserir(valores);
        t.stop();

        return t.getTempo();

    }


    public static long mediaInsercaoABB(int[] valores){
        long soma = 0;

        for (int i = 0; i < 5; i++) {
            Arvore atemp = new Arvore();
            soma += testeInsercaoABB(atemp, valores);
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

            System.out.println("\n----- Testes para " + n + " elementos - Árvore Binária de Busca -----");

            System.out.println("Inserção Crescente:   " + mediaInsercaoABB(crescente) + " ns");
            System.out.println("Inserção Decrescente: " + mediaInsercaoABB(decrescente) + " ns");
            System.out.println("Inserção Aleatória:   " + mediaInsercaoABB(aleatorio) + " ns");
        }
    }

}
