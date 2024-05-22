package model;

public class Haromszog {
    //Adattagok
    private int a, b, c;
    private boolean szerkesztheto;

    /*generálás: ALT+INSERT*/
    
    public Haromszog(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        /*ezt nem tudta legenerálni, ezt megírtuk*/
        this.szerkesztheto=szerkeszthetosegVizsgalat();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
        this.szerkesztheto=szerkeszthetosegVizsgalat();
    }

    public void setB(int b) {
        this.b = b;
        this.szerkesztheto=szerkeszthetosegVizsgalat();
    }

    public void setC(int c) {
        this.c = c;
        this.szerkesztheto=szerkeszthetosegVizsgalat();
    }
    
    /*ezek nem generálhatóak, mi irjuk meg*/
    public int kerulet(){
        if (szerkesztheto) {
            return a+b+c;
        }
        else{
            return -1;
        }
        
    }
    
    
    
    public String oldalakAdatai() {
        if (szerkesztheto) {
            return "a=" + a + ", b=" + b + ", c=" + c;
        }
        else{
            return "Nem szerkeszthető!";
        }
        
    }
    
    private boolean szerkeszthetosegVizsgalat(){
        return a+b > c && a+c > b && b+c > a;
    }
  
}
