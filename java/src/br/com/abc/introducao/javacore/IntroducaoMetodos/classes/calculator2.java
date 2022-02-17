package src.br.com.abc.introducao.javacore.IntroducaoMetodos.classes;

public class calculator2 {
    public void calculaDoisNumeros(double num1, double num2){
        if(num2!=0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Nao se pode dividir por 0");
    }
}
