package src.br.com.abc.introducao.Strings;

public class ManipulandoStrings {
    public static void main(String[] args) {
        String word = "Manipulando Strings com java";
        System.out.println(word.length()); //verificar a quantidade de caracteres na variavel
        System.out.println(word.toUpperCase()); //para deixar a string em caixa alta
        System.out.println(word.toLowerCase());//para deixar a string em caixa baixa
        System.out.println(word.trim());//para retirar os espacos iniciais e os finais
        System.out.println(word.contains("java"));//ele verifica se tem a palavra que voce colocou na frase
        System.out.println(word.equals("String"));//ele vai verificar se oque voce colocou e a mesma coisa que voce colocou no equals
        System.out.println(word.indexOf("Manipulando"));//ele vai mostrar quando comeca a palavra que voce colocou
        System.out.println(word.lastIndexOf("Strings"));//ele vai mostrar a ultima sentenca da palavra que voce colocou
        System.out.println(word.substring(12)); //ele vai comecar do caracter escolhido por voce
        System.out.println(word + " Ola"); //ele vai concatenar

    }
}
