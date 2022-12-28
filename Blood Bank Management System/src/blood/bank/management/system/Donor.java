/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.bank.management.system;

/**
 *
 * @author User
 */

//Inheritance (Subclass - Child)
public class Donor extends User {
    
    private int HealthStatus;
    private int Anonymity;
    private int LastWeekDonate;
    
    public Donor(String ID, String Password, String Name, String Gender, int Age, float Weight, String BloodGroup, Hospital Hospital, int HealthStatus, int Anonymity, int LastWeekDonate){
        
        super(ID, Password, Name, Gender, Age, Weight, BloodGroup, Hospital);
        
        this.HealthStatus = HealthStatus;
        this.Anonymity = Anonymity;
        this.LastWeekDonate = LastWeekDonate;
    }
    
    public int getHealthStatus(){
        return HealthStatus;
    }
    
    public int getAnonymity(){
        return Anonymity;
    }
    
    public int getLastWeekDonate(){
        return LastWeekDonate;
    }
    
    public void setHealthStatus(int HealthStatus){
        this.HealthStatus = HealthStatus;
    }
    
    public void setAnonymity(int Anonymity){
        this.Anonymity = Anonymity;
    }
    
    public void setLastWeekDonate(int LastWeekDonate){
        this.LastWeekDonate = LastWeekDonate;
    }
    
    public String checkEligibility(){
        if(getWeight()>=45 && (getAge()>=18 && getAge()<=65)){
            
            if(getLastWeekDonate()>=12){
                return "Yes";
            }else{
                int WeekRemaining = 12 - getLastWeekDonate();
                return "You must wait for " + WeekRemaining + " week(s) remaining before donating your blood again";
            }
        }else{
            return "No (Unfit due to age/weight)";
        }
    }
    
    public String CheckRecipient(){
        
        //Array
        String BloodType[] = new String[8];
        
        BloodType[0] = "A+";
        BloodType[1] = "O+";
        BloodType[2] = "B+";
        BloodType[3] = "AB+";
        BloodType[4] = "A-";
        BloodType[5] = "O-";
        BloodType[6] = "B-";
        BloodType[7] = "AB-";
        
        if(BloodGroup.equals("A+")){
            return BloodType[0] + ", " + BloodType[3];
        }else if(BloodGroup.equals("O+")){
            return BloodType[1] + ", " + BloodType[0] + ", " + BloodType[2] + ", " + BloodType[3];
        }else if(BloodGroup.equals("B+")){
            return BloodType[2] + ", " + BloodType[3] ;
        }else if(BloodGroup.equals("AB+")){
            return BloodType[3];
        }else if(BloodGroup.equals("A-")){
            return BloodType[0] + ", " + BloodType[3] + ", " + BloodType[4] + ", " + BloodType[7] ;
        }else if(BloodGroup.equals("O-")){
            return "Everyone";
        }else if(BloodGroup.equals("B-")){
            return BloodType[2] + ", " + BloodType[3] + ", " + BloodType[6] + ", " + BloodType[7] ;
        }else{
            return BloodType[3] + ", " + BloodType[7];
        }
    }
    
}
