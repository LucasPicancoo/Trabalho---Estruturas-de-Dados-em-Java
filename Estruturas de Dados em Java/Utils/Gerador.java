package Utils;
import java.util.Random;
import Vetor.Vetor;
import Arvore.Arvore;
import Interfaces.Inserivel;

public class Gerador {

    public void gerar100(Inserivel estrutura){
        Random r = new Random();
        for(int i = 1; i <= 100; i++){
            int numero = r.nextInt(100);
            estrutura.inserir(numero);
        }
    }

    public void gerar1000(Inserivel estrutura){
        Random r = new Random();
        for(int i = 1; i <= 1000; i++){
            int numero = r.nextInt(1000);
            estrutura.inserir(numero);
        }
    }

    public void gerar10000(Inserivel estrutura){
        Random r = new Random();
        for(int i = 1; i <= 10000; i++){
            int numero = r.nextInt(10000);
            estrutura.inserir(numero);
        }
    }
}
