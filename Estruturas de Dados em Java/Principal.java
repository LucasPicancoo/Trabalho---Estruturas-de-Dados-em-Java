import Arvore.ArvoreAVL;
import Tests.ArvoreABB.TesteInsercaoABB;
import Tests.ArvoreAVL.TesteInsercaoAVL;
import Tests.Vetor.TesteInsercaoVetor;
import Utils.Timer;
import Vetor.Vetor;
import Utils.Gerador;

public class Principal {

    public static void main(String[] args){

        Vetor v = new Vetor(100);
        Gerador g = new Gerador();
        int[] crescente100 = g.gerarCrescente(100);
        int[] decrescente100 = g.gerarDecrescente(100);
        int[] aleatorio100 = g.gerarAleatorio(100);

//        System.out.println("Tempo médio inserção (Crescente): " + TesteInsercao.mediaInsercaoVetor(crescente100) + " ns");
//        System.out.println("Tempo médio inserção (Decrescente): " + TesteInsercao.mediaInsercaoVetor(decrescente100) + " ns");
//        System.out.println("Tempo médio inserção (Aleatório): " + TesteInsercao.mediaInsercaoVetor(aleatorio100) + " ns");

        // Dúvida: Classe Utilitária de busca na Arvore (Estou utilizando para ABB e AVL a mesma), ou refatorar package arvore inteiro usando classe abstrata?
        // Dúvida: popular arrays para cada teste, ou criar uma classe Record destinada a geração de arrays? (Quando ordenado viciaria o proximo teste pois o vetor ja estaria ordenado)
        // Possivel solução: modificar a cópia do array e não ele em si.
        // Dúvida: Rodar os testes 5 vezes pioram muito os tempos de execução, como melhorar isso?
        // Gerador aleatório (lib Ramdom) não performa bem quando gera 10k de elementos, pois muitos numeros são gerados repetidamente
        // isso afeta os testes porque as estruturas acabam recebendo menos valores distintos do que o esperado.

        // PRINCIPAL DUVIDA: Como realizar os testes de uma forma melhor?

        TesteInsercaoVetor.testarTodosOsCenarios();
        TesteInsercaoABB.testarTodosOsCenarios();
        TesteInsercaoAVL.testarTodosOsCenarios();



//        long ord = TesteOrdenacaoVetor.testeBubbleSort(v);
//        System.out.println("Tempo BubbleSort: " + ord + " ns");
//
//        long busca = TesteBuscaVetor.testeBuscaBinaria(v, 50);
//        System.out.println("Tempo Busca Binaria: " + busca + " ns");

        //g.gerar100(v);
        //OrdenacaoSimples.bubbleSort(v);
        //OrdenacaoSimples.insertionSort(v);
        //OrdenacaoSimples.selectionSort(v);
        //OrdenacaoAvancada.quickSort(v);
        //v.imprimirVetor();
        //System.out.println("\nNumero buscado: " + v.buscaSequencial(50));
        //System.out.println("\nBusca binaria: " + v.buscaBinaria(50));

//        Arvore a = new Arvore();
//        ArvoreAVL avl = new ArvoreAVL();
//        Timer t = new Timer();
//
//        //g.gerarAleatorio(avl, 100);
//        //g.gerarAleatorio(a, 1000);
//
//        int[] nums = g.gerarAleatorio(100);
//
//        t.start();
//        avl.inserir(nums);
//        t.stop();
//
//        v.inserir(nums);
//
//        a.inserir(nums);
//
//        t.exibirTempo();
//        System.out.println("AVL: " + avl.buscar(15));
//
//        System.out.println("binaria: " + a.buscar(1));

        //System.out.println("Valor buscado: " + a.buscar(1));
        

        //a.emOrdem();
    }

}
