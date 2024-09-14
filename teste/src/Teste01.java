public class Teste01 {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;


    public Teste01(String m, String c, float p){//metdo construtor tem o mesmo nome da classe.
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();



    }

    public String getModelo(){
        return this.modelo;

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public float getPonta() {
        return ponta;
    }


    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar(){
        this.tampada = true;

    }

    public void status(){
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("cor: " + this.cor);
        System.out.println("tampada: " + this.tampada);
    }
}
