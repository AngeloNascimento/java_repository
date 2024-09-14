public class Aves extends Animal{
    //atributos
    private String corPena;

    //metods
    public void fazerNinho(){
        System.out.println("fazendo ninho");
    }

    @Override
    public void locomover(){ //"locomover()" é o metodo com a mesma assinatura do metodo da classe mae, porem tem outra funcionalidade
        System.out.println("voando..");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo comida de peixe...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de pássaro");
    }

    //metodos especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
