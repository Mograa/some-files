/* Decompiler 2ms, total 149ms, lines 16 */
package src.br.com.abc.introducao.Arrays;

public class Arrays3 {
   public static void main(String[] args) {
      int[] numero = new int[]{0, 1, 2, 3, 4};
      int[] numeros = numero;
      int numtam = numero.length;

      for(int i = 0; i < numtam; ++i) {
         int aux = numeros[i];
         System.out.println(aux);
      }

   }
}
