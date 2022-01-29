import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author noah.miller
*/


public class  TuitionGUI extends JFrame 
{
    JFrame TuitionGUIObject;
    private final JPanel     panelOne;
    private final JPanel     panelTwo;
    
    private final JLabel     messageLabelOne;
    private final JTextField textFullTimePartTime;
    
    private final JLabel     messageLabelTwo;
    private final JTextField textresidentStatus;
    
    private final JLabel     messageLabelThree;
    private final JTextField textstudentNumber;
    
    private final JLabel     messageLabelFour;
    private final JTextField textstudentFirstName;
    
    private final JLabel     messageLabelFive;
    private final JTextField textstudentLastName;
    
    private final JLabel     messageLabelSix;
    private final JTextField textstreetAddress;
    
    private final JLabel     messageLabelSeven;
    private final JTextField textcityName;
    
    private final JLabel     messageLabelEight;
    private final JTextField textzipCode;
    
    private final JLabel     messageLabelNine;
    private final JTextField textstudentPhoneNumber;
    
    private final JLabel     messageLabelTen;
    private final JTextField textstudentEmailAddress;
    
    private final JLabel     messageLabelEleven;
    private final JTextField textgender;
    
    private final JLabel     messageLabeltwelve;
    private final JTextField textdateOfBirth;
    
    private final JLabel     messageLabelthirteen;
    private final JTextField textnumberOfCredits;
    
  
    
    private final JButton    tuitionButton;
    private final JButton    exitButton;
    
    private final int  WINDOW_WIDTH  = 1000;
    private final int  WINDOW_HEIGHT = 1000;

    public  TuitionGUI() 
    {
        panelOne = new JPanel();
        panelOne.setLayout(new GridLayout(20,1));
        //add price 
          
        messageLabelOne = new JLabel("Please enter full or part time f = fulltime pt = part time");
        textFullTimePartTime = new JTextField(1);
        panelOne.add(messageLabelOne);
        panelOne.add(textFullTimePartTime);
        
        messageLabelTwo = new JLabel("Please enter resident status c = county oc = out of county os = out of state ");
        textresidentStatus   = new JTextField(1);
        panelOne.add(messageLabelTwo);
        panelOne.add(textresidentStatus);
        
        messageLabelThree = new JLabel("Please enter your student number");
        textstudentNumber  = new JTextField(1);
        panelOne.add(messageLabelThree);
        panelOne.add(textstudentNumber);
        
        messageLabelFour = new JLabel("Please enter your first name");
        textstudentFirstName  = new JTextField(1);
        panelOne.add(messageLabelFour);
        panelOne.add(textstudentFirstName );
        
        messageLabelFive = new JLabel("Please enter your last name");
        textstudentLastName  = new JTextField(1);
        panelOne.add(messageLabelFive);
        panelOne.add(textstudentLastName);
        
        messageLabelSix = new JLabel("Please enter your street address");
        textstreetAddress  = new JTextField(1);
         panelOne.add(messageLabelSix);
        panelOne.add(textstreetAddress);
        
        messageLabelSeven = new JLabel("Please enter your city name");
        textcityName  = new JTextField(1);
        panelOne.add(messageLabelSeven);
        panelOne.add(textcityName);
    
        messageLabelEight = new JLabel("Please enter your zip code");
        textzipCode  = new JTextField(1);
        panelOne.add(messageLabelEight);
        panelOne.add(textzipCode );
    
        messageLabelNine = new JLabel("Please enter your phone number");
        textstudentPhoneNumber  = new JTextField(1);
        panelOne.add(messageLabelNine);
        panelOne.add(textstudentPhoneNumber );
    
        messageLabelTen = new JLabel("Please enter your email address");
        textstudentEmailAddress  = new JTextField(1);
        panelOne.add(messageLabelTen);
        panelOne.add(textstudentEmailAddress );
    
        messageLabelEleven  = new JLabel("Please enter your gender");
        textgender  = new JTextField(1);
        panelOne.add( messageLabelEleven);
        panelOne.add(textgender );
    
        messageLabeltwelve = new JLabel("Please enter your date of birth");
        textdateOfBirth  = new JTextField(1);
        panelOne.add(messageLabeltwelve);
        panelOne.add(textdateOfBirth );
    
        messageLabelthirteen = new JLabel("Please enter your number of credits");
        textnumberOfCredits  = new JTextField(1);
        panelOne.add(messageLabelthirteen);
        panelOne.add(textnumberOfCredits );
    
      
    
       
        
        panelTwo = new JPanel();
        panelTwo.setLayout(new GridLayout(1,2));
        
        tuitionButton = new JButton("Calculate");
        tuitionButton.addActionListener(new TuitionButtonListener());

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonListener());
        
