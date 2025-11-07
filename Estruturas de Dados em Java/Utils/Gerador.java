package Utils;
import java.util.Random;
import Vetor.Vetor;

public class Gerador {

    public void gerar100(Vetor v){
        Random r = new Random();
        for(int i = 1; i <= 100; i++){
            int numero = r.nextInt(100);
            v.inserir(numero);
        }
    }

    public void gerar1000(Vetor v){
        Random r = new Random();
        for(int i = 1; i <= 1000; i++){
            int numero = r.nextInt(1000);
            v.inserir(numero);
        }
    }

    public void gerar10000(Vetor v){
        Random r = new Random();
        for(int i = 1; i <= 10000; i++){
            int numero = r.nextInt(10000);
            v.inserir(numero);
        }
    }
}
