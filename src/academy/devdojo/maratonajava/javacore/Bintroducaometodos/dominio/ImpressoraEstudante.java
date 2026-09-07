package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    /*criando método dentro de uma classe que será utilizado
    para ser reutilizado por objetos de outras classes para
    imprimir nome, idade e sexo (no caso desse exemplo), mas pode
    servir para diversas funções. No caso deste método, é criado
    um objeto 'estudante' a partir da classe Estudante para que ele faça referência
    a outros objetos e possa somente imprimir as informações que vêm
    do outro objeto.
     */
    public void imprime(Estudante estudante) {
        System.out.println("------------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
