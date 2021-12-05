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

// Executive class extends Employee class
public class Executive extends Employee{
    
    private double yearlyBonus;
    private double yearlyCompensation;
    
    //contructor for this class
    public Executive(String firstName, String lastName, int age, String ssn, Address address, 
                      int id, String educationLevel, boolean directDeposit,double yearlyBonus, double yearlyCompensation) {
                    super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
                    this.yearlyBonus= yearlyBonus;
                    this.yearlyCompensation= yearlyCompensation;
    }
    
    //this is getter and setter methods for yearlyBonus
   public double getyearlyBonus() {
       return yearlyBonus;
   }

   public void setyearlyBonus(double yearlyBonus) {
       this.yearlyBonus = yearlyBonus;
   }
   
   //this is getter and setter methods for yearlyCompensation
   public double getyearlyCompensation() {
       return yearlyCompensation;
   }

   public void setyearlyCompensation(double yearlyCompensation) {
       this.yearlyCompensation = yearlyCompensation;
   }
    
    // compute Pay for executive
   public double computePay()
    {
        return getyearlyBonus()+ getyearlyCompensation();
    }
   // override object's implementation of toString()   
    @Override
    public String toString() 
    {
            return super.toString()+ "\nYearly Bonus: $" +getyearlyBonus()+
                                     "\nYearly Compensation: $" +getyearlyCompensation();                                    
    }
    // introduce() will print the employee's information with or without ssn
    public void introduce(boolean displaySSN)
        {
            if (displaySSN)
                System.out.println(toString());
            else
            {
                System.out.println("Name: " + getfirstName() +" "+ getlastName()+
                        "\nAge: " + getage() +
                        "\nAddress: " + getaddress()+
                        "\nID: " + getid() +
                        "\nEducation Level: " + geteducationLevel() +
                        "\nDirect Deposit: " + getdirectDeposit()+
                        "\nYearlyBonus: " +getyearlyBonus()+
                        "\nYearly Compensation: " +getyearlyCompensation());
            }
        }
    
    
}
