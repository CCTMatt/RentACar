/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author serge
 */
public class RentAcar implements RentACarInterface {
    //this implements the interface

    
    // this gets the car from the carInterface Class
    @Override
    public List<CarInterface> getCars() {
       public getCar(){
        setCars = new ArrayList<>();
    }

    }

    @Override
    public void setCars(List<CarInterface> cars) {
        
    }

    // method that will get the cars name from the car Interface
    @Override
    public String getName() {
       
    }
    // this will set the  cars name and not going to return any time
    @Override
    public void setName(String name) {
        
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getNumberOfCars() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
