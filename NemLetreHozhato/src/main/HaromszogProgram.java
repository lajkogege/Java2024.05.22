
package main;

import modell.Haromszog;


public class HaromszogProgram {

   
    public static void main(String[] args) throws Exception {
        new HaromszogProgram().bemutatok();
    }

    private void bemutatok() throws Exception {
        //nemKezeltKivetel();
        kezeltKivetel();
    }

    private void nemKezeltKivetel() throws Exception {
        Haromszog h=new Haromszog(0,0,0);
        
        System.out.println("Ide már nem jut el a program kivétel esetén.");
    }

    private void kezeltKivetel() {
        try{
            Haromszog h = new Haromszog(0, 0, 0);
        }
        catch(Exception ex){
            System.err.println("HIBA");
            System.out.println("oka: "+ex.getMessage());
        }
        
        
    }
    
}
