package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Marcos"; atribuir valor a variavel privada desta forma já não é mais possivel
        pessoa.setNome("Marcos");// Chama-se este método da classe Pessoa, então assim é possivel atribuir o valor
        pessoa.setIdade(25);
        //método que imprime os valores da varieiaveis, sem precisar do get
        pessoa.imprime();

        /* Ambos os get's retornam individualmente os valores atribuidos
        * no atributo nome e idade*/
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
