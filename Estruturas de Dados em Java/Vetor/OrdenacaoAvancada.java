package Vetor;

import static Utils.Troca.troca;

public class OrdenacaoAvancada {

    // tudo a esquerda do Pivo fica apenas "Menor do que ele", nao necessariamente ordenado e tudo a direita do pivo fica "maior do que ele"
    public static void quickSort(Vetor vetor){
        quickSort(vetor.getValores(), 0, vetor.getTamanho() -1);
    }

    private static void quickSort(int[] valores, int inicio, int fim){
        if(inicio < fim){
            int pivo = particionar(valores, inicio, fim);
            quickSort(valores, inicio, pivo-1); // chamada recursiva que ordena os elementos a esquerda do pivô
            quickSort(valores, pivo+1, fim); // ordena o lado direito do pivô
        }
    }

    private static int particionar(int[] valores, int inicio, int fim){
        int pivo = valores[fim]; //define o ultimo elemento como pivo

        int i =  inicio -1; //i começa apontando pro nada, e avança quando o j acha um valor maior que o pivo

        // se o elemento autual é menor que o pivo ele vai pertencer a esquerda
        for(int j = inicio; j < fim; j++){
            if(valores[j] < pivo){
                i++;
                troca(valores, i, j); //chama o metodo de troca para inverter o valor, o maior vai para a direita e o menor para a esquerda
            }
        }

        troca(valores, i+1, fim); // corrige a posição do pivo
        return i +1; //retorno da posição final do pivo
    }

}
