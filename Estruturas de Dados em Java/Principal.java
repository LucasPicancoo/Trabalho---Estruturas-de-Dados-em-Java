import Vetor.Vetor;
import Utils.Gerador;
import Arvore.Arvore;
import Arvore.ArvoreAVL;
import Vetor.OrdenacaoSimples;
import Vetor.OrdenacaoAvancada;

public class Principal {

    public static void main(String[] args){

        Vetor v = new Vetor(100);
        Gerador g = new Gerador();

        //g.gerar100(v);
        //OrdenacaoSimples.bubbleSort(v);
        //OrdenacaoSimples.insertionSort(v);
        //OrdenacaoSimples.selectionSort(v);
        //OrdenacaoAvancada.quickSort(v);
        //v.imprimirVetor();
        //System.out.println("\nNumero buscado: " + v.buscaSequencial(50));
        //System.out.println("\nBusca binaria: " + v.buscaBinaria(50));

        Arvore a = new Arvore();
        ArvoreAVL avl = new ArvoreAVL();

        g.gerarAleatorio(avl, 100);
        g.gerarAleatorio(a, 1000);

        System.out.println("AVL: " + avl.buscar(15));
        System.out.println("binaria: " + a.buscar(1));

        //System.out.println("Valor buscado: " + a.buscar(1));
        

        //a.emOrdem();
    }

}
