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

// FullTimeSalaried extends FullTimeEmloyee class
public class FullTimeSalaried extends FullTimeEmployee{
    
    // Contructor for this class
    public FullTimeSalaried(String firstName, String lastName, int age, String ssn, Address address, 
                      int id, String educationLevel, boolean directDeposit, double basePay) {
                    super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit,basePay);
    }
   // calculator the payment
    public double ComputePay(int numWeek)
    {
         return numWeek*(getbasePay()/52);
         
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
                        "\nThis is information FUll TIME SALARIED" +
                        "\nID: " + getid() +
                        "\nEducation Level: " + geteducationLevel() +
                        "\nDirect Deposit=" + getdirectDeposit());
            }
        }
    // override object's implementation of toString() 
    @Override
    public String toString() {
        return super.toString() ;
    }
}
