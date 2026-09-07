package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    //Tornando os atributos privados, logo abaixo vamos permitir que sejam acessados de outra maneira
    private String nome;
    private int idade;
    private double[] salario = new double[3];

    /*
    Método que imprime as informações gravadas nos atributos da classe Funcionario
     */
    public void imprimeDados() {
        //váriavel que guarda o valor da soma dos salários
        double soma = 0;
        //váriavel que guardará o valor da média salarial
        double media = 0;
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        //Esse laço de repetição imprime os 3 salários disponiveis no array salario
        for (int i = 0; i < salario.length; i++) {
            System.out.println("Salário: " + salario[i]);

        }
        //Esse for faz a soma dos valores dos salários que estão dentro da array salarios
        //utilizando a váriavel soma para guardar os valores, e posteriormente dividir o valor
        //pela quantidade de salaários guardados dentro da variavel
        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }
        media = soma / salario.length;
        System.out.println("Média salarial: " + media);

    }
    /*Esees set's são o que permite que através da classe FuncionarioTeste01 insiram
    * informações nos atributos do objeto, ou seja, os atributos aqui da classe Funcionario
    * estão privados, por isso essa maneira de realizar a gravação da informação*/
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
    /* Os get's são a forma de buscar a informação dentro dos atributos quando eles estão
    * no modo privado*/
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }
}