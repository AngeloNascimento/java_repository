import java.util.*;

/*os tipos de coleçoes são List, SET, MAP
* os tipos de listas são:
* ArrayList, LinkedList
*
* os tipos de SET são:
* Hashset, TreeSET
*
* os tipos de MAP são:
* HashMAP, TreeMAP
*
* */
public class Main {
    public static void main(String[] args) {
        //Trabalhando com listas
        Usuario u1 = new Usuario("Angelo");
        Usuario u2 = new Usuario("Suelen");
        Usuario u3 = new Usuario("Miguel");
        /*toda coleçao tem metodos padroes sao eles:
        -Adicionar,
        -Remover(excluir)
        -Substituir(trocar de posiçao)
        -Atualizar(Editar)*/
        List<Usuario> listadeUsuarios = new ArrayList<Usuario>();

        //adicionando
        //Em uma fila a ordem que os elementos forem entrando vai saer a ordem que eles pernanecem
        listadeUsuarios.add(u1);//primeiro elemento da fila
        listadeUsuarios.add(u2);//segundo elemento da fila
        listadeUsuarios.add(u3);//terceiro elemento da fila

        List<Usuario> listadeUsuario2 = new LinkedList<>();//linkedList é uma lista encadeada

        listadeUsuario2.add(u3);//primeiro elemento da fila
        listadeUsuario2.add(u1);//segundo elemento da fila
        listadeUsuario2.add(u2);//terceiro elemento da fila

        //Trabalhando com SET- HASHSET, TreeSET
        Set<Usuario> conjunto = new HashSet<Usuario>();

        //Trabalhando com MAP- HASHMAP, TreeSET
        Map<Usuario, Integer> mapa = new HashMap<>();//a coleção MAP trabalha com uma estrutura de chave e valor <X, Y>= (Valor, posição)
        mapa.put(u1, 1);//no MAP o put serve para adicionar
                        //na busca o MAP é mais rápido






    }
}