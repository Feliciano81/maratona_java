package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.testes;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        //Criação dos objetos referentes a carros da Honda e da Ford
        Carro carroHonda = new Carro();
        Carro carroFord = new Carro();

        //valores atribuidos ao objeto carroHonda
        carroHonda.montadora = "Honda";
        carroHonda.modelo = "Civic";
        carroHonda.ano = 2023;

        //Valores atribuidos ao objeto carroFord
        carroFord.montadora = "Ford";
        carroFord.modelo = "Escort";
        carroFord.ano = 1995;

        System.out.println("Montadora: "+carroHonda.montadora+ "\nModelo: "+carroHonda.modelo +"\nAno: "+carroHonda.ano);
        System.out.println("Montadora: "+carroFord.montadora+ "\nModelo: "+carroFord.modelo +"\nAno: "+carroFord.ano);

    }
}
