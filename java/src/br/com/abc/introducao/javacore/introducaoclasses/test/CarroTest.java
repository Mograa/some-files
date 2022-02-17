package src.br.com.abc.introducao.javacore.introducaoclasses.test;

import src.br.com.abc.introducao.javacore.introducaoclasses.Classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.cor = "vermelho";
        carro.modelo = "2019";
        carro.placa = "LO12393";
        carro.preco = 29310;

        System.out.println(carro.cor);
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.preco);
    }
}
