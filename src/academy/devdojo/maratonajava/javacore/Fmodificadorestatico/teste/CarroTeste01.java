package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Mercedes", 280);
        Carro carro2 = new Carro("Jaguar", 300);
        Carro carro3 = new Carro("Jetta", 320);
        /*Com o atributo da classe Carro sendo aleterado para static, mesmo que altere somente
         * o atributo velocidadeLimite do carro1, também modificará os atributos de carro2 e carro3,
         * Execute essas linhas de código e veja o exemplo:*/
        Carro.setVelocidadeLimite(270);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
