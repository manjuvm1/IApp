//Print Fibonacci series
public class Fibonacci {

    public static void main(String[] args) {
        Fibo();
    }
    public static void Fibo() {
        int FibInt = 0;
        int FibPrev = 0;
        int FibPrev1 = 0;
        int limit = 100000;
        System.out.print("Fibonacci numbers: ");
        for (int i = 0; i < 100; i++) {
            if (FibInt > limit) {
                break;
            }
            System.out.print(FibInt + " , ");
            if (i == 0) {
                FibPrev = 1;
            }
            FibInt = FibPrev + FibPrev1;
            FibPrev1 = FibPrev;
            FibPrev = FibInt;
        }
    }
    }