package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.testes;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        /*Nesta linha de baixo temos a criação do objeto estudante a partir da classe Estudante
        Podemos atribuir valores aos atributos do objeto ou a Classe já trazer valores
        definidos na criação da Classe (não é a prática mais recomendada*/
        Estudante estudante = new Estudante();
        /*Nesta linha temos o objeto estudante2 sendo criado a partir da Classe Estudante
        * o que permite que o objeto estudante2 seja modelado de maneira distinta do objeto estudante
        * permitindo criar diveros objeto a partir de uma única classe e edita-los da maneira que desejar*/
        Estudante estudante2 = new Estudante();
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
    }
}
