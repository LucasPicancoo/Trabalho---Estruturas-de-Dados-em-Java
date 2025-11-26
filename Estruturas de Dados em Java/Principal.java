import Arvore.ArvoreAVL;
import Tests.ArvoreABB.TesteInsercaoABB;
import Tests.ArvoreAVL.TesteInsercaoAVL;
import Tests.Vetor.TesteInsercaoVetor;
import Utils.Timer;
import Vetor.Vetor;
import Utils.Gerador;

public class Principal {

    public static void main(String[] args){

        Gerador g = new Gerador();

        int[] tamanhos = {100, 1000, 10000};

        for (int n : tamanhos) {
            TesteInsercaoVetor.testarTodosOsCenarios(g, n);
            TesteInsercaoABB.testarTodosOsCenarios(g, n);
            TesteInsercaoAVL.testarTodosOsCenarios(g, n);
        }

        // Dúvida: Classe Utilitária de busca na Arvore (Estou utilizando para ABB e AVL a mesma), ou refatorar package arvore inteiro usando classe abstrata?
        // Dúvida: popular arrays para cada teste, ou criar uma classe Record destinada a geração de arrays? (Quando ordenado viciaria o proximo teste pois o vetor ja estaria ordenado)
        // Possivel solução: modificar a cópia do array e não ele em si.
        // Dúvida: Rodar os testes 5 vezes pioram muito os tempos de execução, como melhorar isso?
        // Gerador aleatório (lib Ramdom) não performa bem quando gera 10k de elementos, pois muitos numeros são gerados repetidamente
        // isso afeta os testes porque as estruturas acabam recebendo menos valores distintos do que o esperado.

        // PRINCIPAL DUVIDA: Como realizar os testes de uma forma melhor?

//        TesteInsercaoVetor.testarTodosOsCenarios();
//        TesteInsercaoABB.testarTodosOsCenarios();
//        TesteInsercaoAVL.testarTodosOsCenarios();


    }

}
