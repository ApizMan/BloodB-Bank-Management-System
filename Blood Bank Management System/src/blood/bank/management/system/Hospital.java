/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.bank.management.system;

/**
 *
 * @author User
 */
public class Hospital {
    //Interface
    private String State;
    private String Name;
    private String Sector;
    private BloodBank BloodBank;
    
    public Hospital(String State, String Name, String Sector, BloodBank BloodBank){
        this.State = State;
        this.Name = Name;
        this.Sector = Sector;
        this.BloodBank = BloodBank;
    }
    
    public String getState(){
        return State;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getSector(){
        return Sector;
    }
    
    public BloodBank getBloodBank(){
        return BloodBank;
    }
    
    public void setState(String State){
        this.State = State;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setSector(String Sector){
        this.Sector = Sector;
    }
    
    public void setBloodBank(BloodBank BloodBank){
        this.BloodBank = BloodBank;
    }
    
    public void InfoEligibility(){
        System.out.println("\nYou can only donate if:-");
        System.out.println("a) Your age is above 18 or below 65.");
        System.out.println("b) You are 45kg and above.");
        System.out.println("c) You are in good health condition.");
        System.out.println("d) Your blood donation does not exceed once in every 3 months.");
    }
}
