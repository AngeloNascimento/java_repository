public class Moto extends Veiculo{
    //atributos
    private String modelo;


    public Moto(String cor, String marca, int ano, String modelo) {
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
        return "Moto: " + super.toString() +
                " modelo='" + modelo + '\'';
    }
}
