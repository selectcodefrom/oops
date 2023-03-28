import java.net.*;
import java.util.Scanner;
import java.io.*;  
class MyServer{  
public static void main(String args[])throws Exception{  
  Scanner scan = new Scanner(System.in);
ServerSocket ss=new ServerSocket(3333);  
Socket s=ss.accept();  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",recFile="",Content="";  
while(!str.equals("bye")){
  System.out.println("Enter your choice: \n1.send\n2.recive");
  int ch =scan.nextInt();
  switch (ch){
    case 1:
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
            System.out.println("client says: "+str);
            Content=din.readUTF();  
            System.out.println("client says: "+str); 
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
din.close();  
s.close();  
ss.close();  
}}  