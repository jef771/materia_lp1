/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author jeferson
 */
public class Letters {
    
    private String letter;
    
    
    public Letters(String letter) {
        
        this.letter = letter;
    }
    
    
    public int getUnique() {
        
        String newLetter = this.letter.replace("}", "");
        newLetter = newLetter.replace("{", "");
        
        String[] characters = newLetter.split(", ");
        
        HashSet<String> letters = new HashSet<>(Arrays.asList(characters));
        
        int ans = letters.size();
        for(String s: letters) {
            if(s.equals("")) {
                ans--;
            }
        }
        
        return ans;
    }
}
