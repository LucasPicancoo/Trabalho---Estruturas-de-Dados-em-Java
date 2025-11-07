import Vetor.Vetor;
import Utils.Gerador;

public class Principal {

    public static void main(String[] args){

        Vetor v = new Vetor(100);
        Gerador g = new Gerador();

        g.gerar100(v);
        v.imprimirVetor();
        System.out.println("\nNumero buscado: " + v.buscaSequencial(50));
        System.out.println("\nBusca binaria: " + v.buscaBinaria(50));
    }

}
