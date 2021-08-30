/*Parent Class*/
public class StaffHire{
    /*Instance Variables*/
    private String designation;
    private String jobType;
    private int vacancyNum;
    /*Parameterized Constructor*/
    StaffHire(String designation, String jobType, int vacancyNum){
        this.designation=designation;
        this.jobType=jobType;
        this.vacancyNum=vacancyNum;
    }
    /*Acer Method For Each Attributes*/
    void setdesignation(String designation){
        this.designation=designation;
    }
    void setjobType( String jobType){
        this.jobType=jobType;
    }
    void setvacancyNumber(int vacancyNumber){
        this.vacancyNum=vacancyNum;
    }
    String getdesignation(){
        return designation;
    }
    String getjobType(){
        return jobType;
    }
    int getvacancyNum(){
        return vacancyNum;
    }
    /*Method For Showing Information*/
    void display(){
        System.out.println("Designation: " +designation);
        System.out.println("Job Type: " +jobType);
        System.out.println("Vacancy Num: " +vacancyNum);
    }
}