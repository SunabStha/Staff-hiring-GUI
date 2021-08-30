/*Making GUI of FullTimeStaffHire and its function */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class FullTimeStaffHireGUI implements ActionListener{
    private JFrame frame;
    private JLabel label;
    private JLabel staff_name,designation,job_Type,salary,working_Hour,vacancyNumberlbl;
    private JTextField staff_nameField,vacancyNumberField,working_HourField,designationField,job_TypeField,salaryField;
    private JLabel staff_namelbl, joining_Date,qualification,appointed_By,vacancyNumberlbl2;
    private JTextField staff_nameField1,vacancyNumberField1,joining_DateField,qualificationField,appointed_ByField;
    private JButton btnAppoint;
    private JButton btnDisplay;
    private JButton btnClear;
    private JButton btnFullTime;
    
    /* Method containing GUI */
    public FullTimeStaffHireGUI(){
        frame = new JFrame();
        
        label = new JLabel("Full Time Staff Hire");
        label.setBounds(350, 10, 200, 30);
        frame.add(label);
        
        addVacancyFull();
        addAppointForVacancy();
        buttons();
        
        frame.setSize(950, 750);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    /* GUI of addVacancyFull*/
    public void addVacancyFull() {
        staff_name = new JLabel("Staff Name : ");
        staff_name.setBounds(20, 120, 90, 30);
        frame.add(staff_name);

        staff_nameField = new JTextField();
        staff_nameField.setBounds(150, 120, 100, 30);
        frame.add(staff_nameField);
        
        vacancyNumberlbl = new JLabel("Vacancy Number:");
        vacancyNumberlbl.setBounds(20, 60, 100, 30);
        frame.add(vacancyNumberlbl);
        
        vacancyNumberField = new JTextField();
        vacancyNumberField.setBounds(150, 60, 100, 30);
        frame.add(vacancyNumberField);
        
        designation = new JLabel("Designation : ");
        designation.setBounds(20, 180, 100, 30);
        frame.add(designation);

        designationField = new JTextField();
        designationField.setBounds(150, 180, 100, 30);
        frame.add(designationField);

        job_Type = new JLabel("Job Type: ");
        job_Type.setBounds(20, 240, 100, 30);
        frame.add(job_Type);

        job_TypeField = new JTextField();
        job_TypeField.setBounds(150, 240, 100, 30);
        frame.add(job_TypeField);

        salary = new JLabel("Salary:");
        salary.setBounds(20, 300, 100, 30);
        frame.add(salary);

        salaryField = new JTextField();
        salaryField.setBounds(150, 300, 100, 30);
        frame.add(salaryField);

        working_Hour = new JLabel("Working Hour:");
        working_Hour.setBounds(20, 360, 100, 30);
        frame.add(working_Hour);

        working_HourField = new JTextField();
        working_HourField.setBounds(150, 360, 100, 30);
        frame.add(working_HourField);
        
    }
    /*GUI of addAppointForVacancy*/
    public void addAppointForVacancy(){
        staff_namelbl = new JLabel("Staff Name:");
        staff_namelbl.setBounds(500, 120, 100, 30);
        frame.add(staff_namelbl);

        staff_nameField1 = new JTextField();
        staff_nameField1.setBounds(610, 120, 100, 30);
        frame.add(staff_nameField1);
        
        vacancyNumberlbl2 = new JLabel("Vacancy Number:");
        vacancyNumberlbl2.setBounds(500, 60, 100, 30);
        frame.add(vacancyNumberlbl2);

        vacancyNumberField1 = new JTextField();
        vacancyNumberField1.setBounds(610, 60, 100, 30);
        frame.add(vacancyNumberField1);

        joining_Date = new JLabel("Joining Date");
        joining_Date.setBounds(500, 180, 100, 30);
        frame.add(joining_Date);

        joining_DateField = new JTextField();
        joining_DateField.setBounds(610,180, 100, 30);
        frame.add(joining_DateField);

        qualification = new JLabel("Qualification: ");
        qualification.setBounds(500, 240, 100, 30);
        frame.add(qualification);

        qualificationField = new JTextField();
        qualificationField.setBounds(610, 240, 100, 30);
        frame.add(qualificationField);

        appointed_By = new JLabel("Appointed By: ");
        appointed_By.setBounds(500, 300, 100, 30);
        frame.add(appointed_By);

        appointed_ByField = new JTextField();
        appointed_ByField.setBounds(610, 300, 100, 30);
        frame.add(appointed_ByField);      
       
    }
    /*GUI of Buttons*/
    public void buttons() {
        btnFullTime = new JButton("Add Full Time Staff");
        btnFullTime.setBounds(20, 480, 200, 50);
        btnFullTime.addActionListener(this);
        frame.add(btnFullTime);
        
        btnAppoint = new JButton("Appoint");
        btnAppoint.setBounds(620, 480, 200, 50);
        btnAppoint.addActionListener(this);
        frame.add(btnAppoint);

        btnClear = new JButton("Clear");
        btnClear.setBounds(150, 600, 140, 45);
        btnClear.addActionListener(this);
        frame.add(btnClear);

        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(350, 600, 160, 45);
        btnDisplay.addActionListener(this);
        frame.add(btnDisplay);
    }
    /* get method of Staff Name */
    public String getstaff_name(){
        return staff_nameField.getText();
    }
    /* get method of Vacancy Number */ 
    public int getVacancyNumberlbl() {
        int vacancyNumberInt = 0;
        try {
            vacancyNumberInt = Integer.parseInt(vacancyNumberField.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please give a valid interger in Vacancy Number","Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return vacancyNumberInt;
    }
    /* get method of designation */
    public String getDesignation(){
        return designationField.getText();
    }
    /* get method of job type */
    public String getJob_Type(){
        return job_TypeField.getText();
    }
    /* get method of Salary*/
    public int getSalary() {
        int salaryInt = 0;
        try {
            salaryInt = Integer.parseInt(salaryField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please give a valid interger in Salary","Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return salaryInt;
    }
    /* get method of working hour */
    public int getWorking_Hour(){
        int working_HourInt=0;
        try{
            working_HourInt = Integer.parseInt(working_HourField.getText());
        
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame,"Please give a valid interger in Working Hour","Error",
             JOptionPane.ERROR_MESSAGE);
        }
        return working_HourInt;
    }
    /* get method of Staff Name1 */
    public String getStaff_Name1() {
        return staff_nameField1.getText();
    }
    /* get method of Vacancy Number 2 */
    public int getVacancyNumberlbl2() {
        int vacancyNumberlbl2Int = 0;
        try {
            vacancyNumberlbl2Int = Integer.parseInt(vacancyNumberField1.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Enter a valid int", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return vacancyNumberlbl2Int;

    }
    /* get method of Joining date */
    public String getJoining_Date() {
        return joining_DateField.getText();
    }
    /* get method of qualification */
    public String getQualification() {
        return qualificationField.getText();
    }
    /* get method of appointed by */
    public String getAppointed_By() {
        return appointed_ByField.getText();
    }
    /* Fucntion of addFullTime Buttion*/
    public void addFullTime(){
            int vno = getVacancyNumberlbl();
            int salary = getSalary();
            int working_Hour = getWorking_Hour();
            String job_Type = getJob_Type();
            String desgination = getDesignation();
            boolean vNum1 = false;
            if (vno > 0 && salary > 0 && working_Hour > 0 && !job_Type.equals("") && !desgination.equals("")) {
               for (StaffHire duplicate : INGNepal.list) {
                   if (duplicate.getVacancyNumber() == vno) {
                        vNum1 = true;
                        JOptionPane.showMessageDialog(frame,
                                "Staff has been already added. Please try a different vacancy number.", "Invalid Input",
                                JOptionPane.ERROR_MESSAGE);
                        break;
                   }
               }
               if (!vNum1) {
                    INGNepal.list.add(new FullTimeStaffHire(desgination, job_Type, vno, salary, working_Hour));
                    JOptionPane.showMessageDialog(frame, "Thank You! " + getstaff_name()
                            + " Your information is being saved. (" + INGNepal.list.size() + ")", "Thank You",
                            JOptionPane.INFORMATION_MESSAGE);
               }
            }
    }
    /* Fucntion of appointFullTime Buttion*/
    public void appointFullTime(){
            int vno=getVacancyNumberlbl2();
            String staffName=getStaff_Name1();
            String joinDate=getJoining_Date();
            String Qualification=getQualification();
            String appointedBy=getAppointed_By();
            boolean vNum=false;
            for(StaffHire obj:INGNepal.list){
                if(obj.getVacancyNumber()==vno){
                    vNum=true;
                    if(obj instanceof FullTimeStaffHire){
                        FullTimeStaffHire p=(FullTimeStaffHire)obj;
                        if(p.getJoined()==true){
                            JOptionPane.showMessageDialog(frame,"Sorry! Staff has been already hired");
                        }else{
                           p.hireFullTimeStaff(staffName,joinDate,Qualification,appointedBy);
                          JOptionPane.showMessageDialog(frame,"Staff has been hired!");
                          break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(frame,"not for fulltime staff Hire");
                        break;
                    }
                }             
            }
            if(!vNum){
                    JOptionPane.showMessageDialog(frame,"invalid vacancy");
                    
            }   
    }
    /* Fucntion of clearPartTime Buttion*/  
    public void clearPartTime(){
           staff_nameField.setText(null);
           staff_nameField1.setText(null);
           vacancyNumberField.setText(null);
           vacancyNumberField1.setText(null);
           designationField.setText(null);
           job_TypeField.setText(null);
           salaryField.setText(null);
           working_HourField.setText(null);
           joining_DateField.setText(null);
           qualificationField.setText(null);
           appointed_ByField.setText(null);
    }
    /* Fucntion of displayFullTime Buttion*/  
    public void displayFullTime(){
           if(INGNepal.list.isEmpty()){
                   JOptionPane.showMessageDialog(frame, "Fill the field which are required ", "Error",
                   JOptionPane.ERROR_MESSAGE);
           
           }else{
                   for (StaffHire obj: INGNepal.list){
                           ((FullTimeStaffHire) obj).display();
                   
                   }
           }
    }
    /* Main Method*/  
    public static void main (String[] args){
       new FullTimeStaffHireGUI();
    }
    /*Abstract Method*/
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnFullTime){
               addFullTime();
        }else if(e.getSource() == btnAppoint){
               appointFullTime();
        }else if(e.getSource() == btnDisplay){
               displayFullTime();
        }else if(e.getSource() == btnClear){
               clearPartTime();
        }
     }
}

