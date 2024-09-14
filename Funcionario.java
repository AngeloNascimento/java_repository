public class Funcionario extends Pessoa{

    //atibutos
    private String setor;
    private boolean trabalhando;

    //construtor
    public Funcionario(String nome, String sexo, int idade, String setor) {
        super(nome, sexo, idade);
        this.setor = setor;
        this.trabalhando = true;
    }

    //métodos

    public void mudarTrabalho(){
        this.trabalhando = ! trabalhando;
    }

    @Override
    public void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Esta trabalhando: " + this.getTrabalhando());
    }

    //métodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhado(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
