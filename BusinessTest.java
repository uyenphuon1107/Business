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

// Main class
public class BusinessTest {
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create the objects of classes
        // All the address for customer and employee
        Address a = new Address(123, "12th st", "San jose", "95112","CA");
        Address b = new Address(345, "10th st", "San jose", "95112","CA");
        Address c = new Address(567, "8th st", "San jose", "95134","CA");
        Address d = new Address(789, "2th st", "San jose", "95122","CA");
        Address e = new Address(987, "3th st", "San jose", "95132","CA");
        

        //Object of customer
        Customer cus = new Customer("Joe", " Smith", 50, "20392", a, 12332,"Cash");
              
        //Object of full time salaried employee
        FullTimeSalaried fullsalaried = new FullTimeSalaried ("Alax"," Smith", 35,"109832", b , 55555,"Bachelor",true,80000);
        
        //Object of full time hourly employee
        FullTimeHourly fullhour = new FullTimeHourly("Julia"," Han", 35,"239823", c , 44444,"Bachelor",true, 30, 50);
        
        //Object of part time employee
        PartTimeHourly parttime = new PartTimeHourly("Adam","Swift ", 35,"23723", d , 33333,"Bachelor",true,20);
        
        //Object of excutive
        Executive exe = new Executive("Hana","Brown",40,"ssn",e ,23212,"Master", true, 10000,1000);
        
        //Object of contractor
        Contractor co = new Contractor("John","William", 50,"38472", e , 11111,"Contractor",true, 30);
        
        
        //output customer
        System.out.println("     CUSTOMER");
        cus.introduce(false);
        System.out.println("");

        //output fulltime salaried
        System.out.println("     FULL TIME SALARIED EMPLOYEE");
        fullsalaried.introduce(true);
        System.out.println("Employee's paycheck: $"+ fullsalaried.ComputePay(52));
        System.out.println("");
        
        //output full time employee
        System.out.println("     FULL TIME HOURLY EMPLOYEE");
        fullhour.introduce(true);
        System.out.println("Employee's paycheck: $" + fullhour.computePay(50));
        System.out.println("");
        
        //output part time employee
        System.out.println("    PART TIME EMPLOYEE");
        parttime.introduce(true);
        System.out.println("Employee's paycheck: $" + parttime.computePay(20));
        System.out.println("");
        
        //output executive employee
        System.out.println("    EXECUTIVE EMPLOYEE");
        exe.introduce(true);
        System.out.println("Executive employee's paycheck: $"+ exe.computePay());       
        System.out.println("");
      
        //output contractor empployee
        System.out.println("    CONTRACTOR EMPLOYEE");
        co.introduce(true);
        System.out.println("Contractor's paycheck: $" +  co.computePay(30));
        
       
    }
    
}
