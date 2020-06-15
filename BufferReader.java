import java.io.*;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		inputstreamread();
		readFile();		
	}

	private static void inputstreamread() throws IOException {
		System.out.println("--------Paragraph .. end with Exit------------");
		InputStreamReader IR = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(IR);
	/*	int age = Integer.parseInt(BR.readLine());
		System.out.println("---Buffered reader integer"); */
		String name;
		while ((name = BR.readLine()) != null) {
			if (name.equals("exit")) {
				break;
			}
		}
		System.out.println("---Buffered reader ended - readLine");
		
	}

	public static void readFile() throws IOException {
		FileReader FR = new FileReader("H:\\git\\IApp\\VoterList.txt");
		BufferedReader BR = new BufferedReader(FR);
		String name = BR.readLine();
		System.out.println("name : " + name);
			
	}

}
