/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.assgn1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author M Umair Malik
 */
public class Hospital {
    List<Ward> wards=new ArrayList();
    List<Person> visitors=new ArrayList();

    public Hospital() {
        Ward w=new ChildrenWard();
        wards.add(w);
        w=new OrthopedicWard();
        wards.add(w);
        w=new SurgicalWard();
        wards.add(w);
    }
    void Visiting(Person p)
    {
        visitors.add(p);
    }
    
    void addStaffInChildrenWard(Staff s)
    {
        ChildrenWard cw=(ChildrenWard) wards.get(0);
        cw.addStaff(s);
    }
    void addStaffInOrthopedicWard(Staff s)
    {
        OrthopedicWard cw=(OrthopedicWard) wards.get(1);
        cw.addStaff(s);
    }
    void addStaffInSurgicalWard(Staff s)
    {
        SurgicalWard cw= (SurgicalWard) wards.get(2);
        cw.addStaff(s);
    }
    void visiOrthopedictDoctor(Patient p)
    {
       visitors.add(p);
       OrthopedicWard cw=(OrthopedicWard) wards.get(1);
       
       
       Doctor d= (Doctor) cw.staff.get(0);
       d.checkUp(p);
    } 
    void visiSurgicalDoctor(Patient p)
    {
       visitors.add(p);
  
       Doctor d= (Doctor) wards.get(2).staff.get(0);
       d.checkUp(p);
    }
    void visitChildrenDoctor(Patient p)
    {
       visitors.add(p);
       Doctor d= (Doctor) wards.get(0).staff.get(0);
       d.checkUp(p);
    }
    
}
