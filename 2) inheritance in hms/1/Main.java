class Hospital{
static String hosName="G.H";
public String dept;
   Hospital(String dept){
    this.dept=dept;
   }
}
class Doctor extends Hospital{
  String docName;
  int docExp;
  Doctor(String docName,String dept,int docExp) {
    super(dept);
    this.docName=docName;
    this.docExp=docExp;
  }
  public void docDetails(){
  System.out.println("Doctor details:\n"+docName +"\n" + dept +"\n"+docExp+"\n"+hosName);
  }
  
}
public class Main{
  Main(){
    System.out.println("main ");
  }
public static void main(String[] args){
 Doctor d=new Doctor("raju","ortho",21);
 d.docDetails();
}
}