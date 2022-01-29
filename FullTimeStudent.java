
import javax.swing.JOptionPane;


/**
 *
 * @author noah miller
 */
public class FullTimeStudent extends TuitionInformationSystem {
  
    protected float  TuitionCost;
    protected float  TotalFeeCost;
    protected float  capitalFee;
    protected float  collegeFee;
    protected float MalpraticeInsuranceFee;
    protected float AccidentInsuranceFee;
    protected float StudentServiceFee;
    
    private final float   TUITION_COST_IN_COUNTY   =  1650.00f;
    private final float   TUITION_COST_IN_STATE       =   3300.00f;
    private final float   TUITION_COST_OUT_OF_STATE    = 4950.00f;//all flat rates
    private final float   CAPITAL_FEE_IN_COUNTY   =  0.00f;
    private final float   CAPITAL_FEE_IN_STATE       =   78.00f;
    private final float   CAPITAL_FEE_OUT_OF_STATE    = 85.00f;
    private final float   COLLEGE_FEE  =   72.00f; //
    private final float   MALPRATICE_INSURANCE_FEE   =  7.70f;//
    private final float   ACCIDENT_INSURANCE_FEE       =   5.40f;
    private final float  STUDENT_SERVICE_FEE    = 4.25f;//per credit no max
    
//
public FullTimeStudent ( String  fullTimePartTime,
                      String  residentStatus,
                      String  studentNumber,
                      String  studentFirstName,
                      String  studentLastName,
                      String  streetAddress,
                      String  cityName,
                      String   zipCode,
                      String  studentPhoneNumber,
                      String  studentEmailAddress,
                      String  gender,
                      String  dateOfBirth,
                      int   numberOfCredits )
                          
{
    super(    fullTimePartTime,
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
    
    setTuitionCost();
    setTotalFeeCost();
    setCapitalFee();
    setcollegeFee();
    setMalpraticeInsuranceFee();
    setAccidentInsuranceFee();
    setStudentServiceFee();
}

    

   
    
//
@Override
public void setTuitionCost()
{
    setCapitalFee();
    setcollegeFee();
    setMalpraticeInsuranceFee();
    setAccidentInsuranceFee();
    setStudentServiceFee();
    setTotalFeeCost();
    switch (getResidentStatus()) {
        case "c":
            TuitionCost = TUITION_COST_IN_COUNTY + getTotalFeeCost();
                   
            break;
        case "oc":
            TuitionCost = TUITION_COST_IN_STATE + getTotalFeeCost();
            break;
        case "os":
            TuitionCost = TUITION_COST_OUT_OF_STATE + getTotalFeeCost();
        break;
        default:
          JOptionPane.showMessageDialog(null," ResidentStatus error");  
        break;
    }
   

}  
@Override
public float getTuitionCost(){ 
return TuitionCost;
}



@Override      
public void setTotalFeeCost(){

TotalFeeCost = getCapitalFee()+ getcollegeFee()+ getMalpraticeInsuranceFee()
+getAccidentInsuranceFee() + getStudentServiceFee();
}
@Override
public float getTotalFeeCost(){ 
return TotalFeeCost;
}


@Override
public void setCapitalFee(){
    
switch (getResidentStatus()) {
        case "c":
            
            capitalFee = CAPITAL_FEE_IN_COUNTY;
            break;
        case "oc":
           capitalFee = CAPITAL_FEE_IN_STATE ;
            break;
        case "os":
           capitalFee = CAPITAL_FEE_OUT_OF_STATE;
           break;
           default:
          JOptionPane.showMessageDialog(null," ResidentStatus error");  
        break;
                }       
}
@Override
public float getCapitalFee(){
return capitalFee;

}


@Override
public void setcollegeFee(){
collegeFee = COLLEGE_FEE ;
}
@Override
public float getcollegeFee(){
return collegeFee;
}


@Override
public void setMalpraticeInsuranceFee(){
MalpraticeInsuranceFee = MALPRATICE_INSURANCE_FEE;
}
@Override
public float getMalpraticeInsuranceFee(){
return MalpraticeInsuranceFee;
}


@Override
public void setAccidentInsuranceFee(){
AccidentInsuranceFee = ACCIDENT_INSURANCE_FEE;
}
@Override
public float getAccidentInsuranceFee(){
return AccidentInsuranceFee;
}


@Override
public void setStudentServiceFee(){
StudentServiceFee = getNumberOfCredits() *STUDENT_SERVICE_FEE;
}
@Override
public float getStudentServiceFee(){
return StudentServiceFee;
}

} // End of the class
