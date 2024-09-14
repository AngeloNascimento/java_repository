import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String menu;

        System.out.println("deseja adicionar alguem? [S/N] ");
        menu = entrada.nextLine().toLowerCase();

        while (menu.equals("s")) {

            System.out.println("Digite o nome: ");
            String nome = entrada.next();

            System.out.println("Digite a idade: ");
            int idade = entrada.nextInt();

            System.out.println("Qual o sexo : [M/F] ");
            String sexo = entrada.next();

            Pessoa p1 = new Pessoa(nome, sexo, idade);

            p1.exibeDetalhes();
        }


















    }
}