package Arvore;

import Interfaces.Inserivel;

public class Arvore implements Inserivel {

    private No raiz;

    private boolean isVazia(){
        return raiz == null;
    }

    @Override
    public void inserir(int valor){

        if(isVazia()){
            raiz = new No(valor);
        }
        else{
            inserir(valor, raiz);
        }
    }

    private void inserir(int valor, No raiz){

        if(valor == raiz.getValor()){
            return;
        }

        if(valor < raiz.getValor()){
            //Se nao existe
            if(raiz.getEsquerda() == null){
                //Cria um novo No passando valor
                No novo = new No(valor);
                //E adiciona
                raiz.setEsquerda(novo);
                System.out.println("Folha: " + novo.getValor() + "A esquerda de: " + raiz.getValor());
            }else{
                // se ja existe, continua buscando a posição para inserir o valor
                inserir(valor, raiz.getEsquerda());
            }
            //direita
        }else{
            if(raiz.getDireita() == null){
                No novo = new No(valor);
                raiz.setDireita(novo);
                System.out.println("Folha: " + novo.getValor() + "A direita de: " + raiz.getValor());
            }else{
                inserir(valor, raiz.getDireita());
            }
        }
    }

    public void emOrdem(){
        emOrdem(raiz);
        System.out.println();
    }

    private void emOrdem(No no){
        if(no != null){
            emOrdem(no.getEsquerda());
            System.out.print(no.getValor() + " ");
            emOrdem(no.getDireita());
        }
    }

    // Pré ordem: Visita o nó atual, percorre a esquerda, percorre a direita (Raiz -> esquerda -> direita)

    //Em ordem: Percorre a esquerda, visita o no atual e percorre a direita (esquerda -> raiz -> direita)

    //Pós ordem: Percorre a esquerda, percorre a direita e visita o no atual (esquerda -> direita -> raiz)




}
