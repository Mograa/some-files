package src.br.com.abc.introducao.javacore.IntroducaoMetodos.classes;

public class Professor {
    public String nome;
    public String rg;
    public String cpf;

    public void imprime(){
        System.out.println("---------------------");
        System.out.println(this.cpf);
        System.out.println(this.nome);
        System.out.println(this.rg);
    }
}
