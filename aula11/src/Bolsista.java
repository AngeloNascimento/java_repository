public class Bolsista extends Aluno{
    //atributos
    private int bolsa;

    //metodos
    public void renovarBolsa(){
        System.out.println("renovando bolsa de " + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " e bolsista! Pagamento diferenciado");
    }
}
