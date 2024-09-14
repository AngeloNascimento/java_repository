import java.util.*;

/*O seguinte projeto visa treinar os conceitos de POO em Java,
* estruturas de controle(Do-While, While, For),
* e a medida que for evoluindo adicionando coleções
*
* é um porjeto para cadastro de veiculos que vai poder Adicionar, Buscar, Atualizar e Deletar*/

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Veiculo> carros = new ArrayList<>();
        ArrayList<Veiculo> motos = new ArrayList<>();
        ArrayList<Veiculo> onibus = new ArrayList<>();
        int menu = 0;

        do {
            System.out.println("###############################################");
            System.out.println("1- Adcionar" +
                    "\n2- Buscar" +
                    "\n3- Atualizar" +
                    "\n4- Deletar" +
                    "\n0- Sair");
            System.out.print("Digite uma opção: ");
            menu = entrada.nextInt();
//==================================================adicionar===============================
            switch (menu) {//recebe a opção de menu escolhida pelo usuario para que seja direcionando ao menu de veiculo adequado.
                case 1:// opção para adicionar novos veiculos
                    System.out.println("###############################################");
                    System.out.println("Adcionar seu veiculo: " +
                            "\n1- Carro" +
                            "\n2- Moto" +
                            "\n3- Onibus" +
                            "\n0- Menu Anterior" +
                            "\nQual seu veiculo? ");
                    System.out.println("###############################################");
                    menu = entrada.nextInt();//recebe a opção de menus digitado pelo usuario

                    if (menu == 1) {//adiciona carro
                        System.out.print("Digite a cor: ");
                        String cor = entrada.next().toLowerCase();

                        System.out.print("Qual a marca: ");
                        String marca = entrada.next().toLowerCase();

                        System.out.print("Qual o ano: ");
                        int ano = entrada.nextInt();

                        System.out.print("Qual o modelo: ");
                        String modelo = entrada.next().toLowerCase();

                        Carro c1 = new Carro(cor, marca, ano, modelo);//cria um objeto carro
                        carros.add(c1);//adiciona o objeto criado ao arraylist carros

                        System.out.println("carro adicionado com sucesso! ");


                    } else if (menu == 2) {//moto
                        System.out.print("Digite a cor: ");
                        String cor = entrada.next().toLowerCase();

                        System.out.print("Qual a marca: ");
                        String marca = entrada.next().toLowerCase();

                        System.out.print("Qual o ano: ");
                        int ano = entrada.nextInt();

                        System.out.print("Qual o modelo: ");
                        String modelo = entrada.next().toLowerCase();

                        Moto m1 = new Moto(cor, marca, ano, modelo);//cria um objeto moto
                        motos.add(m1);//adiciona o objeto criado ao array list motos

                        System.out.println("moto adicionado com sucesso! ");

                    } else if (menu == 3) {//onibus
                        System.out.print("Digite a cor: ");
                        String cor = entrada.next().toLowerCase();

                        System.out.print("Qual a marca: ");
                        String marca = entrada.next().toLowerCase();

                        System.out.print("Qual o ano: ");
                        int ano = entrada.nextInt();

                        System.out.print("Qual o modelo: ");
                        String modelo = entrada.next().toLowerCase();

                        Onibus o1 = new Onibus(cor, marca, ano, modelo);//cria um objeto onibus
                        onibus.add(o1);//adicionar o objeto onibus ao Arraylist onibus

                        System.out.println("onibus adicionado com sucesso! ");
                    } else if (menu == 0) {//menu anterior
                        break;
                    }
                    break;
//======================================exibir==========================================
                case 2://Buscar/exibir
                    System.out.println("###############################################");
                    System.out.println("Exibir veiculo: " +
                            "\n1- Carro" +
                            "\n2- Moto" +
                            "\n3- Onibus" +
                            "\n0- Menu Anterior" +
                            "\nQual tipo de veiculos quer ver:  ");
                    System.out.println("###############################################");
                    menu = entrada.nextInt();


                    switch (menu) {
                        case 1:
                            for (int i = 0; i < carros.size(); i++) {
                                System.out.println(i + "- " + carros);
                            }
                            break;
                        case 2:
                            for (int i = 0; i < motos.size(); i++) {
                                System.out.println(i + "- " + motos);
                            }
                            break;
                        case 3:
                            for (int i = 0; i < onibus.size(); i++) {
                                System.out.println(i + "- " + onibus);
                            }
                            break;
                        case 0:
                            break;

                        default:
                            System.out.println("Opção invalida!");
                            break;

                    }
                    break;

//============================================atualizar============================================
                case 3:
                    System.out.println("###############################################");
                    System.out.println("Atualizar veiculo: " +
                            "\n1- Carro" +
                            "\n2- Moto" +
                            "\n3- Onibus" +
                            "\n0- Menu Anterior" +
                            "\nQual tipo de veiculos quer excluir:  ");
                    System.out.println("###############################################");
                    menu = entrada.nextInt();

                    if (menu == 1) {
                        for (int i = 0; i < carros.size(); i++){
                            System.out.println("["+i+"]- "+ carros.get(i));
                        }
                        System.out.println("Qual indice [] deseja atualizar: ");
                        int indice = entrada.nextInt();

                        if (indice <= carros.size()){
                            System.out.print("Digite a cor: ");
                            String cor = entrada.next().toLowerCase();

                            System.out.print("Qual a marca: ");
                            String marca = entrada.next().toLowerCase();

                            System.out.print("Qual o ano: ");
                            int ano = entrada.nextInt();

                            System.out.print("Qual o modelo: ");
                            String modelo = entrada.next().toLowerCase();

                            Carro c2 = new Carro(cor, marca, ano, modelo);//cria um objeto carro
                            carros.set(indice, c2);


                            System.out.println("elemento atualizado! ");
                        }else {
                            System.out.println("elemento não encontrado");
                        }
                    } else if (menu == 2) {
                        for (int i = 0; i < motos.size(); i++) {
                            System.out.println("[" + i + "]- " + motos.get(i));
                        }
                        System.out.println("Qual indice [] deseja atualizar: ");
                        int indice = entrada.nextInt();

                        if (indice <= motos.size()) {
                            System.out.print("Digite a cor: ");
                            String cor = entrada.next().toLowerCase();

                            System.out.print("Qual a marca: ");
                            String marca = entrada.next().toLowerCase();

                            System.out.print("Qual o ano: ");
                            int ano = entrada.nextInt();

                            System.out.print("Qual o modelo: ");
                            String modelo = entrada.next().toLowerCase();

                            Moto c2 = new Moto(cor, marca, ano, modelo);//cria um objeto carro
                            motos.set(indice, c2);

                        } else {
                            System.out.println("indice não encontrado");
                        }
                    } else if (menu == 3) {
                        for (int i = 0; i < onibus.size(); i++){
                            System.out.println("["+i+"]- "+ onibus.get(i));
                        }
                        System.out.println("Qual indice [] deseja atualizar: ");
                        int indice = entrada.nextInt();

                        if (indice <= onibus.size()) {
                            System.out.print("Digite a cor: ");
                            String cor = entrada.next().toLowerCase();

                            System.out.print("Qual a marca: ");
                            String marca = entrada.next().toLowerCase();

                            System.out.print("Qual o ano: ");
                            int ano = entrada.nextInt();

                            System.out.print("Qual o modelo: ");
                            String modelo = entrada.next().toLowerCase();

                            Onibus c2 = new Onibus(cor, marca, ano, modelo);//cria um objeto carro
                            onibus.set(indice, c2);
                        }else{
                            System.out.println("opçao invalida");
                        }
                    }else{
                        System.out.println("Opcao invalida! ");
                    }


                    break;
//============================================remover==============================================
                case 4://deletar
                    System.out.println("###############################################");
                    System.out.println("Excluir veiculo: " +
                            "\n1- Carro" +
                            "\n2- Moto" +
                            "\n3- Onibus" +
                            "\n0- Menu Anterior" +
                            "\nQual tipo de veiculos quer excluir:  ");
                    System.out.println("###############################################");
                    menu = entrada.nextInt();
                    switch (menu){
                    case 1:
                        for (int i = 0; i < carros.size(); i++){
                            System.out.println("["+i+"]- "+ carros.get(i));
                        }
                            System.out.println("digite o indice que quer deletar: ");
                            int indice = entrada.nextInt();

                            if (indice <= carros.size()) {
                                carros.remove(indice);
                            }else {
                                System.out.println("opçao invalida! ");
                            }

                        break;
                    case 2:
                        for (int i = 0; i < motos.size(); i++){
                            System.out.println("["+i+"]- "+ motos.get(i));
                        }
                            System.out.println("digite o indice que quer deletar: ");
                            int indice2 = entrada.nextInt();

                            if (indice2 <= motos.size()) {
                                motos.remove(indice2);
                            }else {
                                System.out.println("opçao invalida! ");
                            }
                        break;
                    case 3:
                        for (int i = 0; i < onibus.size(); i++){
                            System.out.println("["+i+"]- "+ onibus.get(i));
                        }
                        System.out.println("digite o indice que quer deletar: ");
                        int indice3 = entrada.nextInt();

                        if (indice3 <= onibus.size()) {
                            onibus.remove(indice3);
                        }else {
                            System.out.println("opçao invalida! ");
                        }
                        break;
                    case 0:
                        break;

                    default:
                        System.out.println("Opção invalida!");
                        break;
                }

                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }while (menu != 0) ;//sair do sistema
            System.out.println("encerrando...");





















    }


}