import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*Aula sobre com usar o HASMAP
        * Armazena valor na estrutura <Chave, Valor>
        *Açoes no HashMAp:
        * 1- Remover
        * 2- Adicionar
        * 3- Acessar
        * 4- Limpar
        * 5- Interação
        * */
        HashMap<String, Integer> mapa = new HashMap<>();
        HashMap<String, String> usuario = new HashMap<>();

        //Adicionar elementos
        mapa.put("java", 1);//usa-se o metodo put() para adicionar elementos ao HasMap
        mapa.put("Python", 2);
        mapa.put("C", 3);

        //ex02= a chave= cpf , valor = nome
        usuario.put("00000000000", "Angelo");
        usuario.put("11111111111", "Suelen");
        usuario.put("22222222222", "Miguel");

        //Remover elementos: para remover os itens usa-se o metedo remove(), com a chava ou o <chave, valor>
        //System.out.println("o usuario "+ usuario.remove("00000000000")+" foi removido");


        //Acessar elementos: para acessar os elementos usa-se o metodo get().
        System.out.println("numero do elemento: " + mapa.get("C"));

        //interações: usa-se Entry para receber as chaves e valores
        for (Map.Entry<String, String> entry: usuario.entrySet()){
            String chave = entry.getKey();//getKEY pega o valor da chave
            String valor = entry.getValue();//

            System.out.println("Chave "+ chave + " Valor "+ valor);
        }

        System.out.println(mapa.toString());//toString() tambem serve para exibir os elmentos da colecao
        System.out.println("tamanho da colecao: " + usuario.size());//utiliza-se o metodo size() para saber o tamanho da colecao

        //limpar todos os elmentos da coleçao: usa-se o metodo clear();
        usuario.clear();

        System.out.println("apando colecao...");

        System.out.println("tamanho da colecao: " + usuario.size());

        /*
        * no HashMap nao pode haver 2 elementos com a mesma chave
        * quando se adciona elementos com a mesma chave e com mesmo valor o algoritmo entende que é a mesma coisa
        * e ignora ex: <"Java", 1> e <"Java", 1>
        *
        * porém quando é a mesma chave, mas o valo é diferente ele atualiza
        * ex: <"00000000000", "Angelo"> e <"00000000000", "Angelo Inácio">
        *
        * */




    }
}