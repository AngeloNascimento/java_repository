public class Main {
    public static void main(String[] args) {

        //Pessoa p1 = new Pessoa("Angelo", "M", 25);
        //Aluno a1 = new Aluno("angelo", "M", 25, 1234,"Ciência da computação");
        //Funcionario f1 = new Funcionario("angelo", "M", 25, "TI");
        Professor p1 = new Professor("Angelo", "m", 25, "informatica", 2500.00f);


        //a1.exibeDetalhes();
        //p1.exibeDetalhes();
        //f1.exibeDetalhes();

        p1.receberAumento(600.00f);
        p1.exibeDetalhes();

    }
}