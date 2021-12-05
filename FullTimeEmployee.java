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
// FullTimeEployee abstract class extends Employee
public abstract class FullTimeEmployee extends Employee{
    
    private double basePay;
    
    //constructor of this class
    public FullTimeEmployee(String firstName, String lastName, int age, String ssn, Address address, 
                      int id, String educationLevel,boolean directDeposit, double basePay) {
            
            super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
            this.basePay = basePay;
    }
    
    // this is getter and setter methods for basePay
        public double getbasePay() 
        {
                return basePay;
        }
        public void setbasePay(double basePay) 
        {
                this.basePay = basePay;
        }
    
        
    // override object's implementation of toString()     
    @Override
        public String toString() {
            return super.toString()+ "\nBase Pay: $" + getbasePay();
        }
}
