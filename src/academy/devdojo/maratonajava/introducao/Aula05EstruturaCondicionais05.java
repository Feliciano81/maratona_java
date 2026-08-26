package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando 1 como domingo
        byte dia =10;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }


    }
}
