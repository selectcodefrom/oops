import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fr
{	
	static void replace(String filePath, String oldString, String newString)
	{
		File fileToBeModified = new File(filePath);
		String oldContent = "";
		try 
		{
			BufferedReader reader = new BufferedReader(new FileReader(fileToBeModified));
			
			//Reading all the lines of input text file into oldContent
			
			String line = reader.readLine();
			
			while (line != null) 
			{
				oldContent = oldContent + line + System.lineSeparator();
				System.out.println(oldContent);
				line = reader.readLine();
			}
			
			//Replacing oldString with newString in the oldContent
			
			String newContent = oldContent.replaceAll(oldString, newString);
			
			//Rewriting the input text file with newContent
			
			FileWriter writer = new FileWriter(fileToBeModified);
			
			writer.write(newContent);
      writer.close();
				reader.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args)
	{

		replace("input", "eee", "1234");
		System.out.println("done");
	}
}