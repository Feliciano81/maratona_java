package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String estudio;

    /*Esse é o construtor que obriga você criar um objeto já com esse
     * atributos setados por padrão*/
    public Anime(String nome, String tipo, int episodio, String genero) {
        //Esse this faz a chamada de outro construtor, que fará a sobrecarga
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;

    }
    /* Esse construtor possui 5 parametros, ou seja, tem a possibilidade de utilizar
    * o construtor com 4 parametros, com 5 e o que não tem nenhum parâmetro*/
    public Anime(String nome, String tipo, int episodio, String genero, String estudio) {
        //Esse this faz a chamada de outro construtor, que fará a sobrecarga
        this(nome, tipo, episodio, genero);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.estudio);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }
}
