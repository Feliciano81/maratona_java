package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        //Utilização de um método que retorna um double
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(15, 0);
        System.out.println(resultado);

    }
}