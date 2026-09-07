package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        /* Aqui estamos inserindo valores nos atributos privados da classe Anime
        anime.setNome("Dragon Ball Z");
        anime.setTipo("Televisionado");
        anime.setEpisodio(50);*/
        anime.init("Dragon Ball Z", "Televisionado", 45, "Ação/Drama");
        anime.imprime();
    }
}
