package Arvore;

public class RotacoesAVL {

    //Obs: Faltam implementar os metodos de busca e inserção...

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
        //retorno do no ja balanceado
        return no;
    }

    private int altura(No no){
        if(no == null){
            return -1;
        }
            // Altura = 1 + maior altura entre esquerda e direita
            return 1+ Math.max(altura(no.getEsquerda()), altura(no.getDireita()));
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

        return y;
    }

    private No rotacaoDireita(No x){
        No y = x.getEsquerda();
        No z = y.getDireita();

        y.setDireita(x);
        x.setEsquerda(z);

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