        panelTwo.add(tuitionButton);
        panelTwo.add(exitButton);
        
        TuitionGUIObject = new JFrame();
        TuitionGUIObject.setLayout(new FlowLayout());
        TuitionGUIObject.setTitle("CurrentProductInventory");
        TuitionGUIObject.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        TuitionGUIObject.add(panelOne);
        TuitionGUIObject.add(panelTwo);
        TuitionGUIObject.setVisible(true);
    }

    
    
    private class TuitionButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String fullTimePartTime = (textFullTimePartTime.getText());
            String residentStatus= (textresidentStatus.getText());
            String studentNumber= (textstudentNumber.getText());
            String studentFirstName= (textstudentFirstName.getText());
            String studentLastName = (textstudentLastName.getText());
            String streetAddress = (textstreetAddress.getText());
            String cityName = (textcityName.getText());
            String zipCode = (textzipCode.getText());
            String studentPhoneNumber = (textstudentPhoneNumber.getText());
            String studentEmailAddress = (textstudentEmailAddress.getText());
            String gender = (textgender.getText());
            String dateOfBirth = (textdateOfBirth.getText());
            int numberOfCredits = Integer.parseInt(textnumberOfCredits.getText());
            
            
          
              
           


            switch (fullTimePartTime) {
                case "f":
                    FullTimeStudent  TuitionFullTimeObject= new FullTimeStudent
                               (  fullTimePartTime,
                                       residentStatus,
                                       studentNumber,
                                       studentFirstName,
                                       studentLastName,
                                       streetAddress,
                                       cityName,
                                       zipCode,
                                       studentPhoneNumber,
                                       studentEmailAddress,
                                       gender,
                                       dateOfBirth,
                                       numberOfCredits );
                    displayTuition(TuitionFullTimeObject);
                    break;
                case "pt":
                    //
                    PartTimeStudent TuitionPartTimeObject = new PartTimeStudent
                                     ( fullTimePartTime,
                                             residentStatus,
                                             studentNumber,
                                             studentFirstName,
                                             studentLastName,
                                             streetAddress,
                                             cityName,
                                             zipCode,
                                             studentPhoneNumber,
                                             studentEmailAddress,
                                             gender,
                                             dateOfBirth,
                                             numberOfCredits  );
                    displayTuition(TuitionPartTimeObject);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"error");
                    break;
            }
            //
              
                
         
        }
         
    }

       
    
    private class ExitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
              
      
           TuitionGUIObject.setVisible(false);
                     System.exit(0);
        }        
    }
    
    
  public void displayTuition(TuitionInformationSystem TuitionObject){
    
  JOptionPane.showMessageDialog(null,"Tuition Cost" 
          + "\nTotal Tuition Cost  "+TuitionObject.getTuitionCost() 
          +"\nTotal Fee Cost  " + TuitionObject.getTotalFeeCost()
          +"\nCapital Fee Cost  " + TuitionObject.getCapitalFee()
          +"\nCollege Fee  " + TuitionObject.getcollegeFee()
          +"\nMalpratice Insurance Fee  "+TuitionObject.getMalpraticeInsuranceFee()
          +"\nAccident Insurance Fee  " + TuitionObject.getAccidentInsuranceFee()
          +"\nStudent Service Fee  "+TuitionObject.getStudentServiceFee()
          +"\n"
          +"\n"
          +"\nStudent Name  "+TuitionObject.getStudentFirstName()+" "+TuitionObject.getStudentLastName()
          +"\nStudent Number  "+TuitionObject.getStudentNumber()
          +"\nStudent Gender  "+TuitionObject.getGender()
          +"\nStudent Date of Birth  "+TuitionObject.getDateOfBirth()
          +"\nStudent Email  "+TuitionObject.getEmailAddress()
          +"\nStudent Phone Number  "+TuitionObject.getStudentPhoneNumber()
          +"\nAddress"+TuitionObject.getStreetAddress()
          +"\nCity Name  "+TuitionObject.getCityName()
          +"\nZip Code  "+TuitionObject.getZipCode()
          +"\nResident Status  "+TuitionObject.getResidentStatus()
          +"\nNumber of Credits  "+TuitionObject.getNumberOfCredits()          
          
          
  );
  }
  
  

     public static void main(String[] args)
         {
             TuitionGUI TuitionGUIObject = new TuitionGUI();
             
         }


}



