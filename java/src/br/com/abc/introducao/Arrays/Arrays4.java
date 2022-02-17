/* Decompiler 8ms, total 206ms, lines 16 */
package src.br.com.abc.introducao.Arrays;

public class Arrays4 {
   public static void main(String[] args) {
      String[] nomes = new String[]{"Maria", "Pedro", "Joao", "Jose"};
      String[] var2 = nomes;
      int var3 = nomes.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String nome = var2[var4];
         System.out.println(nome);
      }

   }
}
