package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        /*Nesses dois objetos que estamos criando, setamos o nome do jogador
        * e o time, porém essa atribuição dos dois juntos na mesma impressão
        * só irá ser possível graças a orientação dos objetos através das claases
        * Jogador e Time (observe a lógica delas)*/
        Jogador jogador1 = new Jogador("Bruno Henrique");
        Time time = new Time("Corinthians");

        /*Aqui o objeto jogador1 está recebendo o parâmetro time, que foi
        * setado lá pelo objeto time, que já possui um construtor em sua classe
        * e o obriga a receber o nome do time*/
        jogador1.setTime(time);
        /*Aqui o objeto jogador executa o método imprime onde será impresso
        * as informações OBS:consulte o método imprime na classe Jogador para entender
        * melhor a lógica desse código*/
        jogador1.imprime();
    }
}
