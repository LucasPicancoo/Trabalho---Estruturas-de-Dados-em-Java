package Tests.Vetor;

import Utils.Timer;
import Vetor.*;

public class TesteOrdenacao {


    public static long testeBubbleSort(Vetor v){

        Timer timer = new Timer();

        timer.start();
        OrdenacaoSimples.bubbleSort(v);
        timer.stop();

        return timer.getTempo();
    }


    public static long testeInsertionSort(Vetor v){

        Timer t = new Timer();

        t.start();
        OrdenacaoSimples.insertionSort(v);
        t.stop();

        return t.getTempo();
    }


    public static long testeSelectionSort(Vetor v){

        Timer t = new Timer();

        t.start();
        OrdenacaoSimples.selectionSort(v);
        t.stop();

        return t.getTempo();
    }


    public static long testeQuickSort(Vetor v){

        Timer t = new Timer();

        t.start();
        OrdenacaoAvancada.quickSort(v);
        t.stop();

        return t.getTempo();
    }
}
