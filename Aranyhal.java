package fajlkezeles;

import java.util.HashMap;
import java.util.Map;

public class Aranyhal {
    private static int KIVANSAGOKSZAMA = 3;

    
    private int kor;
    private Map<String, Integer> kivansagok = new HashMap<String, Integer>();
    private String kifogta;
    
    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
    }
    
    
}



