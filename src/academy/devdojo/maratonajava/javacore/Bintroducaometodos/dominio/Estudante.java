package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    /*
    Criando um método dentro desta classe Estudante, pois quando criar
    objetos a partir da classe Estudante, poderemos utilizar esse método
    para imprimir os dados que foram atribuidos aos objetos originários da
    classe Estudante.
     */
    public void imprime() {
        System.out.println("===================");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
