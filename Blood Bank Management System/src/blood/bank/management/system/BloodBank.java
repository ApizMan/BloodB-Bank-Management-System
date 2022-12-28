/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.bank.management.system;

/**
 *
 * @author User
 */
public class BloodBank {
    private Blood Blood;
    private int BloodStock;
    
    public BloodBank(){
        //Composition
        Blood = new Blood();
        BloodStock=0;
    }
    
    public Blood getBlood(){
        return Blood;
    }
    
    public int getBloodStock(){
        return BloodStock;
    }
    
    public void setBlood(Blood Blood){
        this.Blood = Blood;
    }
    
    public void setBloodStock(int BloodStock){
        this.BloodStock = BloodStock;
    }
}
