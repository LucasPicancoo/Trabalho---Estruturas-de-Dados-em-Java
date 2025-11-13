package Vetor;

public class Vetor{

    private int[] valores;
    private int tamanho;

    //Construtor padrão com tamanho 0
    public Vetor(int capacidade){
        this.valores = new int[capacidade];
        this.tamanho = 0;
    }

    //Construtor com o tamanho atual do vetor
    public Vetor(int[] valores, int tamanho){
        this.valores = valores;
        this.tamanho = tamanho;
    }

    public int[] getValores(){
        return valores;
    }


    public int getTamanho(){
        return tamanho;
    }



    public void inserir(int valor){

        if(tamanho < valores.length){
            valores[tamanho] = valor;
            tamanho ++;
        }else{
            //Exception?
            System.out.println("Erro");
        }
    }

    //Percorrer até encontrar o valor...
    public int buscaSequencial(int valor){

        for(int i = 0; i < tamanho; i++){
            if(valores[i] == valor){
                return i;
            }
        }
        return -1;
    }

    //Busca binária parte o array no meio e verifica se o valor do meio bate com o buscado
    //se sim imprime.
    //Se o valor buscado for menor do que o valor do meio, ignora o resto do array com valores maiores ou vice-versa. Obs: vetor precisa estar ordenado.

    public int buscaBinaria(int valor){
        return buscaBinaria(valor, 0, tamanho -1);
    }

    private int buscaBinaria(int valor, int inicio, int fim){

        if(inicio > fim){
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if(valores[meio] == valor){
            return meio;
        }else if(valores[meio] > valor){
            return buscaBinaria(valor, inicio, meio -1);
        }else{
            return buscaBinaria(valor, meio + 1, fim);
        }
    }

    public void imprimirVetor(){
        for(int i = 0; i < tamanho; i++){
            System.out.print(valores[i] + ",");
        }
    }

}
