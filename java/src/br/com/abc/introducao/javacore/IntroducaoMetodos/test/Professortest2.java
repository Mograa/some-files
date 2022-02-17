package src.br.com.abc.introducao.javacore.IntroducaoMetodos.test;
import src.br.com.abc.introducao.javacore.IntroducaoMetodos.classes.Professor2;

public class Professortest2 {
    public static void main(String[] args) {
        //Professores
        Professor2 prof = new Professor2();
        prof.nome = "Pedro Almeida";
        prof.cpf = "234.233.23-9";
        prof.rg = "2332.4234-2";

        Professor2 prof2 = new Professor2();
        prof2.nome = "Maria Lucia Alcantara";
        prof2.cpf = "213.225.13-0";
        prof2.rg = "3244.2134-5";

        //imprimindo
        prof.imprime();
        prof2.imprime();
    }
}
