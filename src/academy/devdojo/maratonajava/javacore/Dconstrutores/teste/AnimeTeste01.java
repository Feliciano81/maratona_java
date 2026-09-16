package academy.devdojo.maratonajava.javacore.Dconstrutores.teste;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        /*Construtor que cria o objeto com os valores já setados por padrão*/
        Anime anime = new Anime("Dragon Ball Z","Televisionado", 45, "Ação/Drama", "Editora Mauricio");
        anime.imprime();
    }
}
