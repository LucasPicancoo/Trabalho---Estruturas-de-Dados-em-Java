package Tests;

import Vetor.Vetor;

public class warmupJVM {

    public static void warmupJVM() {
        int[] dummy = {1, 2, 3, 4, 5};

        for (int i = 0; i < 50000; i++) {
            Vetor v = new Vetor(dummy.length);
            v.inserir(dummy);
        }
    }

}
