public class Tecnico extends Aluno{
    //atributos
    private int registroProfissional;

    //metodos
    public void praticar(){
        System.out.println("o aluno " + this.getNome() + " esta praticando");
    }

    //metodos especiais
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
