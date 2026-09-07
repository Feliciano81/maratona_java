package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Julio";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Giovana";
        estudante02.idade = 23;
        estudante02.sexo = 'F';


        /*
        Aqui os dois objetos da classe Estudante imprimem seus valores
        que foram atribuidos logo acima através de um método criado na classe
        Estudante, ou seja, o ponto em comum entre os objetos estudantes01 e 02
        e o método imprime, é que todos eles possuem relação/dependência da classe
        Estudante.
         */
        estudante01.imprime();
        estudante02.imprime();
    }
}
