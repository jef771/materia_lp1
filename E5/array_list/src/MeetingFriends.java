/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jeferson
 */
public class MeetingFriends {
    
    private ArrayList<Integer> arr;
    
    
    public MeetingFriends() {
        this.arr = new ArrayList<>();
    }
    
    public int checkRoute() {
        Collections.sort(this.arr);
        
        return arr.get(2) - arr.get(0);
    }
    
    public void populate(int x1, int x2, int x3) {
        
        this.arr.add(x1);
        this.arr.add(x2);
        this.arr.add(x3);
    }
    
    public void clearRoute() {
        
        this.arr.clear();
    }
}
