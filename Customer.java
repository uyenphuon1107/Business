package businesstest;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uyen Le
 * @since 09.21.2021
 */
// Customer class extends Person class
public class Customer extends Person{
        private int customerID;
        private String payPreference;
        
        //contructor of this class
        public Customer (String firstName, String lastName, int age,String ssn, Address address, int customerID, String payPreference)
        {
            super(firstName, lastName, age, ssn, address);
            this.customerID = customerID;
            this.payPreference = payPreference;
        }
        
        // this is getter and setter methods for customerID
        public int getcustomerID() 
        {
                return customerID;
        }
        public void setcustomerID (int customerID) 
        {
                this.customerID = customerID ;
        }
        

        // this is getter and setter methods for firstName 
        public String getpayPreference() 
        {
                return payPreference;
        }
        public void setpayPreference(String firstName) 
        {
                this.payPreference = payPreference;
        }
        
        @Override
          
        public String toString() {
                return super.toString()+ "\nCustomer Id: " + getcustomerID() +
                                         "\nPay Preference: " + getpayPreference();
                                         
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
                                    "\nCustomer Id: " + getcustomerID() +
                                    "\nPay Preference: " + getpayPreference());
                       
            }
        }
}
