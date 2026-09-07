package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    /* Nesta classe vamos ver como utilizar métodos
    para setar informações nos atributos privados da classe Pessoa
    utilizando métodos de Set para inserir informações e Get para
    imprimir a informação dentro do atributo
     */
    private String nome;
    private int idade;

    /*Esse método foi criado somente para imprimir os dados
    * de maneira geral, porém logo abaixo será apresentado o
    * método get que consegue buscar atributos de maneira individual */
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    /*Esse método é utilizado para receber a informação (do atributo nome)
    * lá na classe PessoaTeste01 e atribuir ao atributo privado da classe Pessoa        */
    public void setNome(String nome){
        this.nome = nome;
    }
    //O mesmo que aconteceu no método acima também vale para este
    public void setIdade(int idade){
        this.idade = idade;
    }

    /* Método que será utilizado para puxar a informação disponivel
    *  dentro do atributo nome (que é privado)  */
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
