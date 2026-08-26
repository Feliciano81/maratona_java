package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int count = 0;
       for(count = 0; count < 100; count++){
            if (count % 2 == 0){
                System.out.println(count);
                count += 1;
            }
        }
    }
}