package Utils;

public class Troca {

    public static void troca(int[] valores, int a, int b) {
        int temp = valores[a];
        valores[a] = valores[b]; //inverte b com a
        valores[b] = temp; // seta na variavel
    }

}
