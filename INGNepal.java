/* Making GUI of INGNepal */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.util.ArrayList;

public class INGNepal implements ActionListener{
    private JFrame frame;
    private JButton btnPartTimeStaffHire;
    private JButton btnFullTimeStaffHire;
    private JButton btnDisplay;
    public static ArrayList<StaffHire> list = new ArrayList<StaffHire>();
    
    /* GUI of INGNepal */
    public INGNepal(){
        frame=new JFrame();
        
        diffPart();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 450);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    /* GUI components */
    public void diffPart(){
    
        btnPartTimeStaffHire = new JButton("Part Time Staff Hire");
        btnPartTimeStaffHire.setBounds(100, 30, 450, 50);
        btnPartTimeStaffHire.addActionListener(this);
        frame.add(btnPartTimeStaffHire);
        
        btnFullTimeStaffHire = new JButton("Full Time Staff Hire");
        btnFullTimeStaffHire.setBounds(100, 150, 450, 50);
        btnFullTimeStaffHire.addActionListener(this);
        frame.add(btnFullTimeStaffHire);
        
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(200, 250, 250, 40);
        btnDisplay.addActionListener(this);
        frame.add(btnDisplay);
    }
    /* Main Method */
    public static void main(String[]args){
        new INGNepal();
    
    }
    /* Method to show function od display buttom*/
    
    public void displayINGNepal() {
        for (StaffHire obj : list) {
            if (obj instanceof PartTimeStaffHire) {
                System.out.println("Part Time Detail:");
                ((PartTimeStaffHire) obj).display();
            } else if (obj instanceof FullTimeStaffHire) {
                System.out.println("________________________________________________________");
                System.out.println("Full Time Detail:");
                ((FullTimeStaffHire) obj).display();
            }
        }
    }
    /* Abstract Method */
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnPartTimeStaffHire){
            new PartTimeStaffHireGUI();
        }
        else if (e.getSource() == btnFullTimeStaffHire){
            new FullTimeStaffHireGUI();
        }
        else if (e.getSource() == btnDisplay){
            displayINGNepal();
        }
    }
}