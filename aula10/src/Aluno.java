public class Aluno extends Pessoa{


    //atributos
    private int matricula;
    private String curso;

    //construtor
    public Aluno(String nome, String sexo, int idade, int matricula, String curso) {
        super(nome, sexo, idade);
        this.matricula = matricula;
        this.curso = curso;
    }
    //metodos
    public void cancelarMatricula(){
        System.out.println("matricula cancelada");
    }

    @Override
    public void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
    }

    //metodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
