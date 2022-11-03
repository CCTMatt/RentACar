/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author serge
 */
public class Car implements CarInterface{
    //this implements the interface
    
    //attributes that will use for the getter ans setters
    private String getMakes;
    public double getRates;
    public String GetId;
    public String SetAvailibility;
    

    @Override
    public Map<Month, boolean[]> createAvailability() {
        
        return null;
        
    }

   //this will return the make 
    @Override
    public String getMake() {
        
        return this.getMakes;
        
    }

    // will return the car make
    @Override
    public void setMake(Make make) {
    }

    
    // will return the rate
    @Override
    public double getRate() {
       
        return this.getRates;
    }

    
    // will return the car rate
    @Override
    public void setRate(double rate) {
        
    }

    // will set the availibility and return the assigned values 
    @Override
    public Map<Month, boolean[]> getAvailability() {
        return this.SetAvailibility;
       
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
    }

    //will return the ID
    @Override
    public int getId() {
        return this.GetId; 
    }

    //
    @Override
    public boolean isAvailable(Month month, int day) {
        
        return this.SetAvailibility;
    }

    @Override
    public boolean book(Month month, int day) {
        
    }
    
}
