package Arvore;

import Utils.BuscarValorArvore;

public class ArvoreAVL {

    private No raiz;
    private RotacoesAVL rotacoes = new RotacoesAVL();

    public No getRaiz() {
        return raiz;
    }

    public void inserir(int[] valores) {
        for (int v : valores) {
            inserir(v);
        }
    }

    private void inserir(int valor) {
        raiz = inserirAVL(raiz, valor);
    }

    private No inserirAVL(No atual, int valor) {

        if(atual == null){
            No novo = new No(valor);
            return novo;
        }

        if(valor < atual.getValor()){
            //Se nao existe
            if(atual.getEsquerda() == null){
                //Cria um novo No passando valor
                No novo = new No(valor);
                //E adiciona
                atual.setEsquerda(novo);
            }else{
                // se ja existe, continua buscando a posição para inserir o valor
                atual.setEsquerda(inserirAVL(atual.getEsquerda(), valor));
            }
        }else if(valor > atual.getValor()){

            if(atual.getDireita() == null){
                No novo = new No(valor);
                atual.setDireita(novo);
            }else{
                atual.setDireita(inserirAVL(atual.getDireita(), valor));
            }
        }

        else{
            return atual;
        }
        // depois de inserir faz o balanceamento do nó atual
        return rotacoes.balancear(atual);
    }

    public No buscar(int valor){
        return BuscarValorArvore.buscar(valor, raiz);
    }

}
