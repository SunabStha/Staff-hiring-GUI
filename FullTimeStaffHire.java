/*Subclass of StaffHire*/
public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    /*Parameterized Constructor*/
    FullTimeStaffHire(String designation, String jobType, int vacancyNum, int salary, int workingHour){
        super(designation, jobType, vacancyNum);
        this.salary=salary;
        this.workingHour=workingHour;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;        
    }
    /*Acer Method For All attributes*/

    public int getWorkingHour() {
    return workingHour;
    }

    public int getSalary() {
    return salary;
    }   

    public String getStaffName() {
    return staffName;
    }

    public String getJoiningDate() {
    return joiningDate;
    }

    public String getQualification() {
    return qualification;
    }

    public String getAppointedBy() {
    return appointedBy;
    }
    
    public boolean getjoined(){
        return joined;
    }
    /*Method For Setting New Salary */
    public void salaryChanges(int salary){
        if(joined==true){
            System.out.println("Your Salary Cannot Be Changed.." );
        }
        else {
            this.salary=salary;  
            System.out.println("Your Salary Has Been Changed " );
	}
    }
    /*Method For Setting New Working Hour*/
    public void changeWorkingHour(int workingHour) {
        this.workingHour=workingHour; 
        System.out.println("Your Working Hour Has Been Changed " );
    }
    /*Method For Hiring Fulltime Staff*/
    public void hireFullTimeStaffs(String staffName, String joiningDate, String qualification, String appointedBy) {
        if(joined==false) {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            System.out.println("Thanks for the detail." );
        }
        else {            
            System.out.println(" You have been appointed." );
        }
    }
    /*Method For Showing The Details of The Staff*/
    public void display() {
        super.display();
    	System.out.println("Staff Name: " +staffName);
    	System.out.println("Salary: " +salary);
    	System.out.println("Working Hour: " +workingHour);    	
        System.out.println("Joining Date: " +joiningDate);
        System.out.println("Qualification: " +qualification);
        System.out.println("Appointed By: " +appointedBy);
        System.out.println("Joined:" +joined);
    }
    
}