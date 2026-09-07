package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        /* Mesmo as variaveis A e B sendo alteradas pelo método
        ainda possuirão o mesmo valor após a execução do método*/
        calculadora.alterarDoisNumeros(a,b);

        System.out.println("Após a execução do método alterarDoisNumeros: ");
        System.out.println("A: "+ a);
        System.out.println("B: "+b);

    }
}
