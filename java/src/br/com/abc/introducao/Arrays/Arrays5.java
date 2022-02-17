/* Decompiler 5ms, total 156ms, lines 27 */
package src.br.com.abc.introducao.Arrays;

public class Arrays5 {
   public static void main(String[] args) {
      int[][] dias = new int[2][2];
      dias[0][0] = 30;
      dias[0][1] = 20;
      dias[1][0] = 15;
      dias[1][1] = 10;

      for(int i = 0;i<dias.length;i++){
         for(int j = 0;j<dias[i].length;j++){
            System.out.println(dias[i][j]);
         }
      }
   }
}

