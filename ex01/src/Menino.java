public class Menino extends Pessoa{
    //atributos
    private String sexo;
    private int altura;

    //construtor

    public Menino(String nome, int idade /*,String sexo*/, int altura) {
        super(nome, idade);
        /*this.sexo = sexo;*/
        this.altura = altura;
    }

    //metodos
    @Override
    public void exibeInformacoes(){
        super.exibeInformacoes();
        /*System.out.println("Sexo: " + this.getSexo());*/
        System.out.println("Altura: " + this.getAltura() + "m");
    }

    //metodos especiais

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Menino{" + super.toString()+
                "\nsexo='" + sexo + '\'' +
                ", altura=" + altura +"m"+
                '}';
    }
}
