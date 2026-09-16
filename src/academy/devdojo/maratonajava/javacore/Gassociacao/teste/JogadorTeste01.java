package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romárinho");
        Jogador jogador2 = new Jogador("Gil");
        Jogador jogador3 = new Jogador("Bruno Henrrique");
        //Criando um array que guarda cada objeto criado
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (int i = 0; i < jogadores.length; i++){
            System.out.println(jogadores[i].getNome());
        }
    }
}
