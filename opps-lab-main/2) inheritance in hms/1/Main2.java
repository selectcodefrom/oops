class Hospital{
  static String hosName="G.H";
  public String dept[]={"ortho","heart"};
  public String docDept="";
     Hospital(String dept){
      if(dept==this.dept[1]){
         docDept=this.dept[1];
      }
      else if(dept==this.dept[2]){
        docDept=this.dept[2];
     }
     else{
      docDept="enter valid dept";
     }
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
    System.out.println("Doctor details:\n"+docName +"\n" + docDept +"\n"+docExp+"\n"+hosName);
    }
    
  }
 
  public class Main2{
  public static void main(String[] args){
   Doctor d=new Doctor("raju","dgsdt",21);
   d.docDetails();
  }
  }
