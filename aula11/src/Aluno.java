public class Aluno extends Pessoa{
    //atributos
    private int matricula;
    private String curso;

    //metodos
    public void pagarMensalidade(){
        System.out.println("pagando a mensalidade do aluno : " + this.getNome());
    }
    public void exibeAluno(){
        System.out.println(toString());
        System.out.println("matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());

    }


    /*public final void pagarMensalidade(){-----quando tem final no metodo ele não podera ser sobreposto com override.
        System.out.println("pagando a mensalidade do aluno : " + this.getNome());
    }*/

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
