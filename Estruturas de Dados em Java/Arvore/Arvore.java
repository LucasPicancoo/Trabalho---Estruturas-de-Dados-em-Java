package Arvore;

public class Arvore {

    private No raiz;

    private boolean isVazia(){
        return raiz == null;
    }

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


}
