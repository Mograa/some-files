/* Decompiler 3ms, total 150ms, lines 20 */
package src.br.com.abc.introducao.FlowControl;

public class tabelaimpostoexe {
   public static void main(String[] args) {
      double salario = 1100.0D;
      double totalinposto = 0.0D;
      if (salario >= 1000.0D) {
         if (salario >= 1000.0D && salario < 2000.0D) {
            totalinposto = salario * 5.0D / 100.0D;
         } else if (salario >= 2000.0D && salario < 4000.0D) {
            totalinposto = salario * 10.0D / 100.0D;
         } else {
            totalinposto = salario * 20.0D / 100.0D;
         }
      }

      System.out.println(totalinposto);
   }
}
