package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        /* Este método imprime o nome do jogador e consulta se o
        *  atributo time foi preenchido com alguma informação, através
        * do IF, se houver informação, imprime essa informação que está
        * disponível na atributo time*/
        System.out.println("Jogador: " + this.nome);
        if(time != null){
            System.out.println("Clube: " + time.getNome());
        }
    }
    public Jogador(String nome){
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
