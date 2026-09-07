package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        //Criando objeto calculadora para poder chamar o método somaArray

        Calculadora calculadora = new Calculadora();
        //Este método soma todos esses números que foram adicionados a está array logo a baixo
        int[] numeros = {1,2,3,4,5};
        /*
        Logo a baixo usando o objeto 'calculadora' chamamos o método 'somaArray'
        passamos como parâmetro o array 'numeros' que o método então somará todos
        os valores dentro da array numeros
         */
        calculadora.somaArray(numeros);
        /*método varArgs faz a mesma coisa que o método acima,
        porém não é necessário passar uma variável do tipo
        array para funcionar*/
        calculadora.somaVarAgrs(1,2,3,4,5,6,7,8);
    }
}
