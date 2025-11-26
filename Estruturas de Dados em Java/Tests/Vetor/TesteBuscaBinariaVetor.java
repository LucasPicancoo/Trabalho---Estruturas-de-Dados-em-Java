package Tests.Vetor;

import Utils.Timer;
import Vetor.Vetor;

public class TesteBuscaBinariaVetor {

    public static long testeBuscaBinaria(Vetor v, int numeroBuscado){

        Timer t = new Timer();

        t.start();
        v.buscaBinaria(numeroBuscado);
        t.stop();

        return t.getTempo();
    }
}
