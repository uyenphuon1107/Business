/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesstest;

/**
 *
 * @author Uyen Le
 */

//FullTimeHourly class extends FullTimeEmployee class
public class FullTimeHourly extends FullTimeEmployee{
    private double overtimePay;
    
           
    //contructor for this class
    public FullTimeHourly(String firstName, String lastName, int age, String ssn, Address address, 
                      int id, String educationLevel, boolean directDeposit, double basePay, double overtimePay) {
                    super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit, basePay);
                    this.overtimePay = overtimePay;
    }
    
    //this is getter and setter methods for overtimePay
   public double getovertimePay() {
       return overtimePay;
   }

   public void setovertimePay(double overtimePay) {
       this.overtimePay = overtimePay;
   }
   
    // calculator the payment of Full Time Hourly Employee
   public double computePay(int numHrs) {
           if(numHrs > 40)
               return 40*getbasePay()+ (numHrs-40)*getovertimePay();
           else
               return numHrs*getbasePay();
       }
    
   // introduce() will print the employee's information with or without ssn
    public void introduce(boolean displaySSN)
    {
        if (displaySSN)
            System.out.println(toString());
        else
        {
            System.out.println("Name: " + getfirstName() + getlastName()+
                    "\nAge: " + getage() +
                    "\nAddress: " + getaddress()+
                    "\nThis is information of FULL TIME HOURLY" +
                    "\nID: " + getid() +
                    "\nEducation Level: " + geteducationLevel() +
                    "\nDirect Deposit:" + getdirectDeposit());
        }
    }
   
   @Override
    public String toString() {
        return super.toString() +"\nOver Time Pay: $" + getovertimePay();
    }
}
