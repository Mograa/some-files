package src.br.com.abc.introducao.javacore.introducaoclasses.test;

import src.br.com.abc.introducao.javacore.introducaoclasses.Classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Joao Almeida de Alencar";
        prof.cpf = "306.974.530-06";
        prof.rg = "13.873.338-7";

        Professor prof2 = new Professor();
        prof2.nome = "Mateus Machado de Jesus";
        prof2.cpf = "366.756.978-09";
        prof2.rg = "16.463.738-9";

        System.out.println(prof.nome);
        System.out.println(prof.cpf);
        System.out.println(prof.rg);
        System.out.println("--------------------");
        System.out.println(prof2.nome);
        System.out.println(prof2.cpf);
        System.out.println(prof2.rg);

    }
}
