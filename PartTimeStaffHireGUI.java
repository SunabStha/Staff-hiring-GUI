/* Making GUI of PartTimeStaffHire and its Function */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class PartTimeStaffHireGUI implements ActionListener{
    private JFrame frame;
    private JLabel label;
    private JLabel name,vacancyNumber1,designation,job_Type,wage,working_Hour,shift;
    private JTextField nameField,vacancyNumberField,working_HourField,designationField,job_TypeField,wageField,shiftField;
    private JLabel namelbl,vacancyNumberlbl,joining_Date,qualification,appointed_By;
    private JTextField nameField1,vacancyNumberField1,joining_DateField,qualificationField,appointed_ByField;
    private JButton btnAppoint;
    private JButton btnDisplay;
    private JButton btnClear;
    private JButton btnTerminate;
    private JButton btnPartTime;
    private JButton btnAdd;
    
    /* Method containing GUI */
    public PartTimeStaffHireGUI(){
        frame = new JFrame("Part Time Staff Hire");
        
        label = new JLabel("Part Time Staff ");
        label.setBounds(350, 10, 200, 30);
        frame.add(label);
        
        addVacancyPart();
        addAppointForVacancyPart();
        buttons();
        
        frame.setSize(950, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    /* GUI of addVacancyPart*/
    public void addVacancyPart() {
        name = new JLabel("Staff Name : ");
        name.setBounds(20, 120, 90, 30);
        frame.add(name);

        nameField = new JTextField();
        nameField.setBounds(150, 120, 100, 30);
        frame.add(nameField);
        
        vacancyNumber1 = new JLabel("Vacancy Number:");
        vacancyNumber1.setBounds(20, 60, 100, 30);
        frame.add(vacancyNumber1);
        
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

        wage = new JLabel("Wage:");
        wage.setBounds(20, 300, 100, 30);
        frame.add(wage);

        wageField = new JTextField();
        wageField.setBounds(150, 300, 100, 30);
        frame.add(wageField);

        working_Hour = new JLabel("Working Hour:");
        working_Hour.setBounds(20, 360, 100, 30);
        frame.add(working_Hour);

        working_HourField = new JTextField();
        working_HourField.setBounds(150, 360, 100, 30);
        frame.add(working_HourField);

        shift = new JLabel("Shift:");
        shift.setBounds(20, 420, 100, 30);
        frame.add(shift);

        shiftField = new JTextField();
        shiftField.setBounds(150, 420, 100, 30);
        frame.add(shiftField);
        
        
    }
    /*GUI of addAppointVacancyPart*/
    public void addAppointForVacancyPart(){
        namelbl = new JLabel("Staff Name:");
        namelbl.setBounds(500, 120, 100, 30);
        frame.add(namelbl);

        nameField1 = new JTextField();
        nameField1.setBounds(610, 120, 100, 30);
        frame.add(nameField1);
        
        vacancyNumberlbl = new JLabel("Vacancy Number:");
        vacancyNumberlbl.setBounds(500, 60, 100, 30);
        frame.add(vacancyNumberlbl);

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
        btnPartTime = new JButton("Part Time Staff");
        btnPartTime.setBounds(20, 480, 200, 50);
        btnPartTime.addActionListener(this);
        frame.add(btnPartTime);
        
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

        btnTerminate = new JButton("Terminate");
        btnTerminate.setBounds(550, 600, 160, 45);
        btnTerminate.addActionListener(this);
        frame.add(btnTerminate);
    }
    /* get method of Name */
    public String getName(){
        return nameField.getText();
    }
    /* get method of Vacancy Number*/
    public int getVacancyNumber1(){
        int vacancyNumberInt=0;
        try{
            vacancyNumberInt = Integer.parseInt(vacancyNumberField.getText());
        
        }
        catch(NumberFormatException e){
               JOptionPane.showMessageDialog(frame,"Please give a valid interger in Vacancy Number","Error",
               JOptionPane.ERROR_MESSAGE);
        
        }
        return vacancyNumberInt;
    }
    /*get method of designation*/
    public String getDesignation(){
        return designationField.getText();
    }
    /*get method of Job Type*/
    public String getJob_Type(){
        return job_TypeField.getText();
    }
    /*get method of wage*/
    public int getWage(){
        int wageInt=0;
        try{
            wageInt = Integer.parseInt(wageField.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame,"Please give a valid interger in Wage","Error",
             JOptionPane.ERROR_MESSAGE);
        }
        return wageInt;
    }
    /*get method of working hour*/
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
    /*get method of shift*/
    public String getShift(){
        return shiftField.getText();
    }
    /*get method of Staff Name*/
    public String getStaff_Name1(){
        return nameField1.getText();
    }
    /*get method of Vacancy Number 1*/
    public int getVacancyNumberlbl1(){
        int vacancyNumberlblInt=0;
        try{
            vacancyNumberlblInt = Integer.parseInt(vacancyNumberField1.getText());
        
        }
        catch(NumberFormatException e){
              JOptionPane.showMessageDialog(frame,"Please give a valid interger in Vacancy Number","Error",
                JOptionPane.ERROR_MESSAGE);
        
        }
        return vacancyNumberlblInt;
    }
    /*get method of Joining Date*/
    public String getJoining_Date(){
        return joining_DateField.getText();
    }
    /*get method of Qualification*/
    public String getQualification(){
        return qualificationField.getText();
    }
    /*get method of Appointed By*/
    public String getAppointed_By(){
        return appointed_ByField.getText();
    }
    
    /* Fucntion of addPartTime Buttion*/
    public void addPartTime(){
        int vno = getVacancyNumber1();
        int wage = getWage();
        int working_Hour = getWorking_Hour();
        String designation = getDesignation();
        String job_Type = getJob_Type();
        String shift = getShift();
        boolean vNum1 = false;
        if (vno > 0 && working_Hour > 0 && wage > 0 && !designation.equals("") && !job_Type.equals("")
                    && !shift.equals("")) {
            for (StaffHire duplicate : INGNepal.list) {
                    if (duplicate.getVacancyNumber() == vno) {
                        vNum1 = true;
                        JOptionPane.showMessageDialog(frame,
                                "Enter anither Vacancy number.It is already added.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        break;
                    }
            }
            if (!vNum1) {
                    INGNepal.list.add(new PartTimeStaffHire(designation, job_Type, vno, wage, working_Hour, shift));
                    JOptionPane.showMessageDialog(frame,
                            "Thank You " + getName() + " for the detail (" + INGNepal.list.size() + ")",
                            "Thank You", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    /* Fucntion of appointPartTime Buttion*/
    public void appointPartTime(){
                      int vno=Integer.parseInt(vacancyNumberField1.getText()); 
                      String staff_name=getStaff_Name1();
                      String joining_date=getJoining_Date();
                      String Qualification=getQualification();
                      String appointed_by=getAppointed_By();
                      boolean vNum=false;
                      if(vno>0){
                      for(StaffHire obj:INGNepal.list){
                          if(obj.getVacancyNumber() == vno){
                               vNum=true;
                               if(obj instanceof PartTimeStaffHire){
                                    PartTimeStaffHire p=(PartTimeStaffHire)obj;
                                    if(!p.getJoined()){
                                         p.hirePartTimeStaff(staff_name,joining_date,Qualification,appointed_by);
                                        JOptionPane.showMessageDialog(frame," Staff has been hired");
                                    }else{
                                      
                                      JOptionPane.showMessageDialog(frame,"Staff has been already hired!");
                                      break;
                                    }
                               }else{
                                   JOptionPane.showMessageDialog(frame,"It is not for fulltime staff Hire");
                                   break;
                               }
                          }             
                      }
                      if(!vNum){
                              JOptionPane.showMessageDialog(frame,"invalid vacancy","Error",
                              JOptionPane.ERROR_MESSAGE);
                              
                      }   
                 }
     }
    
    /* Fucntion of clearPartTime Buttion*/
    public void clearPartTime(){
           nameField.setText(null);
           nameField1.setText(null);
           vacancyNumberField.setText(null);
           vacancyNumberField1.setText(null);
           designationField.setText(null);
           job_TypeField.setText(null);
           wageField.setText(null);
           working_HourField.setText(null);
           shiftField.setText(null);
           joining_DateField.setText(null);
           qualificationField.setText(null);
           appointed_ByField.setText(null);
    }
    /* Fucntion of displayPartTime Buttion*/
    public void displayPartTime(){
           if(INGNepal.list.isEmpty()){
                   JOptionPane.showMessageDialog(frame, "Fill the field which are required ", "Error",
                   JOptionPane.ERROR_MESSAGE);
           
           }else{
                   for (StaffHire dis: INGNepal.list){
                           ((PartTimeStaffHire) dis).display();
                   
                   }
          }
    }
    /* Fucntion of terminatePartTime Buttion*/
    public void terminatePartTime() {
            boolean vNo = false;
            int vacancy = getVacancyNumber1();
            if (vacancy > 0) {
                for (StaffHire obj : INGNepal.list) {
                    if (obj.getVacancyNumber() == vacancy) {
                        vNo = true;
                        if (obj instanceof PartTimeStaffHire) {
                            PartTimeStaffHire p = (PartTimeStaffHire) obj;
                            if (!p.getTerminated()) {
                                p.staffTerminated();
                                JOptionPane.showMessageDialog(frame, "Staff has been terminated", "Done!",
                                        JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(frame,
                                        "Enter a valid vacancy number. Staff is already terminated",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "Invalid vacancy number. Not valid for termination",
                                    "Invalid", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                if (!vNo) {
                    JOptionPane.showMessageDialog(frame, "Staff is not hired. Enter another vacancy number.",
                            "Invalid", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    /* main method*/
    public static void main (String[] args){
       new PartTimeStaffHireGUI();
    }
    /* abstract Method */
    @Override
     public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnPartTime){
               addPartTime();
        }else if(e.getSource() == btnAppoint){
               appointPartTime();
        }else if(e.getSource() == btnDisplay){
               displayPartTime();
        }else if(e.getSource() == btnClear){
               clearPartTime();
        }else if(e.getSource() == btnTerminate){
               terminatePartTime(); 
            }
     }
}


   
 
    






