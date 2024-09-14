public class Onibus extends Veiculo{
    //Atributos
    private String modelo;

    //construtor
    public Onibus(String cor, String marca, int ano, String modelo) {
        super(cor, marca, ano);
        this.modelo = modelo;
    }

    //metodos
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("modelo: " + this.getModelo());
    }

    //metodos especiais

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Onibus: " + super.toString() +
                " modelo='" + modelo + '\'';
    }
}
