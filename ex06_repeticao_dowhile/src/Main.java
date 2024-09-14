import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, s=0;
        String resp;

        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Digite um numero: ");
            n = entrada.nextInt();
            s+=n;
            System.out.println("Quer somar outro numero? [s/n]");
            resp = entrada.next().toLowerCase();//toLowerCase transforma todas as letras em minuscula
        }while (resp.equals("s"));
        System.out.println("A soma total: " + s);



    }
}