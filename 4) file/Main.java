import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;  
import java.io.IOException;   
 class Main {  
               public static void main(String args[]) {  
                int ch=0;
                //String path="C:\\Users\\RAJU\\Desktop\\opps-lab-main\\4) file\\sample.txt";
                String fileName="sample.java";
                String directory=System.getProperty("user.dir");
                String path =directory+File.separator+fileName;
                Scanner scan =new Scanner(System.in);
                try { 
                File f = new File(path);
                do{
                  System.out.print("Enter the operation:");
                  ch=scan.nextInt();
                  switch(ch){

               case 1: 
                       if (f.createNewFile()) {  
                                  System.out.println("File " + f.getName() + " is created successfully.");  
                       } else {  
                                  System.out.println("File is already exist in the directory.");  
                       } break;
               case 2:
                
                FileWriter fw = new FileWriter(path);  
                if(f.canWrite()){
                fw.write("It first checks whether the file is writable or not.\nThen it write this content in this file...");   
                fw.close();   
                System.out.println("Content is successfully wrote to the file.");  
                }
                else{
                   System.out.println("This file un-writable");
                }break;
                case 3:  
                if(f.canRead()){   
                 Scanner dataReader = new Scanner(f);  
                 while (dataReader.hasNextLine()) {  
                 String fileData = dataReader.nextLine();  
                 System.out.println(fileData); 
                 } 
                 dataReader.close();
                 }
                 else{
                  System.out.println("This file un-readable");
                 }break;
                 case 4:
                 if (f.exists()) {  
                  System.out.println("The name of the file is: " + f.getName());             
                  System.out.println("The absolute path of the file is: " + f.getAbsolutePath()); 
                  System.out.println("Is file writeable?: " + f.canWrite());    
                  System.out.println("Is file readable " + f.canRead());    
                  System.out.println("The size of the file in bytes is: " + f.length());    
                 } 
                 else {  
                    System.out.println("The file does not exist.");  
                  }break;  
                 case 5:
                 if (f.delete()) {   
                  System.out.println(f.getName()+ " file is deleted successfully.");  
                } else {  
                  System.out.println("Unexpected error found in deletion of the file.");  
                } break;  

                }//switch
        }while(ch!=6); 
        scan.close();
      } //try
      catch (IOException e) {  
        System.out.println("Unexpected error occurred");  
        e.printStackTrace();  
        }  
    }
  }
