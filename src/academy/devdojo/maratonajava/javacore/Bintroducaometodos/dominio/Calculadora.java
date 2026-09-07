package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/*Nesta classe estudamos diferentes maneiras de se criar métodos
e suas formas de execução e validação, o intuito é demonstrar que existem
diferentes maneiras de fazer um método, pode variar com a experiência e tempo
que o desenvolvedor já programa e vai buscando cada vez mais otimizar
suas linhas de código
 */
public class Calculadora {
    //criação de uma método de soma de dois números
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 2);
    }

    //Criando um método que recebe parâmetros
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    //Criando um método que retorna alguma coisa:
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão por zero não é permitida");
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    /* Esse método está sendo criando para entender que váriaveis (que estão em CalculadoraTeste04)
    criadas lá, mesmo que passem por esse método e sejam alteradas, permaneceram com o mesmo valor
    dentro do escopo global da Classe CalculadoraTeste04
     */
    public void alterarDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    /*
    Este método somaArray permite somar todos os números de uma array
    ele será chamado pela classe CalculadoraTeste05. Leia o código com atenção
    para entende-lo.
     */
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    /*
    Esse método somaVarArgs faz a mesma coisa que o método acima, porém
    a sintaxe é meio diferente, quando esse método for chamado, ele pode
    tanto receber como parâmetro uma variável do tipo array, quanto receber
    número separados por vírgula no campo de parâmetros. observe o exemplo
    na Classe CalculadoraTeste05.
     */
    public void somaVarAgrs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
