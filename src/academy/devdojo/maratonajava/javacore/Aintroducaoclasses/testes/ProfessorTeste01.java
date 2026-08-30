package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.testes;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "João Saldanha";
        professor.idade = 48;
        professor.sexo = 'M';

        System.out.println("Nome: "+ professor.nome + "\nIdade: "+ professor.idade + "\nSexo: "+ professor.sexo);
    }
}
