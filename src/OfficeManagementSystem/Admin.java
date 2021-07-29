
package OfficeManagementSystem;


public class Admin extends Manager{
    
    void checkManager(int wHour){
        super.wHour= wHour;
        if(super.wHour<=8){
            System.out.println("Do previous work");
        }
        else
            System.out.println("New work assignmen");
    }

    
}
    

