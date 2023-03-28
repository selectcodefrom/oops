class Hospital{
  protected String hosName="G.H";
  public String dept;
     Hospital(String dept){
      this.dept=dept;
     }
  }
class Doctor extends Hospital{
    String docName;
    private int docExp;
    Doctor(String docName,String dept,int docExp) {
      super(dept);
      this.docName=docName;
      this.docExp=docExp;
    }
    public void docDetails(){
    System.out.println("Doctor details:\n"+docName +"\n" + dept +"\n"+docExp+"\n"+hosName);
    }
    
  }
class Patient extends Hospital{
    private String patName;
    private int patAge;
    public  String docName;
    Patient(String patName,int patAge,String dept,String docName) {
      super(dept);
      this.patName=patName;
      this.patAge=patAge; 
      this.docName=docName;     
    }
    public void patDetails(){
      System.out.println("Patient details:\n"+patName +"\n" + patAge +"\n"+hosName+"\nDoctor is:"+docName);
    }
  }
  public class Main{
  public static void main(String[] args){
   Doctor d =new Doctor("jhony","ortho",12);
   Patient p =new Patient("Balan",22,"ortho",d.docName);
   d.docDetails();
   p.patDetails();
  }
  }
