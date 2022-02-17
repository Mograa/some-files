/* Decompiler 10ms, total 159ms, lines 18 */
package src.br.com.abc.introducao.FlowControl;

public class controlefluxocinco {
   public static void main(String[] args) {
      double valortotal = 40000.0D;

      for(int parcela = 1; (double)parcela <= valortotal; ++parcela) {
         double valorparcela = valortotal / (double)parcela;
         if (valorparcela < 1000.0D) {
            break;
         }

         System.out.println("parcela: " + parcela + " valor da parcela: " + valorparcela);
      }

   }
}
