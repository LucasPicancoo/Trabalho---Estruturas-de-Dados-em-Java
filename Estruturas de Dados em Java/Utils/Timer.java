package Utils;

public class Timer {

    private long tempoInicio;
    private long tempoFinal;

    public void start() {
        tempoInicio = System.nanoTime();
    }

    public void stop() {
        tempoFinal = System.nanoTime();
    }

    public long getTempo(){
        return tempoFinal - tempoInicio;
    }

    public void exibirTempo(){
        long nanosegundos = tempoFinal - tempoInicio;

        System.out.println("Tempo: " + nanosegundos + " ns");
    }
}
