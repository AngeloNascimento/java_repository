import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //entrada de dados do usuario
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        /*System.out.println("Qual seu sexo: ");
        String genero = entrada.nextLine();*/

        System.out.println("Digite sua altura em cm: ");
        int altura = entrada.nextInt();



        Menino m1 = new Menino(nome, idade,  altura);

        m1.exibeInformacoes();

    }
}