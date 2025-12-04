import Tests.ArvoreABB.TesteBuscaABB;
import Tests.ArvoreABB.TesteInsercaoABB;
import Tests.ArvoreAVL.TesteBuscaAVL;
import Tests.ArvoreAVL.TesteInsercaoAVL;
import Tests.Vetor.*;
import Utils.Gerador;

public class Principal {

    public static void main(String[] args){

        Gerador g = new Gerador();

        int[] tamanhos = {100, 1000, 10000};


//        ---------- // TESTES DE INSERÇÃO // ----------
        for (int n : tamanhos) {
            TesteInsercaoVetor.testarTodosOsCenarios(g, n);
        }

        for (int n : tamanhos) {
            TesteInsercaoABB.testarTodosOsCenarios(g, n);
        }

        for (int n : tamanhos) {
            TesteInsercaoAVL.testarTodosOsCenarios(g, n);
        }


//        ---------- // TESTES DE BUSCA // ----------
        for (int n : tamanhos) {
            int[] valores = g.gerarCrescente(n);
            TesteBuscaSequencialVetor.testarTodosOsCenarios(g, valores);
        }

        for (int n : tamanhos) {
            int[] valores = g.gerarCrescente(n);
            TesteBuscaBinariaVetor.testarTodosOsCenarios(g, valores);
        }

        for (int n : tamanhos) {
            int[] valores = g.gerarCrescente(n);
            TesteBuscaABB.testarTodosOsCenarios(g, valores);
        }

        for (int n : tamanhos) {
            int[] valores = g.gerarCrescente(n);
            TesteBuscaAVL.testarTodosOsCenarios(g, valores);
        }


//        ---------- // TESTES DE ORDENAÇÃO // ----------
        for (int n : tamanhos) {
            int[] valores = g.gerarCrescente(n);
            TesteOrdenacaoSimplesVetor.testarTodosOsCenarios(g, valores);

        }

        for (int n : tamanhos) {
            int[] valores = g.gerarDecrescente(n);
            TesteOrdenacaoSimplesVetor.testarTodosOsCenarios(g, valores);

        }

        for (int n : tamanhos) {
            int[] valores = g.gerarAleatorio(n);
            TesteOrdenacaoSimplesVetor.testarTodosOsCenarios(g, valores);

        }

        for (int n : tamanhos) {
            int[] valores = g.gerarCrescente(n);
            TesteOrdenacaoAvancadaVetor.testarTodosOsCenarios(g, valores);
        }

        for (int n : tamanhos) {
            int[] valores = g.gerarDecrescente(n);
            TesteOrdenacaoAvancadaVetor.testarTodosOsCenarios(g, valores);
        }

        for (int n : tamanhos) {
            int[] valores = g.gerarAleatorio(n);
            TesteOrdenacaoAvancadaVetor.testarTodosOsCenarios(g, valores);
        }


    }

}
