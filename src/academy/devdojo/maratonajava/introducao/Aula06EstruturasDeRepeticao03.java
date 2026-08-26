package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    //Imprima os 25 primeiros números de um dado valor
    public static void main(String[] args) {
        int contador = 50;
        int limite = contador / 2;
        for (int i = 1; i < contador; i++){
            System.out.println("O número é: "+i);
            if (i >= limite){
                break;
            }

        }
    }
}
