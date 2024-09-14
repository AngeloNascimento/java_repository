public class Peixe extends Animal{
    //atributos
    private String corEscama;

    //metodos

    public void soltarBolhas(){
        System.out.println("soltando bolhas");
    }


    @Override
    public void locomover() {
        System.out.println("nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo comida de peixe...");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe nao tem som...");
    }
}
