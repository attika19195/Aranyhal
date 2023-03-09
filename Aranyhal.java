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

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public int kivansagokSzama(String kifogta){
        return 0;
    }
    
    public String[] kikkelTalalkozott(){
        return null;
    }
    
    public boolean kivansagotTeljesit(String kivansag){
        return true;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }
    
    
}



