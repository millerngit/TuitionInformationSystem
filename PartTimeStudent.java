
import javax.swing.JOptionPane;


/**
 *
 * @author noah miller
 */


    

public class PartTimeStudent extends TuitionInformationSystem {
  
    protected float  TuitionCost;
    protected float TotalFeeCost;
    protected float  capitalFee;
    protected float  collegeFee;
    protected float  MalpraticeInsuranceFee;
    protected float  AccidentInsuranceFee;
    protected float  StudentServiceFee;
    
    private final float   CREDIT_COST_IN_COUNTY   =  110.00f;
    private final float   CREDIT_COST_IN_STATE       =   220.00f;
    private final float   CREDIT_COST_OUT_OF_STATE    = 330.00f;
    private final float   CAPITAL_FEE_IN_COUNTY   =  0.00f;
    private final float   CAPITAL_FEE_IN_STATE       =   6.50f;
    private final float   CAPITAL_FEE_OUT_OF_STATE    = 7.50f;
    private final float   COLLEGE_FEE  =   6.00f; // max 72
    private final float   MALPRATICE_INSURANCE_FEE   =  7.00f;//not per credit
    private final float   ACCIDENT_INSURANCE_FEE       =   0.00f;
    private final float  STUDENT_SERVICE_FEE    = 4.00f;
    
//
public PartTimeStudent ( String  fullTimePartTime,
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
                      int   numberOfCredits)
                          
{
    super(   fullTimePartTime,
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
                       numberOfCredits);
    setTuitionCost();
    setTotalFeeCost();
    setCapitalFee();
    setcollegeFee();
    setMalpraticeInsuranceFee();
    setAccidentInsuranceFee();
    setStudentServiceFee();
    
}

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
            TuitionCost = (CREDIT_COST_IN_COUNTY*getNumberOfCredits()) + getTotalFeeCost();
            break;
        case "oc":
            TuitionCost = (CREDIT_COST_IN_STATE *getNumberOfCredits()) + getTotalFeeCost();
            break;
        case "os":
            TuitionCost = (CREDIT_COST_OUT_OF_STATE *getNumberOfCredits()) + getTotalFeeCost();
                    
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
            
            capitalFee = getNumberOfCredits() *CAPITAL_FEE_IN_COUNTY;
            break;
        case "oc":
           capitalFee = getNumberOfCredits() *CAPITAL_FEE_IN_STATE ;
            break;
        case "os":
           capitalFee =getNumberOfCredits() * CAPITAL_FEE_OUT_OF_STATE;
           break;
         
                }       
}
@Override
public float getCapitalFee(){
return capitalFee;

}



@Override
public void setcollegeFee(){
collegeFee = COLLEGE_FEE*getNumberOfCredits();
        if (collegeFee>72) {
        collegeFee = 72;
        }
                 
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
