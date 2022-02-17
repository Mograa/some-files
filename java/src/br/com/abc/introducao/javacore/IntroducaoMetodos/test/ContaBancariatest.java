package src.br.com.abc.introducao.javacore.IntroducaoMetodos.test;

import src.br.com.abc.introducao.javacore.IntroducaoMetodos.classes.ContaBancaria;

public class ContaBancariatest{
    public static void main(String []args){
        ContaBancaria conta = new ContaBancaria();
        conta.contacorrente = "1224758-8";
        conta.agencia = 2971;
        conta.banco = "Banco do Brasil";
        conta.cidade = "Salvador";
        conta.estado = "BA";

        System.out.println(conta.contacorrente);
        System.out.println(conta.agencia);
        System.out.println(conta.banco);
        System.out.println(conta.cidade);
        System.out.println(conta.estado);
    }
}
