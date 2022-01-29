
/*
 *
 * This program calculates student tuition
 *
 * Author:     Noah Miller
 
*/

public abstract class TuitionInformationSystem 
{
    private   String  fullTimePartTime;
    private   String  residentStatus;
    private   String  studentNumber;
    private   String  studentFirstName;
    private   String  studentLastName;
    private   String  streetAddress;
    private   String  cityName;
    private   String   zipCode;
    private   String  studentPhoneNumber;
    private   String  studentEmailAddress;
    private   String  gender;
    private   String  dateOfBirth;
    private   int   numberOfCredits;
    
//
public TuitionInformationSystem    ( 
                      String  fullTimePartTime,
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
    this.fullTimePartTime          = fullTimePartTime;
    this.residentStatus          = residentStatus;
    this.studentNumber       = studentNumber;
    this.studentFirstName         = studentFirstName;
    this.studentLastName           = studentLastName;
    this.streetAddress      = streetAddress;
    this.cityName           = cityName;
    this.zipCode            = zipCode;
    this.studentPhoneNumber        = studentPhoneNumber;
    this.studentEmailAddress       = studentEmailAddress;
    this.gender             = gender;
    this.dateOfBirth        = dateOfBirth;
    this.numberOfCredits   = numberOfCredits;
}

// 
public void setStudentNumber(String studentNumber)
{
    this.studentNumber = studentNumber;
}

//
public String getStudentNumber()
{
    return studentNumber;
}

//
public void setStudentFirstName(String studentFirstName)
{
    this.studentFirstName = studentFirstName;
}
        
//
public String getStudentFirstName()
{
    return studentFirstName;
}

//
public void setStudentLastName(String studentLastName)
{
    this.studentLastName = studentLastName;
}

//
public String getStudentLastName()
{
    return studentLastName;
}

//
public void setStreetAddress(String streetAddress)
{
    this.streetAddress = streetAddress;
}

//
public String getStreetAddress()
{
    return streetAddress;
}  

//
public void setCityName(String cityName)
{
     this.cityName = cityName;
}

// 
public String getCityName()
{
    return cityName;
}

//
public void setResidentStatus(String residentStatus)
{
    this.residentStatus = residentStatus;
}

// 
public String getResidentStatus()
{
    return residentStatus;
}

//
public void setZipCode(String zipCode)
{
    this.zipCode = zipCode;
}

//
public String getZipCode()
{
    return zipCode;
}

//
public void setStudentPhoneNumber(String studentPhoneNumber)
{
    this.studentPhoneNumber = studentPhoneNumber;
}

//
public String getStudentPhoneNumber()
{
    return studentPhoneNumber;
}

//
public void setStudentEmailAddress(String studentEmailAddress)
{
    this.studentEmailAddress = studentEmailAddress;
}

//
public String getEmailAddress()
{
    return studentEmailAddress;
}

//
public void setGender(String gender)
{
    this.gender = gender;
}

//
public String getGender()
{
     return gender;
}

//

//
public void setDateOfBirth(String dateOfBirth)
{
    this.dateOfBirth = dateOfBirth;
}

//
public String getDateOfBirth()
{
    return dateOfBirth;
}

//
public void setNumberOfCredits(int numberOfCredits)
{
    this.numberOfCredits = numberOfCredits;
}

//
public float getNumberOfCredits()
{
    return numberOfCredits;
}


     

       
public abstract void setCapitalFee();

public abstract float getCapitalFee();

public abstract void setcollegeFee();

public abstract float getcollegeFee();

public abstract void setMalpraticeInsuranceFee();
        
public abstract float getMalpraticeInsuranceFee();

public abstract void setAccidentInsuranceFee();

public abstract float getAccidentInsuranceFee();

public abstract void setStudentServiceFee();

public abstract float getStudentServiceFee();

public abstract void  setTotalFeeCost();

public abstract float getTotalFeeCost();

public abstract void setTuitionCost();

public abstract float getTuitionCost();
}