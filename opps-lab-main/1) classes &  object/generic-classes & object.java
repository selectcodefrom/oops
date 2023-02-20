class class1{
  public int attr1; //declared as public
  private int attr2; //declared as private
  protected int attr3; //declared as protected
  //declare method1 as public
  public void method1(){
    System.out.println("method1  " + attr1);
  }
  //declare method2 as private
  private void method2(){
  System.out.println("method2  " + attr2);
  }
  //declare setAttr2 method for assign a value for private attr2,it is only way to assign a value for private attribute. 
  public void setAttr2(int set){
    attr2=set;
  }
  //declare getAttr2 method for getting a value of private attr2,it is only way to get a value of private attribute.
  public int getMethod2(){
    return attr2;
  }
  protected void method3(){
  System.out.println("method3  " + attr3);
  }
}
public class Main{
  public static void main(String[] args){
    class1 a = new class1();
    
  a.attr1 = 10;
  a.method1();
  //a.attr2=20;
  //a.method2();
  a.setAttr2(20);
  a.getMethod2();
  a.attr3 = 30;
  a.method3();

  }

}