package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        /*Criamos dois objetos de professores, atribuimos seus nomes, a classe Professor
        * possui construtores que exigem que passe um nome para o objeto dos professores 1 e 2*/
        Professor professor1 = new Professor("Prof.º Eduardo");
        Professor professor2 = new Professor("Prof.ª Clarisse");
        /*Aqui chamados o atributo da classe Escola, que chama a classe Professor e
        * cria um objeto do tipo array para guardar os valores de nome dos objetos professores 1 e 2 */
        Professor[] professores = {professor1, professor2};
        /*Então criamos o objeto de escola, que possui o construtor que pede o nome da escola
        * e o parâmetro de array que é a lista dos professores */
        Escola escola = new Escola("Escola Estadual de Hortolândia", professores);
        /*Dessa maneira exibimos a informação através do método imprime que está
        *disponível na classe Escola e pode ser consultado de como funciona, caso surja dúvidas*/
        escola.imprime();
    }
}
