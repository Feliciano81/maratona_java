package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

// Explicação básica de blocos de inicialização, se persistir a dúvida consulte outras fontes!!!
// 0 - Bloco de inicialização é executado quando a JVM carregar a classe
// 1 - Alocado espaço em memória pra objeto
// 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
// 3 - Bloco de inicialização é executado
// 4 - Construtor é executado
public class Anime {
    private String nome;
    private static int[] episodios;

    /*Esse é um bloco de inicialização, utilizado para carregar/inicializaçar
    informações sem a necessidade de passar por um construtor, no caso deste bloco, ele
    é um bloco de inicialização estático, ele é executado apenas uma vez quando a classe é
     carregada pela JVM, isso acontece antes de qualquer coisa, antes até mesmo do espaço ser alocado
      em memória para os objetos*/
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        //Com o for nessa configuração, iniciamos o primeiro ponto da lista com o número 1 ao invés do 0
        /*for (int i = 0; i < episodios.length; i++) {
            episodios[i] += i + 1;
            System.out.print(episodios[i] + " ");
        }*/
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    //Inicialização do construtor
    public Anime() {
        //setando a lista episodios com 100 pontos de memória
        episodios = new int[100];
        //Com o for nessa configuração, iniciamos o primeiro ponto da lista com o número 1 ao invés do 0
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] += i + 1;
            System.out.print(episodios[i] + " ");
        }
        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}