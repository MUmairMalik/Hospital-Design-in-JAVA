/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.assgn1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author M Umair Malik
 */
public class Medical extends Staff {
    
    List<Integer> record=new ArrayList();
   
    public Medical(Date JoiningDate, String Education) {
        super(JoiningDate, Education);
    }
    void Dealing(Patient p)
    {
        System.out.println("Dealing with patient whose id "+p.ID);
        record.add(p.ID);
    }
    void visitDoctor(Patient p)
    {
        
    }
    
}
