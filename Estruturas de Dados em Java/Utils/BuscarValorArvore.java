package Utils;

import Arvore.No;

public class BuscarValorArvore {

    //classe temporária, perguntar ao Flávio se é melhor essa classe utilitária, ou mudar arvore para classe abstrata.

    public static No buscar(int valor, No no){

        if(no == null){
            return null;
        }

        if(valor == no.getValor()){
            return no;
        }

        // se o valor for menor, busca na esquerda
        if(valor < no.getValor()){
            return buscar(valor, no.getEsquerda());
            // se for maior busca na direita
        }else{
            return buscar(valor, no.getDireita());
        }
    }

}
