import Tests.Arvore.TesteInsercaoABB;
import Tests.Vetor.TesteBuscaVetor;
import Tests.Vetor.TesteInsercaoVetor;
import Tests.Vetor.TesteOrdenacaoVetor;
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

        TesteInsercaoVetor.testarTodosOsCenarios();
        TesteInsercaoABB.testarTodosOsCenarios();


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
