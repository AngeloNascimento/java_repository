public class Gafanhoto extends Pessoa{
    //atributos
    private String login;
    private int totAssistindo;

    //construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }

    //metodos
    public void viuMaisUm(){

    }

    //metodos especiais


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "\nGafanhoto{"+ super.toString() +
                "\nlogin='" + login + '\'' +
                "\n, totAssistindo=" + totAssistindo +
                '}';
    }
}

