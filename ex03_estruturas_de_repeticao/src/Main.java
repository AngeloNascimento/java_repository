public class Main {
    public static void main(String[] args) {
        int i = 1;
        int a = 0;
        while (i < 10) {
            ++a;
            i += 1;
            if (a > 6 ) ++i;

        }
        System.out.println("i = " + i);
        System.out.println("a= " + a);

    }
    }


