/* Decompiler 2ms, total 176ms, lines 15 */
package src.br.com.abc.introducao.FlowControl;

public class exerciciocontrolefluxoquatro {
   public static void main(String[] args) {
      int valor = 100;

      for(int numeropar = 0; numeropar <= valor; numeropar += 2) {
         if (numeropar % 2 == 0) {
            System.out.println(numeropar);
         }
      }

   }
}
