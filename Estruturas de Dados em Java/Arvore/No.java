package Arvore;

public class No {

    private No esquerda;
    private No direita;
    private int  valor;

    public No(){

    }

    public No (int numero){
        this.valor = numero;
        this.esquerda = null;
        this.direita = null;
    }

    public No getEsquerda(){
        return esquerda;
    }

    public void setEsquerda(No esquerda){
        this.esquerda = esquerda;
    }

    public No getDireita(){
        return direita;
    }

    public void setDireita(No direita){
        this.direita = direita;
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int numero){
        this.valor = numero;
    }
}
