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
public class Patient extends Person {
    int ID;
    String Name;
    Date lastVisited;

    public Patient(int ID, String Name, Date lastVisited) {
        this.ID = ID;
        this.Name = Name;
        this.lastVisited = lastVisited;
    }
    
}
