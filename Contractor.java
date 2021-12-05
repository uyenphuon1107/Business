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

// Contractor class extends Employee class
public class Contractor extends Employee{
    
    private double payBase;
    
    //constructor of this class
    public Contractor(String firstName, String lastName, int age, String ssn, Address address, 
                      int id, String educationLevel,boolean directDeposit ,double payBase) {
                    super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
                    this.payBase= payBase;
    }
    
        // this is getter and setter methods for payBase 
        public double getpayBase() 
        {
                return payBase;
        }
        public void setpayBase(double directDeposit) 
        {
                this.payBase = payBase;
        }
        
        
        // introduce() will print the employee's information with or without ssn
        public void introduce(boolean displaySSN)
        {
            if (displaySSN)
                System.out.println(toString());
            else
            {
                System.out.println("Name of employee: " + getfirstName()+ " " + getlastName()+
                                    "\nAge: " + getage() +
                                    "\nAddress: " + getaddress()+
                                    "\nID: " + getid() +
                                    "\nEducation Level: " + geteducationLevel()+
                                    "\nDirect Deposit: " + getdirectDeposit());
            }
        }
        
        // this will calculate paycheck for employee
        public double computePay(int numHrs) {
               return getpayBase()* numHrs;
        }
        
        @Override
          
        public String toString() {
                return super.toString()+ "\nContractor base rate: $"+ getpayBase();                                       
        }
}
