package Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Gerador {

    public int[] gerarCrescente(int quantidade){
        int[] numeros = new int[quantidade];
        for(int i = 0; i < quantidade; i++){
            numeros[i] = i + 1;
        }

        return numeros;
    }


//    public int[] gerarAleatorio(int quantidade){
//        Random r = new Random();
//        int[] numeros = new int[quantidade];
//        for(int i = 0; i < quantidade; i++){
//            numeros[i] = r.nextInt(quantidade);
//        }
//
//        return numeros;
//    }

    public int[] gerarAleatorio(int quantidade){
        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i < quantidade; i++){
            lista.add(i);
        }
        Collections.shuffle(lista);

        int[] vetor = new int[quantidade];
        for(int i = 0; i < quantidade; i++){
            vetor[i] = lista.get(i);
        }
        return vetor;
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
