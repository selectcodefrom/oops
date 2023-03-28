class Class1{
    Class1(){
        System.out.println("Base class constructor-static-"+sta+" "+at);
    }
    static int sta=100;
    public int at=200;
    public int attr1;
    private int attr2;
    protected int attr3;
    public void method1(){
     System.out.println("public-method1-"+attr1);   
    }
     private void method2(){
     System.out.println("public-method1-"+attr2);   
    }
     public void forprivate(int attr2){
        this.attr2=attr2; 
        method2();
     }
      protected void method3(){
     System.out.println("public-method1-"+attr3);   
    }
}
class Class2 extends Class1{
    Class2(){
        System.out.println("sub class constructor-"+sta1+" "+at1);
    }
    static int sta1=200;
    public int at1=100;
    public void method1(){
        System.out.println("over-riding-method1-"+at1);
    }
}
public class Single {
   public static void main(String[] args){
    System.out.println("Single");
       Class1 obj1 =new Class1();
       Class2 obj2 = new Class2();
       obj1.attr1=10;
       obj2.method1();
       //obj1.method4();
       obj2.attr1=10;
       obj2.method1();
       //obj2.attr2=20;
       //obj2.method2();
       obj2.forprivate(20);
       obj2.attr3=30;
       obj2.method3();
   }  
}
