public class Vetor{
   
   private int[] valores;
   private int tamanho;
   
   //Construtor padrão com tamanho 0
   public Vetor(int capacidade){
      this.valores = new int[capacidade];
      this.tamanho = 0;
   }
   
   //Construtor com o tamanho atual do vetor
   public Vetor(int[] valores, int tamanho){
      this.valores = valores;
      this.tamanho = tamanho;
   }
   
   public int[] getValores(){
      return valores;
   }
   
   
   public int getTamanho(){
      return tamanho;
   }
   
   
}