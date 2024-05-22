package modell;

public class Haromszog {
    //Adattagok
    private int a, b, c;
    /*generálás: ALT+INSERT*/
    
    public Haromszog(int a, int b, int c) throws Exception {
        this.a = a;
        this.b = b;
        this.c = c;
        /*ezt nem tudta legenerálni, ezt megírtuk*/
        szerkeszthetosegVizsgalat();//setterekbe is

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

    public void setA(int a) throws Exception {
        this.a = a;
        szerkeszthetosegVizsgalat();//setterekbe is
    }

    public void setB(int b) throws Exception {
        this.b = b;
        szerkeszthetosegVizsgalat();//setterekbe is

    }

    public void setC(int c) throws Exception {
        this.c = c;
        szerkeszthetosegVizsgalat();//setterekbe is

    }
    
    /*ezek nem generálhatóak, mi irjuk meg*/
    public int kerulet(){
            return a+b+c;
    }
    
    
    
    public String oldalakAdatai() {
            return "a=" + a + ", b=" + b + ", c=" + c;

    }
    
    private void szerkeszthetosegVizsgalat() throws Exception{
        if( !(a+b > c && a+c > b && b+c > a)){
            throw new Exception("Nem szerkeszthető a háromszög!!");
        }
    }
  
}
