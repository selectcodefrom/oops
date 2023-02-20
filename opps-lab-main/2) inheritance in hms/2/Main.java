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
  class Patient extends Doctor{
    String patName;
    int patAge;
    private String patProb;
    Patient(String docName, String dept, int docExp,String patName,int patAge,String patProb) {
      super(docName, dept, docExp);
      this.patName=patName;
      this.patAge=patAge;
      this.patProb=patProb;
      
    }
    public void patDetails(){
      System.out.println("Patient details:\n"+patName +"\n" + patAge +"\n"+patProb+"\n"+hosName+"\nDoctor is:"+docName);
    }
  }
  public class Main{
  public static void main(String[] args){
   Patient d=new Patient("jhony","ortho",12,"Balan",22,"ortho");
   d.docDetails();
   d.patDetails();
  }
  }