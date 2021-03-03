import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileNotFound {

	public static void main (String args[]) throws FileNotFoundException{
		File text = new File("test.dat");
		
		Scanner scnr = new Scanner(text);
		
		while (scnr.hasNextLine()) {
			String line = scnr.nextLine();
				System.out.println(line);
		}
	}
}
