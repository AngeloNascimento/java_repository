public abstract class Animal {
    //atributos
    protected int peso;
    protected int idade;
    protected int membros;

    //metodos
    public void exiber(){
        System.out.println(this.getIdade()+", "+ this.membros + ", " + this.getPeso());
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //metodos especiais


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
