package Vetor;

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
}