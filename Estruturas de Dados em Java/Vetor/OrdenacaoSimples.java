package Vetor;

public class OrdenacaoSimples {

    public static void bubbleSort(Vetor vetor){

        for(int i = 0; i < vetor.getTamanho() -1; i++){
            for(int j = 0; j < vetor.getTamanho() -1 -i; j++){
                if(vetor.getValores()[j] > vetor.getValores()[j+1]){
                    int temp = vetor.getValores()[j];
                    vetor.getValores()[j] = vetor.getValores()[j+1];
                    vetor.getValores()[j+1] = temp;
                }
            }
        }
    }
}