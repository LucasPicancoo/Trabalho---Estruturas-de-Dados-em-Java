package Tests.Vetor;

import Utils.Timer;
import Vetor.*;

public class TesteBuscaVetor {

    public static long testeBuscaSequencial(Vetor v, int numeroBuscado){

        Timer t = new Timer();

        t.start();
        v.buscaSequencial(numeroBuscado);
        t.stop();

        return t.getTempo();
    }


    public static long testeBuscaBinaria(Vetor v, int numeroBuscado){

        Timer t = new Timer();

        t.start();
        v.buscaBinaria(numeroBuscado);
        t.stop();

        return t.getTempo();
    }
}
