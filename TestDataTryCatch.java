	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class TestDataTryCatch {
	
		public static void main (String args[]){
		try {
			File text = new File("test.dat");
			
			Scanner scnr = new Scanner(text);
			
			while (scnr.hasNextLine()) {
				String line = scnr.nextLine();
					System.out.println(line);
			}
		    }
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}

