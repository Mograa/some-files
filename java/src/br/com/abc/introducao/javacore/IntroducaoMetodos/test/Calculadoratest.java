package src.br.com.abc.introducao.javacore.IntroducaoMetodos.test;

import src.br.com.abc.introducao.javacore.IntroducaoMetodos.classes.Calculadora;

public class Calculadoratest {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicDoisNumeros(10, 2);
        // 1 METODO - System.out.println(calc.divideDoisNumeros(10, 2));
        // 2 METODO - double result = calc.divideDoisNumeros(10, 2);
        //System.out.println(result);
        double result = calc.divideDoisNumeros(10, 0);
        System.out.println(result);
        
        calc.imprimeDoisNumerosDivididos(10, 2);
        System.out.println("continua executando");
    }
}    

