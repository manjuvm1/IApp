//Program to check name present in voter list
import java.util.Scanner;

public class VoterList {

//main method
	public static void main(String[] args) {
		voterList();
	}

	public static void voterList() {
//Take the input from keyboard
		System.out.println("Enter you name : ");
		Scanner scanner = new Scanner(System.in);
		String voterName = scanner.nextLine();
//List of Voter names 
		String[] voterNameArray = {"Manju", "Vinay", "Peter", "Kevin", "Kurt"};
		boolean compare = false;
//Compare the name with voter list
		for (int i = 0; i < voterNameArray.length; i++) {
			compare = voterName.equals(voterNameArray[i]);
			if (compare == true) {
				break;
			}
		}
//Print the result
			if (compare == true) {
				System.out.println("Congrats, Your name found in voter list!!");
			} else {
				System.out.println("Sorry, Your name not found in voter list");
			}
			scanner.close();
		}		
		}