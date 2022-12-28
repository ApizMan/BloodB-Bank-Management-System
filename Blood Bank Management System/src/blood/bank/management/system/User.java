/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.bank.management.system;

/**
 *
 * @author User
 */
public class User {
    //abstract
    
    protected String ID;
    protected String Password;
    protected String Name;
    protected String Gender;
    protected int Age;
    protected float Weight;
    protected String BloodGroup;
    protected Hospital Hospital;
    
    public User(String ID, String Password, String Name, String Gender, int Age, float Weight, String BloodGroup, Hospital Hospital){
        this.ID = ID;
        this.Password = Password;
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
        this.Weight = Weight;
        this.BloodGroup = BloodGroup;
        this.Hospital = Hospital;
    }
    
    public String getID(){
        return ID;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getGender(){
        return Gender;
    }
    
    public int getAge(){
        return Age;
    }
    
    public float getWeight(){
        return Weight;
    }
    
    public String getBloodGroup(){
        return BloodGroup;
    }
    
    public Hospital getHospital(){
        return Hospital;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    
    public void setAge(int Age){
        this.Age = Age;
    }
    
    public void setWeight(float Weight){
        this.Weight = Weight;
    }
    
    public void setBloodGroup(String BloodGroup){
        this.BloodGroup = BloodGroup;
    }
    
    public void setHospital(Hospital Hospital){
        this.Hospital = Hospital;
    }
}
