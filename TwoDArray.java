
import java.lang.reflect.Array;

public class TwoDArray {

        public static void main(String[] args) {
// 		Multiplication table of number
   	    tables();
		DisplayAsterisk1();
		DisplayAsterisk2();
		DisplayAsterisk3();
		DisplayNumbers1();
		DisplayNumbers2();
		DisplayNumbers3();
        DisplayNumbers4();


        }

        private static void DisplayNumbers4() {
            System.out.println("Display numbers - Right oriented");

            int[][] Array1 = new int[5][5];
            for (int i = 0; i < 5; i++) {
                int k = 1;
                for (int j = 0; j < 5; j++) {

                    if (j >= (4 - i)) {
                        Array1[i][j] = k;
                        System.out.print(Array1[i][j]);
                        k++;
                    }
                }
                System.out.println();
            }
        }

        private static void DisplayNumbers3() {
            System.out.println("Display numbers - centrl (1,2,3)");

            int[][] Array1 = new int[10][10];
            for (int i = 0; i < 10; i++) {
                int k = 1;
                for (int j = 0; j < 10; j++) {

                    Array1[i][j] = k;
                    if (j >= (9 - i)) {
                        System.out.print(Array1[i][j]);
                        k++;
                    } System.out.print(" ");
                }
                System.out.println();
            }
        }

        private static void DisplayNumbers2() {
            System.out.println("Display Asterisk - Central (Strange)");

            String[][] Array1 = new String[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    Array1[i][j] = "*";
                    if (j >= (9 - i)) {
                        System.out.print(Array1[i][j]);
                    } System.out.print(" ");
                }
                System.out.println();
            }
        }

        private static void DisplayNumbers1() {
            System.out.println("Display numbers - left oriented");
            int[][] Arr1 = new int [10][10];

            for (int i=0; i < 10; i++) {
                for (int j=0; j < 10; j++) {
                    if (j <= i) {
                        int k = (j +1 );
                        Arr1[i][j] = k;
                        System.out.print(Arr1[i][j]);
                    } else {
                        System.out.print(" ");
                    }
                } System.out.println(" ");

            }
        }

        private static void DisplayAsterisk3() {
            int m = 4;
            int n = m / 2;
            String[][] Array1 = new String [5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    Array1[i][j] = " ";
                    if ((j >= (n-i)) && (j <= (n+1))) {
                        Array1[i][j] = "*";
                        System.out.print(Array1[i][j]);
                    }   System.out.print(" ");
                } System.out.println(" ");
            }

        }

        private static void tables() {
            int a = 8;
            System.out.println("----------" + "Multiplication table of " + a + "----------");
            for (int i = 1; i <= 10; i++) {
                System.out.println((a * i));
            }

        }

        public static void DisplayAsterisk1() {
            System.out.println("Asterisk in increment order - left oriented");
            String[][] Arr1 = new String [10][10];
            for (int i=0; i < 10; i++) {
                for (int j=0; j < 10; j++) {
                    Arr1[i][j] = "*";
                    if (j <= i) {
                        System.out.print(Arr1[i][j]);
                    } else {
                        System.out.print(" ");
                    }
                } System.out.println(" ");
            }
        }
        public static void DisplayAsterisk2() {
            System.out.println("Asterisk in increment order - right oriented");
            int m = 10;
            String[][] Arr1 = new String [10][10];
            for (int i=0; i < m; i++) {
                for (int j=0; j < m; j++) {
                    Arr1[i][j] = "*";
                    if (j < ((m - 1) - i)) {
                        System.out.print(" ");
                    } else {
                        System.out.print(Arr1[i][j]);
                    }
                } System.out.println(" ");
            }
        }
    }
