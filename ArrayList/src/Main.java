import java.util.*;

/*
* Diferente dos arrays tradicionais, o ArrayList pode aumentar ou diminuir de tamanho
* automaticamente conforme elementos são adicionados ou removidos
* ele oferece metodos uteis para manipular a lista de elementos
* como adicionar, remover, buscar e iterar sobre os elementos.
*
* */

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
       /* //List
        //adicionar elementos- usa-se o metodo add();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //verificar o tamanho do Array- usa-se o metodo size();
        //ex
        int tamanho = numeros.size();
        System.out.println(numeros);

        //recuperar ou acessar- usa-se o metodo get();
        //ex
        int primeiro = numeros.get(0);//vai acessar o primeiro elemento do array
        int ultimo = numeros.get(tamanho - 1);//vai acessar o ultimo elemento do array

        //remover elementos- usa-se o metodo remove()
        //ex
        numeros.remove(0);//na remoção pode-se remover o elemento através do indice ou pelo proprio elemento


        //exibir os elementos do arraylist
        //ex
        for(Integer numero: numeros ){//pode ser percorrida por iteração
            System.out.println(numero);
        }

        */for (int i=0; i<numeros.size(); i++){
            System.out.println(numeros.get(i));
        }


        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("A");
        nomes.add("B");
        nomes.add("C");
        nomes.add("D");
        nomes.add("E");

        /*System.out.println(nomes);
        System.out.println("Digite a letra que deseja remover: ");
        String remove = entrada.next().toUpperCase();

        nomes.remove(remove);

        System.out.println("Lista atualizada: \n" + nomes);*/

        //Atualizando a lista
        for (int i =0; i< nomes.size(); i++){
            System.out.println(i + "-> "+ nomes);
            System.out.println("qual indice deseja atualizar: ");
            int i1 = entrada.nextInt();
            System.out.println("Qual letra deseja adiciona: ");
            String l1 = entrada.next().toUpperCase();

            nomes.set(i1, l1);

            System.out.println(nomes);
        }


       /* for(String nome: nomes){
            System.out.println(nome.toUpperCase());
        }*/







    }



}