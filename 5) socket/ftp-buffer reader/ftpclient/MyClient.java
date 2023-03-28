import java.net.*;  
import java.io.*;
import java.util.*;  
class MyClient{  
public static void main(String args[])throws Exception{  
  Scanner scan = new Scanner(System.in);
Socket s=new Socket("localhost",3333);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
String str="",recFile="";  
while(!str.equals("bye")){ 
  System.out.println("Enter your choice: \n1.send\n2.recive");
  int ch =scan.nextInt();
  switch (ch){
    case 1:String Content="";
            System.out.print("Enter the file name: ");
		       String filePath =scan.next();
           File file = new File(filePath);
           BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			while (line != null) 
			{
				Content = Content + line + System.lineSeparator();
				line = reader.readLine();
			}  
            dout.writeUTF(filePath);
            dout.writeUTF(Content);   
            dout.flush(); 
            break;
    case 2: recFile=din.readUTF();  
            Content=din.readUTF();   
            FileWriter writer = new FileWriter(recFile);
            writer.write(Content);
            writer.close(); 
            break;
    case 3:str="bye";
            break;
    default :System.out.println("invalid option"); 
            break;
  }


  
}  
  
dout.close();  
s.close();  
}}  