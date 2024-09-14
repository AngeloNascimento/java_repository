import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //o TreeSet implementa uma arvore binaria;
        /*
        * pode-se pensar em usar arvore binaria quando a pesquisa de vários elementos
        * vai influenciar no desempenho do sistema
        *
        * */

        TreeSet<Integer> arvoreBinaria = new TreeSet<>();

        //adicionar elementos: usa-se o metodo add();
        //exemplo: adicionar os elementos 4,2,6,3,5,7

        arvoreBinaria.add(4);
        arvoreBinaria.add(2);
        arvoreBinaria.add(6);
        arvoreBinaria.add(3);
        arvoreBinaria.add(5);
        arvoreBinaria.add(7);

        //descobrindo o elemento raiz e o elemento final
        System.out.println(arvoreBinaria.first());//first exibe o nó raiz
        System.out.println(arvoreBinaria.last());//last exibe o ultimo nó

        //removendo elementos da arvore;
        arvoreBinaria.remove(6);

        //verificando se o elemento contem na arvore
        System.out.println(arvoreBinaria.contains(6));


    }
}