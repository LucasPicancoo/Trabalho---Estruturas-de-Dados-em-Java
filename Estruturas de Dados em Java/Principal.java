import Vetor.Vetor;
import Utils.Gerador;
import Arvore.Arvore;

public class Principal {

    public static void main(String[] args){

        Vetor v = new Vetor(100);
        Gerador g = new Gerador();

        g.gerar100(v);
        v.imprimirVetor();
        System.out.println("\nNumero buscado: " + v.buscaSequencial(50));
        System.out.println("\nBusca binaria: " + v.buscaBinaria(50));

        Arvore a = new Arvore();

       // g.gerar100(a);
       
       a.inserir(10);
       a.inserir(40);
       a.inserir(20);
       a.inserir(5);
       a.inserir(8);
       a.inserir(15);
       a.inserir(16);
        

        a.emOrdem();
    }

}
