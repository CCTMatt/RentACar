/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.in;


/**
 *
 * @author serge
 */
public class BookingSystem implements BookingSystemInterface {
    
/**
 * this implements the interface
 * get car bookings
 */
   
    public String bookSystem;
    
    // method will get booking 
    public String getBook () { 
        
      this.setupRentACar(in);
        return bookSystem; // will return the booksystem car from the car interface
    
    }
    
    //will return the car names
    
    public void gettingCar(String getCar)
    {
 
        // This keyword refers to current instance itself
    }

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) 
    
    {
       
        return null;
       
    }

    private void setupRentACar(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
    
    
}
