package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;

    /*método que será chamado na classe AnimeTeste01 e pedirá como parâmetro
    * as informações necessárias que irão preencher os atributos da classe Anime    */
    public void init(String nome, String tipo, int episodio){
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;


    }
    /*Este método é a sobrecarga do método acima, onde ele possui um parâmetro a mais
    * sendo necessário somente chamar os parametros do método acima e adicionar o parâmetro restante
    *  por esse método, que seria adicionado o this.genero*/
    public void init(String nome, String tipo, int episodio, String genero){
        this.init(nome, tipo, episodio);
        this.genero = genero;


    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
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
