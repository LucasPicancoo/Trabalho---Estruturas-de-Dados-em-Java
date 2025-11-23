package Utils;
import java.util.Random;
import Interfaces.Inserivel;


public class Gerador {

    public int[] gerarCrescente(int quantidade){
        int[] numeros = new int[quantidade];
        for(int i = 0; i < quantidade; i++){
            numeros[i] = i + 1;
        }

        return numeros;
    }


    public int[] gerarAleatorio(int quantidade){
        Random r = new Random();
        int[] numeros = new int[quantidade];
        for(int i = 0; i < quantidade; i++){
            numeros[i] = r.nextInt(quantidade);
        }

        return numeros;
    }


    public int[] gerarDecrescente(int quantidade){
        int[] numeros = new int[quantidade];
        for(int i = 0; i < quantidade; i++){
            numeros[i] = quantidade - i;
        }
        return numeros;
    }




//    public void gerarDecrescente(Inserivel estrutura, int quantidade){
//        for(int i = quantidade; i >= 1; i--){
//            estrutura.inserir(i);
//        }
//    }


}
