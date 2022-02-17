/* Decompiler 4ms, total 152ms, lines 25 */
package src.br.com.abc.introducao.FlowControl;

public class controlefluxoquatro {
   public static void main(String[] args) {
      int contador = 0;

      while(contador < 10) {
         ++contador;
         System.out.println(contador);
      }

      do {
         System.out.println("foi executado 1 vez");
      } while(contador < 10);

      for(int i = 0; i < 10; ++i) {
         System.out.println("O valor de i e: " + i);
         if (i == 5) {
            break;
         }
      }

   }
}
