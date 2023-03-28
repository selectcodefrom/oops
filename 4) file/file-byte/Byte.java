import java.io.*;
import java.util.*;
public class Byte {
    public static void main(String args[]) throws Exception
    {   Scanner scan=new Scanner(System.in);
        
        String input,output,body;
        
        System.out.print("Enter the input file name: ");
        input = scan.next();
        System.out.print("Enter the output file name: ");
        output=scan.next();
        File in = new File(input);
        /*if(in.canWrite()){
        scan.nextLine();
        System.out.print("Enter the content: ");
        body =scan.nextLine();
        FileWriter fw =new FileWriter(input);
        fw.write(body);
        fw.close();
        }*/
        File out = new File(output);
        if(out.exists())
        {   System.out.println("This file already exist,do you want to replace:(y/n)");
            String ch=scan.next();
            if(ch=="y" || ch=="Y"){
            out.delete();
            }
             else if(ch=="n" || ch=="N"){
                return;
            }
        }
        out.createNewFile();
        DataInputStream din = new DataInputStream(new FileInputStream(in));
        DataOutputStream dout = new DataOutputStream(new FileOutputStream(out));
        
        long time = System.currentTimeMillis();
        int c = -1; 
while((c=din.read())!=-1)
{ 
    //System.out.println(c);
    dout.write(c);
}
      time = System.currentTimeMillis() - time;
      System.out.println("time:"+time);
      
}
}