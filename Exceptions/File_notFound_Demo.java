import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
class File_notFound_Demo { 

	public static void main(String args[]) { 
		try { 
			File file = new File("E://file.txt"); 
			FileReader fr = new FileReader(file); 
		} catch (FileNotFoundException e) 
		{ 
		System.out.println("File does not exist"); 
		} 
	} 
} 
