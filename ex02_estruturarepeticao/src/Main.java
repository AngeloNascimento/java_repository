public class Main {
    public static void main(String[] args) {
        int cc = 0;
        while (cc<400){// enquanto cc for menor que 400 o loop se repetirar;
            cc++;//soma mai 1 ao cc
            if (cc % 2 == 1){
                continue;
            }
            System.out.println("Camabalhota " + cc);//exibira somente as cambalhotas pares

        }
    }
}