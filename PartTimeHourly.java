/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesstest;

/**
 *
 * @author Uyen Le
 * @since 09.21.2021
 */

// PartTimeHourly class extends Employee class
public class PartTimeHourly extends Employee{
    
    private double baseHourlyPay;
    
    //constructor of this class
    public PartTimeHourly(String firstName, String lastName, int age, String ssn, Address address, 
                      int id, String educationLevel, boolean directDeposit, double baseHourlyPay) {
                    super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
                    this.baseHourlyPay = baseHourlyPay;
    }
    
    // this is getter and setter methods for BaseHourlyPay
        public double getbaseHourlyPay() 
        {
                return baseHourlyPay;
        }
        public void setbaseHourlyPay(double baseHourlyPay) 
        {
                this.baseHourlyPay = baseHourlyPay;
        }
        // this will calculate paycheck for employee
        public double computePay(int numHrs) {
            
           if(numHrs > 40)
                return -1;
           return getbaseHourlyPay()* numHrs;
       }
       
        // introduce() will print the employee's information with or without ssn
        public void introduce(boolean displaySSN)
        {
            if (displaySSN)
                System.out.println(toString());
            else
            {
                System.out.println("Name: " + getfirstName()+" " + getlastName()+
                        "\nAge: " + getage() +
                        "\nAddress: " + getaddress()+
                        "\nThis is information of PART TIME employee" +
                        "\nID: " + getid() +
                        "\nEducation Level: " + geteducationLevel() +
                        "\nDirect Deposit: " + getdirectDeposit());
            }
        }
        

        @Override
        public String toString() {
            return super.toString() + "\nPart time employee base rate: $" + getbaseHourlyPay();
        }
        
}
