/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.HashMap;

/**
 *
 * @author jeferson
 */
public class RegistrationSystem {
    
    private HashMap< String, Integer> database;
    
    
    public RegistrationSystem() {
        
        this.database = new HashMap<>();    
    }
    
    
    public void systemAdd(String name) {
        
        if(database.get(name)!=null) {
            database.replace(name, database.get(name) + 1);
        } else {
            database.put(name, 0);
        }
    }
    
    
    public String checkSystem(String name) {
        
        if(database.get(name) > 0) {
            return name + "" + database.get(name);
        } else {
            return "OK";
        }
    }

    
    public String toString() {
        return "database=" + database;
    }
    
    
}
