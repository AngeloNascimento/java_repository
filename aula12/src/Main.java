public class Main {
    public static void main(String[] args) {

        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Aves a1 = new Aves();

        a1.setIdade(12);
        a1.setCorPena("Azul");
        a1.setMembros(5);
        a1.setPeso(12);

        a1.exiber();
    }
}