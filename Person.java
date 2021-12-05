package businesstest;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Uyen Le
 * @since 09.21.2021
 */
// this is abstract class
public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private Address address;
   
            
    // Contructor of this class 
    public Person(String firstName, String lastName, int age,String ssn, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;

    }
    
    // this is getter and setter methods for firstName
    public String getfirstName() 
    {
            return firstName;
    }
    public void setfirstName(String firstName) 
    {
            this.firstName = firstName;
    }
    
    // this is getter and setter methods for lastName
    public String getlastName() 
    {
            return lastName;
    }
    public void setlastName(String lastName) 
    {
            this.lastName = lastName;
    }
    
    // this is getter and setter methods for age
    public int getage()
    {
            return age;
    }           
    public void setage (int age)
    {
            this.age = age;
    }
    
    // this is getter and setter methods for ssn
    public String getssn() 
    {
            return ssn;
    }
    public void setssn (String ssn) 
    {
            this.ssn = ssn;
    }
    
    // this is getter and setter methods for address
    public Address getaddress ()
    {
            return address;
    }
    public void setaddress (Address address) 
    {
            this.address = address;
    }
    
    
    // override object's implementation of toString()   
    @Override
    public String toString() 
    {
            return "Name: " + getfirstName() +" "+ getlastName()+
                    "\nAge: " + getage() +
                    "\nSSN: " + getssn()+
                   "\n" + getaddress();
    }
    
     
}
