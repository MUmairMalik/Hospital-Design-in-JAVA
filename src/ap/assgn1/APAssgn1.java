/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.assgn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author M Umair Malik
 */
public class APAssgn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Hospital h=new Hospital();
        Patient p=new Patient(21,"AnyOne",new SimpleDateFormat("dd/MM/yyyy").parse("20/01/2020"));
        Doctor d=new Doctor(4,"Specialist",new Date(),"MBBS");
        h.addStaffInChildrenWard(d);
        h.visitChildrenDoctor(p);
        h.visitChildrenDoctor(p);
    
    }
    
}
