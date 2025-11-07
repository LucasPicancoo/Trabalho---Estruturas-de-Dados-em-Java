package Utils;
import java.util.Random;
import Vetor.Vetor;

public class Gerador {

    public void gerar100(Vetor v){
        Random r = new Random();
        for(int i = 1; i <= 100; i++){
            int numero = r.nextInt(1000);
            v.inserir(numero);
        }
    }
}
