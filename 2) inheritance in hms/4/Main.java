interface Hospital{
   String hosName="ABC Clinic";
   String dept="Child Specilist";

  }
 interface Doctor{
    String docName="Susila";
    int docExp=10;
    
   static void docDetails(String dept,String hosName){
    System.out.println("Doctor details:\n"+docName +"\n" + dept +"\n"+docExp+"\n"+hosName);
    }
    
  }
class Patient implements Hospital,Doctor{
    private String patName,prob;
    private int patAge;
    public  String docName;
    Patient(String patName,int patAge,String prob) {
      this.patName=patName;
      this.patAge=patAge;  
      this.prob=prob;  
      Doctor.docDetails(Hospital.dept,Hospital.hosName);  
    }
    public void patDetails(){
      
      System.out.println("Patient details:\n"+patName +"\n" + patAge +"\n"+prob+"\nDoctor is:"+Doctor.docName+"\n"+Hospital.dept +"\n"+hosName);
    }
  }
  public class Main{
  public static void main(String[] args){
   Patient p =new Patient("Balan",11,"Fever");
  
   p.patDetails();
  }
  }
