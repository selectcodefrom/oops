interface Hospital{
  String hosName="ABC Clinic";
  String dept="Child Specilist";

 }
interface Doctor{
   String docName="Susila";
   int docExp=10;   
 }
class Patient implements Hospital,Doctor{
   public String patName,prob;
   public int patAge;
   public  String docName;
   Patient(String patName,int patAge,String prob) {
     this.patName=patName;
     this.patAge=patAge;  
     this.prob=prob;  
   }
   public void patDetails(){
     
     System.out.println("Patient details:\n"+patName +"\n" + patAge +"\n"+prob+"\nDoctor is:"+Doctor.docName+"\n"+Hospital.dept +"\n"+hosName);
   }
 }
 class Fee extends Patient{
  int fee;
  Fee(String patName, int patAge, String prob,int fee) {
    super(patName, patAge, prob);
    this.fee=fee;   
  }
  public void feeDetails(){
     
    System.out.println("Patient details:\n"+patName +"\n" + patAge +"\n"+prob+"\nDoctor is:"+Doctor.docName+"\n"+Hospital.dept +"\n"+hosName+"\nFees: "+fee);
  }
 }
 public class Main{
 public static void main(String[] args){
  Fee f =new Fee("Balan",11,"Fever",500);
 
  f.feeDetails();
 }
 }
