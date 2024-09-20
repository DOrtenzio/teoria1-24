package rettangolo;

public class Rettangolo {
    private double base;
    private double altezza;

    public void ridimensiona (double baseN,double altezzaN){
        base=baseN;
        altezza=altezzaN;
    }
    public double perimetro (){ return (base*2)+(altezza*2); }
    public double area (){ return base*altezza; }
}
