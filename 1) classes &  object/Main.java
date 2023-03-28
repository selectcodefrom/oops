import java.util.*;
public class Main{
  public static void main(String[] args){
    Addition ad=new Addition();
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the first number:");
    float a=scan.nextFloat();
    System.out.print("Enter the second number:");
    float b=scan.nextFloat();
    if(Math.floor(a)==a && Math.floor(b)==b){
      int x=(int) a;
      int y=(int) b;
      ad.add(x,y);
    }
    else{
      ad.add(a,b);
    }

  }
}
class Addition{
  Addition(){
    System.out.print("Additon of two number\n");
  }
  public void add(int x,int y){
    int z=x+y;
    System.out.print("int additon is:"+z);
  }
  public void add(float a,float b){
    float c=a+b;
    System.out.print("float additon is:"+c);
  }
}