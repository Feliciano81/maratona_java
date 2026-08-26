package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /* Inicialização de variáveis do tipo byte, short, int, float
        e double, quando não possuem valor na memória, por padrão o Java seta 0
        Já o tipo primitivo char não tendo valor na sua inicialização possui valor '\u0000' ou ' '
        Já Strings sem valor na memória retornaram null
        Essas linhas de código abaixo exemplificam basicamente como iterar uma array em java
         */
        String[] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Vitória";
        nomes[2] = "Camila";

        for (int i = 0; i < 3; i++){
            System.out.println(nomes[i]);
        }

    }
}
