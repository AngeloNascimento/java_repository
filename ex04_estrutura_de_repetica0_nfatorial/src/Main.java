import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero para fatorar: ");//numero a ser fatorado
        int n = entrada.nextInt();
        int f = 1;
        int c = n;

        while (c >= 1){//while repete enquanto for verdade; no while o teste logico e feito no início.
            f *= c;
            c--;

        }
        System.out.println("o fatorial de " + n + " é igual a: " + f);

    }
}