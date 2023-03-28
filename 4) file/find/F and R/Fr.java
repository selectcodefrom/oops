import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
				line = reader.readLine();
			}		//Replacing oldString with newString in the oldContent
			String newContent = oldContent.replaceAll(oldString, newString);
			//Rewriting the input text file with newContent
			FileWriter writer = new FileWriter(fileToBeModified);
			writer.write(newContent);
      writer.close();
				reader.close();
				System.out.println("Replace done");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String source =scan.next();
		System.out.print("Enter the word to be search: ");
		String input=scan.next(); // Input word to be searched
		File f1=new File(source); //Creation of File Descriptor for input file
		String[] words=null;  //Intialize the word Array
		FileReader fr = new FileReader(f1);  //Creation of File Reader object
		BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
		String s;     
		int count=0;   //Intialize the word to zero
		while((s=br.readLine())!=null)   //Reading Content from the file
		{
			 words=s.split(" ");  //Split the word using space
				for (String word : words) 
				{
							 if (word.equals(input))   //Search for the given word
							 {
								 count++;    //If Present increase the count by one
							 }
				}
		}
		if(count!=0)  //Check for count not equal to zero
		{
			 System.out.println("The given word is present for "+count+ " Times in the file");
			 System.out.print("Do you want to replace(y/n): ");
			 char ch = scan.next().charAt(0);
			 if(ch=='y' || ch=='Y'){
				System.out.print("Enter the word to be replace: ");
				String rpl=scan.next();
				replace(source, input,rpl);
			 }
		}
		else
		{
			 System.out.println("The given word is not present in the file");
		}
		fr.close();
	}
}