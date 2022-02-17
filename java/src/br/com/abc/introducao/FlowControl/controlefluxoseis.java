/* Decompiler 3ms, total 167ms, lines 16 */
package src.br.com.abc.introducao.FlowControl;

public class controlefluxoseis {
   public static void main(String[] args) {
      double valortotal = 40000.0D;

      for(int parcela = (int)valortotal; parcela >= 1; --parcela) {
         double valorparcela = valortotal / (double)parcela;
         if (valorparcela > 1000.0D) {
            System.out.println("parcela: " + parcela + " valor da parcela: " + valorparcela);
         }
      }

   }
}
