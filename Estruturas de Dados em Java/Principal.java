import Vetor.Vetor;
import Utils.Gerador;
import Arvore.Arvore;
import Vetor.OrdenacaoSimples;

public class Principal {

    public static void main(String[] args){

        Vetor v = new Vetor(100);
        Gerador g = new Gerador();

        g.gerar100(v);
        OrdenacaoSimples.bubbleSort(v);
        v.imprimirVetor();
        System.out.println("\nNumero buscado: " + v.buscaSequencial(50));
        System.out.println("\nBusca binaria: " + v.buscaBinaria(50));

        Arvore a = new Arvore();

       // g.gerar100(a);
        

        a.emOrdem();
    }

}
