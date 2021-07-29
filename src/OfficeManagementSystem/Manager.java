
package OfficeManagementSystem;

public class Manager {
    private String eId = "OM-101";
    public int wHour;
    private String shift = "Morning";
    public String status;
    
    void checkDocsStatus(String status){
       this.status = status;
       
        if("good".equals(status)){
     
            System.out.println("We can deal");
        }
        if("done".equals(status)){
            System.out.println("Proceed");
        }
    }
    public void displayInfo(){
        System.out.println("Employee ID: "+eId);
        System.out.println("Shift: "+shift);
    }
}
