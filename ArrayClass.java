	import java.util.*;
	public class ArrayClass {
	    public static void main(String[] args) {
	        CustArray();
	
	    }

	  private static void CustArray() {
	
	 //Customer Array
	        String[] customerArr = {"Martin", "Peter", "John", "Michael", "Geert"};
	        System.out.println("Old Customer Array : ");
	        for (String cust : customerArr) {
	            System.out.println(cust);
	        }
// Arrays.copyOfRange
	        String[] customerArrayC = Arrays.copyOfRange(customerArr, 0, 3);
	        System.out.println("Array.copyOfRange: ");
	        for (String cust5 : customerArrayC) {
	        	System.out.println(cust5);
	        }
// Arrays.copyOf - integer array
	        int [] intArray = {1, 2, 3, 4, 5};
	        int intArrayNew[] = Arrays.copyOfRange(intArray, 0, 3);
	        System.out.println("Int Array : ");
	        for (int name6 : intArrayNew) {
		        System.out.println(name6);	        	
	        }

	        
	//New customer array with increased size
	        String[] newCustomerArr = new String[customerArr.length + 1];
	        System.out.println("New customer array : ");
	        for (String newname : newCustomerArr) {
	            System.out.println(newname);
	        }
	//clone of array
	        String[] customerArr3 = customerArr.clone();
	        System.out.println("clone of array");
	        for (String cust3 : customerArr3) {
	            System.out.println(cust3);
	        }
	//Increase array size using ArrayOf
	        String[] customerArr2 = Arrays.copyOf(customerArr, 10);
	        System.out.println("Size of customerArr2 : " + customerArr2.length);
	        customerArr2[5] = "Sandra";
	        System.out.println("Customer Array2 list : ");
	        for (String newname2 : customerArr2) {
	            System.out.println(newname2);
	        }
	    }

	}