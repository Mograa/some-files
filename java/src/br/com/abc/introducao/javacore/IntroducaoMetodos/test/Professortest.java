package src.br.com.abc.introducao.javacore.IntroducaoMetodos.test;

import src.br.com.abc.introducao.javacore.IntroducaoMetodos.classes.Professor;

public class Professortest {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.cpf = "306.974.530-06";
        prof1.nome = "Joao Almeida de Alencar";
        prof1.rg = "13.873.338-7";

        Professor prof2 = new Professor();
        prof2.cpf = "304.974.4356";
        prof2.nome = "Joao Almeida";
        prof2.rg = "13.873435";

        prof1.imprime();
        prof2.imprime();

    }
}
