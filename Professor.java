public class Professor extends Pessoa{
    //atributos
    private String especialidade;
    private float salario;

    //construtor
    public Professor(String nome, String sexo, int idade, String especialidade, float salario) {
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    //metodos
    public void receberAumento(float aumento){
        this.salario+= aumento;

    }

    @Override
    public void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("especialidade: " + this.getEspecialidade());
        System.out.println("salario: " + this.getSalario());
    }

    //metodos especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
