/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.assgn1;

import java.util.Date;

/**
 *
 * @author M Umair Malik
 */
public class Doctor extends Medical{
    int ID;
    String speciality;

    public Doctor(int ID, String speciality, Date JoiningDate, String Education) {
        super(JoiningDate, Education);
        this.ID = ID;
        this.speciality = speciality;
    }
    
    void checkUp(Patient p)
    {
        Date d=new Date();//getting current date
        if(d.getDate()!=p.lastVisited.getDate())
        {
            System.out.println(p.Name+" with ID("+p.ID+") is allowed");
            p.lastVisited=new Date();
        }
        else
        {
           System.out.println(p.Name+" with ID("+p.ID+") has already visited today");
        }
        
    }
    
}
