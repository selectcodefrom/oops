class class1{
    class1(){
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
     System.out.println("public-method2-"+attr2);   
    }
     public void forprivate(int attr2){
        this.attr2=attr2; 
        method2();
     }
      protected void method3(){
     System.out.println("public-method3-"+attr3);   
    }
}
class class2 extends class1{
    class2(){
        System.out.println("class2 constructor-"+sta1+" "+at1);
    }
    static int sta1=200;
    public int at1=100;
    public void method1(){
        System.out.println("over-riding-method1-"+attr1);
    }
}
class class3 extends class2{
    class3(int attr4){
        this.attr4=attr4;
       System.out.println("class3 constructor"); 
    }
    private int attr4; 
    private void method4(){
        System.out.println("private-method4-"+attr4); 
    }
    public void  forpri(){
        method4();
    }
    
}
public class Multilevel {
   public static void main(String[] args){
    System.out.println("Multilevel inheritance");
       class1 obj1 =new class1();
       class3 obj3 = new class3(40);
       obj1.attr1=10;
       obj3.method1();
       obj3.attr1=10;
       obj3.method1();
       //obj2.attr2=20;
       //obj2.method2();
       obj3.forprivate(20);
       obj3.attr3=30;
       obj3.method3();
       obj3.forpri();
   }  
}
