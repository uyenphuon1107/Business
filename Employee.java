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
// an abstract class extends Person class
public abstract class Employee extends Person {
    
    // member variables of this class
    private int id;
    private String educationLevel;
    private boolean directDeposit;
    
    //constructor of this class
    public Employee (String firstName, String lastName, int age, String ssn, Address address, 
                      int id, String educationLevel, boolean directDeposit)
        {
            super(firstName, lastName, age, ssn, address);
            this.id = id;
            this.educationLevel= educationLevel;
            this.directDeposit = directDeposit;
        }
    
    // this is getter and setter methods for id
        public int getid() 
        {
                return id;
        }
        public void setid (int id) 
        {
                this.id = id ;
        }
   
    // this is getter and setter methods for educationLevel 
        public String geteducationLevel() 
        {
                return educationLevel;
        }
        public void seteducationLevel(String educationLevel) 
        {
                this.educationLevel = educationLevel;
        }
        
    // this is getter and setter methods for directDeposit 
        public boolean getdirectDeposit() 
        {
                return directDeposit;
        }
        public void setdirectDeposit(boolean directDeposit) 
        {
                this.directDeposit = directDeposit;
        }
        
       @Override
       public String toString(){
           return super.toString()+ 
                                    "\nID: " + getid() +
                                    "\nEducation Level: " + geteducationLevel() +
                                    "\nDirect Deposit:" + getdirectDeposit();
                
        }
        
}
