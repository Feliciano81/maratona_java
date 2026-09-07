package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Juquinha");
        funcionario.setIdade(21);
        funcionario.setSalario(new double[] {1200, 1256.85, 1385.49});

        funcionario.imprimeDados();
    }
}
