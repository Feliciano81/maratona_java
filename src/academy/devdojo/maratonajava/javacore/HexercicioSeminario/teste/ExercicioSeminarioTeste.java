package academy.devdojo.maratonajava.javacore.HexercicioSeminario.teste;

import academy.devdojo.maratonajava.javacore.HexercicioSeminario.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.HexercicioSeminario.dominio.Professor;
import academy.devdojo.maratonajava.javacore.HexercicioSeminario.dominio.Seminario;

public class ExercicioSeminarioTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Cauã Barbosa", 23);
        Aluno aluno2 = new Aluno("Dielly", 23);
        Aluno aluno3 = new Aluno("Jeferson", 19);
        Aluno aluno4 = new Aluno("Ana Paula", 22);
        Aluno aluno5 = new Aluno("Rebeca", 24);
        Aluno aluno6 = new Aluno("Júlio", 28);
        Professor professor1 = new Professor("Luciado", "Redes de Computadores");
        Professor professor2 = new Professor("Astarote", "Programação Web");
        Seminario seminario1 = new Seminario("Como criar redes lógicas com IA", "FATEC Campinas");
        Seminario seminario2 = new Seminario("Como detectar ameaças e previnir segurança de dados", "Instituto de tecnologia de São Paulo");

        Aluno[] alunos = {aluno1, aluno2, aluno3};


        aluno1.setSeminario(seminario1);
        aluno4.setSeminario(seminario1);
        aluno3.setSeminario(seminario1);
        aluno2.setSeminario(seminario2);
        aluno5.setSeminario(seminario2);
        aluno6.setSeminario(seminario2);

        aluno2.imprime();
    }
}
