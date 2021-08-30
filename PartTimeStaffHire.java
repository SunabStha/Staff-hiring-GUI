/*Subclass of StaffHire*/
public class PartTimeStaffHire extends StaffHire {
    private int workingHour;
    private int wagePerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shift;
    private boolean joined;
    private boolean terminated;
    /*Parameterized Constructor*/
    PartTimeStaffHire(String designation, String jobType, int vacancyNum, int wagePerHour, int workingHour, String shift) {
        super(designation, jobType, vacancyNum);
        this.wagePerHour=wagePerHour;
        this.workingHour=workingHour;
        this.shift=shift;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
        terminated=false;
    }
    /*Acer Method For ach attributes*/
    public int getworkingHour() {
        return workingHour;
    }

    public int getwagePerHour() {
        return wagePerHour;
    }

    public String getstaffName() {
        return staffName;
    }

    public String getjoiningDate() {
        return joiningDate;
    }

    public String getqualification() {
        return qualification;
    }

    public String getappointedBy() {
        return appointedBy;
    }

    public String getshift() {
        return shift;
    }
    
    public boolean getjoined(){
        return joined;
    }
    public boolean getterminated() {
        return terminated;
    }
    /*Method To Change Staff Shift*/
    public void changeWorkingShift(String shifts){
        if(joined==true){
            System.out.println("Your Shift Cannot Be Changed..");
        }
        else {
            this.shift=shift;
            System.out.println("Your Has Been Changed. ");
        }
    }
    /*Method For Hiring Part Time staff*/
    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy) {
        if(joined==false){
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
            System.out.println("Thankyou For The Detail.");
        }
        else{
            System.out.println("Name Has Already Been Changed" );
        }
    }
    /*Method to terminate the Staffs*/
    public void staffTerminate() {
        if(terminated==true) {
            System.out.println("Staff has been terminated");
        }
        else {
            staffName="";
            joiningDate="";
            qualification="";
            joined=false;
            terminated=true;
            System.out.println("Staff has been terminated");
        }
    }
    /*Method For Showing the Details of Part Time Staffs*/
    public void display() {
            super.display();
            if(joined==true) {
                System.out.println("Staff Name: " +staffName);
                System.out.println("Wages per Hour: " +wagePerHour);
                System.out.println("Working Hour: " +workingHour);
                System.out.println("Date of Joining: " +joiningDate);
                System.out.println("Qualification: " +qualification);
                System.out.println("Appointed By: " +appointedBy);
                System.out.println("Income Per Day: " +wagePerHour * +workingHour);
                System.out.println("Joined:" +joined);
            }
    }
}

    
