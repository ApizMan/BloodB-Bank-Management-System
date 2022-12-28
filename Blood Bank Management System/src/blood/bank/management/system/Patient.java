/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.bank.management.system;

/**
 *
 * @author User
 */
public class Patient extends User {
    
    //Inheritance Subclass (Child)
    private String BloodMatch;
    
    public Patient(String ID, String Password, String Name, String Gender, int Age, float Weight, String BloodGroup, Hospital Hospital){
        super(ID, Password, Name, Gender, Age, Weight, BloodGroup, Hospital);
    }
    
    public String getBloodMatch(){
        return BloodMatch;
    }
    
    public void setBloodMatch(String BloodMatch){
        this.BloodMatch = BloodMatch;
    }
    
    public String checkCompatibility(String BloodGroupDonor){
        
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
        
        switch(BloodGroup){
            case "A+": 
                setBloodMatch("A");
                if(BloodGroupDonor.equals(BloodType[0]) || BloodGroupDonor.equals(BloodType[4]) || BloodGroupDonor.equals(BloodType[1]) || BloodGroupDonor.equals(BloodType[5])){
                    return "Yes";
                }else{
                    return "No";
                }
            case "O+": 
                setBloodMatch("A");
                if(BloodGroupDonor.equals(BloodType[1]) || BloodGroupDonor.equals(BloodType[5])){
                    return "Yes";
                }else{
                    return "No";
                }
            case "B+": 
                setBloodMatch("A");
                if(BloodGroupDonor.equals(BloodType[2]) || BloodGroupDonor.equals(BloodType[6]) || BloodGroupDonor.equals(BloodType[1]) || BloodGroupDonor.equals(BloodType[5])){
                    return "Yes";
                }else{
                    return "No";
                }
            case "AB+":
                setBloodMatch("A");
                if(BloodGroupDonor.equals(BloodType[0]) || BloodGroupDonor.equals(BloodType[1]) || BloodGroupDonor.equals(BloodType[2]) || BloodGroupDonor.equals(BloodType[3]) || BloodGroupDonor.equals(BloodType[4]) || BloodGroupDonor.equals(BloodType[5]) || BloodGroupDonor.equals(BloodType[6]) || BloodGroupDonor.equals(BloodType[7])){
                    return "Yes";
                }else{
                    return "No";
                }
            case "A-":
                setBloodMatch("A");
                if(BloodGroupDonor.equals(BloodType[4]) || BloodGroupDonor.equals(BloodType[5])){
                    return "Yes";
                }else{
                    return "No";
                }
            case "O-":
                setBloodMatch("A");
                if(BloodGroupDonor.equals(BloodType[5])){
                    return "Yes";
                }else{
                    return "No";
                }
            case "B-":
                setBloodMatch("A");
                if(BloodGroupDonor.equals(BloodType[5]) || BloodGroupDonor.equals(BloodType[6])){
                    return "Yes";
                }else{
                    return "No";
                }
            case "AB-":
                setBloodMatch("A");
                if(BloodGroupDonor.equals(BloodType[4]) || BloodGroupDonor.equals(BloodType[5]) || BloodGroupDonor.equals(BloodType[6]) || BloodGroupDonor.equals(BloodType[7])){
                    return "Yes";
                }else{
                    return "No";
                }
            default:
                return "No";
        }
    }
    
}
