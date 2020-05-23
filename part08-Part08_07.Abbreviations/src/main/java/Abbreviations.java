
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 */
public class Abbreviations {
    
    private Map<String, String> dictionary;
    
    public Abbreviations() {
        dictionary = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String key = filterString(abbreviation);
        if (dictionary.containsKey(key)) {
            return;
        }
        
        dictionary.put(key, explanation);
        
    }

    private String filterString(String str) {
        if (str == null)
            return "";
        
        return str.trim().toLowerCase();
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return dictionary.containsKey(filterString(abbreviation));
    }
    
    public String findExplanationFor(String abbreviation) {
        return dictionary.get(filterString(abbreviation));
    }
    
}
