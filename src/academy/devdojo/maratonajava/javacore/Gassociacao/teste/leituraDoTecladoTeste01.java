package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class leituraDoTecladoTeste01 {
    public static void main(String[] args) {
        //Classe que utilizamos para entrada de dados via teclado
        //Estude mais sobre os métodos desta classe posteriormente
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = entrada.next();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite seu gênero: ");
        char genero = entrada.next().charAt(0);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero);
    }

}
