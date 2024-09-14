public class Mamifero extends Animal {
    //atributos
    private String corPelo;




    //metodos
    @Override
    public void locomover() {
        System.out.println("andando");
    }

    @Override
    public void alimentar() {
        System.out.println("mamando");

    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");
    }

    //metodos especiais

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
