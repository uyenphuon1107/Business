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

// Address class is composition with Person class
public class Address{
    private int streetNum;
    private String streetName;
    private String city, zip, state ;
    
    // contructor of this class
    public Address(int streetNum, String streetName, String city, String zip,
            String state){
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    ////this is getter and setter methods for streetNum, streetName, city, zip, state
    public int getstreetNum(){
        return streetNum;
    }   
    public void setstreetNum(int streetNum){
        this.streetNum = streetNum;
    }
    
    public String getstreetName(){
        return streetName;
    }   
    public void setstreetName(String streetName){
        this.streetName = streetName;
    }
    
    public String getcity(){
        return city;
    }   
    public void setcity (String city){
        this.city = city;
    }
    
    public String getzip(){
        return zip;
    }   
    public void setzip (String zip){
        this.zip = zip;
    }
    public String getstate(){
        return state;
    }   
    public void setstate (String state){
        this.state = state;
    }
    
    
    // override object's implementation of toString()   
    @Override
    public String toString() 
    {
            return "Address: " + getstreetNum() +
				" " + getstreetName() +
				", " + getcity() +
				" " + getstate() +
				" " + getzip();
    }
}
