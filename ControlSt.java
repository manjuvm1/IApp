public class ControlSt {
    public static void main(String[] args) {
     /*   System.out.println("-----------While loop---------------");
        While();
        System.out.println("-----------DoWhile loop---------------");
        DoWhile(10, 12);
        System.out.println("-----------Switch control statement---------------");
        Switch();
        foreachloop(); */
    //    varargument(3, 4);
        System.out.println("sum : " + varargument(3, 4, 100, 200));
    }

    private static int varargument(int...a) {
        int sum = 0;
        for (int b : a) {
            sum = sum + b;
        }
        return sum;

    }

    private static void foreachloop() {
        String[] cars = {"BMW", "Benz", "Honda", "Bogati", "Ford"};
        for (String car : cars) {
            System.out.println("Car names : " + car);
        }
    }

    public static void Switch() {
    	int i = 2;
    	switch (i) {
    	case 1: 
    		System.out.println("Case 1");
    		break;
    	case 2: 
    		System.out.println("Case 2");
    		break;	
    	case 10: 
    		System.out.println("Case 1");
    		break;
    	default: 
    		System.out.println("default");
    	}
    		
    	}

	public static void DoWhile(int a, int b) {
        do {
            System.out.println("Value of a : " + a);
            ++a;
        } while (b > a);
    }

    public static void While() {
        int a = 10;

        while(a > 6) {
            System.out.println( a + " > 6");
            a--;
        }
    }
}
