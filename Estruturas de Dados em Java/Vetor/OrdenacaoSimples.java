package Vetor;

import static Utils.Troca.troca;

public class OrdenacaoSimples {

    public static void bubbleSort(Vetor vetor){

        for(int i = 0; i < vetor.getTamanho() -1; i++){
            for(int j = 0; j < vetor.getTamanho() -1 -i; j++){
                //Quando o elemento atual for maior que o proximo vai trocar de posição
                if(vetor.getValores()[j] > vetor.getValores()[j+1]){
                    int temp = vetor.getValores()[j];
                    vetor.getValores()[j] = vetor.getValores()[j+1];
                    vetor.getValores()[j+1] = temp;
                }
            }
        }
    }

//    Os outros métodos de ordenação seriam um "A mais" para o meu trabalho, mas devido ao curto tempo não irei conseguir documenta-los... pelo menos me serviu de estudo.
    public static void insertionSort(Vetor vetor){

        // Vai começar sempre pelo segundo elemento do vetor, pois na teoria o "primeiro ja está ordenado"...
        for(int i = 1; i < vetor.getTamanho(); i++){
            int atual = vetor.getValores()[i];
            int j = i-1;

            //Move os elementos maiores que "atual" uma posição a frente
            while(j >= 0 && vetor.getValores()[j] > atual){
                vetor.getValores()[j+1] = vetor.getValores()[j];
                j--;
            }
            //Pra aqui inserir o valor na posição correta
            vetor.getValores()[j + 1] = atual;
        }
    }

    public static void selectionSort(Vetor vetor){
        for(int i = 0; i < vetor.getTamanho() -1; i++){
            int menorIndice = i; //o Menor elemento é o atual
            //Busca o menor valor no vetor
            for(int j = i +1; j < vetor.getTamanho(); j++){
                if(vetor.getValores()[j] < vetor.getValores()[menorIndice]){
                    menorIndice = j;//Atualiza o indice do menor elemento
                }
            }
            //chama o método para trocar o menor elemento encontrado com o da posição atual
            troca(vetor.getValores(), i, menorIndice);
        }
    }


}