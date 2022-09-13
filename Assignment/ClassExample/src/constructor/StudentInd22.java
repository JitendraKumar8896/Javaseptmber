package constructor;

public class StudentInd22 {
	private String rollNumber;
    private String name;
    private String standard;
    private int totalMarks;
    
    //default constructor
    public StudentInd22(){
        
    }
   
    
    public StudentInd22(String rollNumber, String name, String standard, int totalMarks){
        
      
        this.rollNumber = rollNumber;
        this.name = name;
        this.standard = standard;
        this.totalMarks = totalMarks;
    }
    
  
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    
    public String getRollNumber() {
        return rollNumber;
    }
     
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
   
    public void setStandard(String standard) {
        this.standard = standard;
    }
    
    
    public String getStandard() {
        return standard;
    }
    
   
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
    public int getTotalMarks() {
        return totalMarks;
    }
    


	
}
