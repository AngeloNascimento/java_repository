public class Veiculo {
    private String cor;
    private String marca;
    private int ano;


    //construto


    public Veiculo(String cor, String marca, int ano) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;

    }

    //metodos
    public void exibirDetalhes(){
        System.out.println("cor: " + this.getCor() + "marca: " + this.getMarca() + "ano: " + this.getAno());
    }

    //metodos esoeciais
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return  "cor='" + cor + '\'' +
                ", tipo='" + marca + '\'' +
                ", ano=" + ano + '\'' + ", "
                ;
    }
}
