package Arvore;

import Utils.BuscarValorArvore;

public class ArvoreAVL {

    private No raiz;

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
        return balancear(atual);
    }

    public No buscar(int valor){
        return BuscarValorArvore.buscar(valor, raiz);
    }


    public No balancear(No no){

        if(no == null){
            return null;
        }

        int balanceamento = calcularBalanceamento(no);

        //caso esteja desbalanceado para a direita
        if(balanceamento > 1){
            //verificação se a subarvore da direita está "pesada"
            if(calcularBalanceamento(no.getDireita()) >= 0){
                //Rotação a esquerda simples
                no = rotacaoEsquerda(no);
            }else{
                //rotaÇão dupla direita-esquerda
                no = rotacaoDireitaEsquerda(no);
            }
            //caso esteja desbalanceado para a esquerda
        }else if(balanceamento < -1){
            //verificação se a subarvore da esquerda está "pesada"
            if(calcularBalanceamento(no.getEsquerda()) <= 0){
                //Rotacao simples a direita
                no = rotacaoDireita(no);
            }else{
                // rotação dupla esquerda-direita
                no = rotacaoEsquerdaDireita(no);
            }
        }

        no.setAltura(1 + Math.max(altura(no.getEsquerda()), altura(no.getDireita())));

        //retorno do no ja balanceado
        return no;
    }

    private int altura(No no){
        if(no == null){
            return -1;
        }
        return no.getAltura();
    }

    private int calcularBalanceamento(No no){
        if(no == null){
            return 0;
        }
        return altura(no.getDireita()) - altura(no.getEsquerda());
    }

    private No rotacaoEsquerda(No x){
        No y = x.getDireita(); // filho da direita
        No z = y.getEsquerda(); // subárvore que mudará de lado

        y.setEsquerda(x);
        x.setDireita(z);

        x.setAltura(1 + Math.max(altura(x.getEsquerda()), altura(x.getDireita())));
        y.setAltura(1 + Math.max(altura(y.getEsquerda()), altura(y.getDireita())));

        return y;
    }

    private No rotacaoDireita(No x){
        No y = x.getEsquerda();
        No z = y.getDireita();

        y.setDireita(x);
        x.setEsquerda(z);

        x.setAltura(1 + Math.max(altura(x.getEsquerda()), altura(x.getDireita())));
        y.setAltura(1 + Math.max(altura(y.getEsquerda()), altura(y.getDireita())));

        return y;
    }

    private No rotacaoEsquerdaDireita(No no){
        no.setEsquerda(rotacaoEsquerda(no.getEsquerda()));
        return rotacaoDireita(no);
    }

    private No rotacaoDireitaEsquerda(No no){
        no.setDireita(rotacaoDireita(no.getDireita()));
        return rotacaoEsquerda(no);
    }

}
