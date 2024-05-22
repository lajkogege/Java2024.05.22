package main;

import model.Haromszog;

public class HaromszogProgram {
    
    private Haromszog h;
    
    public static void main(String[] args) {
        new HaromszogProgram().haromszogHasznalata();
    }

    private void haromszogHasznalata() {
        System.out.println("---new Haromszog (3,4,5)");
        h = new Haromszog(3, 4, 5);
        kiir();
        
        System.out.println("---setA(0)");
        h.setA(0);
        kiir();
    }

    private String kiir() {
        System.out.println(h.oldalakAdatai());
        System.out.println("--> K:"+h.kerulet());

    }
    
}
