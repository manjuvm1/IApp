
public class ArmstrongNumber {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        int number = 0;
        int sum = 0;
        int count = 0;
        System.out.println("Armstrong numbers: ");
        for (int a = 0; a < 9; a++) {
            for (int b = 0; b < 9; b++) {
                for (int c = 0; c < 9; c++) {
                     number = a*100 + b*10 + c;
                     sum = (a * a * a) + (b * b * b) + (c * c * c);
                     if (number == sum) {
                        System.out.println(number);
                        count++;
                    }
                }
            }
        }
    }
}

