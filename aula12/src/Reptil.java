public class Reptil extends Animal{
    //atributos
    private String corEscama;

    //metodos
    @Override //sobreescreve o metodo da classe mae
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo comida de repteis");
    }

    @Override
    public void emitirSom() {
        System.out.println("fazendo sons de repteis");

    }

    //metodos especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
