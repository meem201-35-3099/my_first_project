
package OfficeManagementSystem;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayInfo();
        Scanner input = new Scanner(System.in);
        
        //select status between "good" or "done"
        System.out.print("Select status between \"good\" or \"done\": ");
        String status;
        status = input.nextLine();
        m.checkDocsStatus(status);
        
        System.out.print("Enter Working Hour: ");
        int wHour = input.nextInt();
       
        
        Admin a = new Admin();
        a.checkManager(wHour);
        
    }
    
}
