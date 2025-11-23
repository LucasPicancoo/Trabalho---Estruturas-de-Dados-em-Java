package Utils;
import java.util.Random;
import Interfaces.Inserivel;


public class Gerador {

    public void gerarCrescente(Inserivel estrutura, int quantidade){
        for(int i = 1; i <= quantidade; i++){
            estrutura.inserir(i);
        }
    }


    public void gerarAleatorio(Inserivel estrutura, int quantidade){
        Random r = new Random();
        for(int i = 1; i <= quantidade; i++){
            int numero = r.nextInt(quantidade);
            estrutura.inserir(numero);
        }
    }


    public void gerarDecrescente(Inserivel estrutura, int quantidade){
        for(int i = quantidade; i >= 1; i--){
            estrutura.inserir(i);
        }
    }


}
