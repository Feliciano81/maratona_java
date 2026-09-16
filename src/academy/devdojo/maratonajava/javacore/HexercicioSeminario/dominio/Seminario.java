package academy.devdojo.maratonajava.javacore.HexercicioSeminario.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private String endereco;

    public void imprime() {
        System.out.println("Título: " + this.titulo);
        if (alunos == null){
            return;
        }
        for (int i = 0; i < alunos.length; i++){
            System.out.println("Aluno: " + alunos[i].getNome());
        }
        System.out.println("Endereço do seminário: " + this.endereco );
    }

    public Seminario(String titulo, String endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
