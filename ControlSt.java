public class ControlSt {
    public static void main(String[] args) {
        System.out.println("-----------While loop---------------");
        While();
        System.out.println("-----------DoWhile loop---------------");
        DoWhile(10, 20);
    }

    private static void DoWhile(int a, int b) {
        do {
            System.out.println("Value of a : " + a);
            ++a;
        } while (a > b);
    }

    private static void While() {
        int a = 10;

        while(a > 6) {
            System.out.println( a + " > 6");
            a--;
        }
    }


}
