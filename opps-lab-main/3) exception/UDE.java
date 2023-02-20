class UserDefine extends Exception  
{  
  UserDefine(String msg){
       super(msg);     
  }
}  
    
public class UDE  
{  
    
    public static void main(String args[])  
    {  
        try  
        {  
             
            throw new UserDefine("User define exception using exception class");  
        }  
        catch (UserDefine ex)  
        {  
            System.out.println("Caught the exception");  
            ex.printStackTrace(); 
        }  
  
        System.out.println("thank you");    
    }  
}  