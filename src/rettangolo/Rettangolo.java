package rettangolo;

public class Rettangolo {
    //Variabili d'istanza
    private double base;
    private double altezza;

    //Metodi
    public void ridimensiona (double baseN,double altezzaN){
        base=baseN;
        altezza=altezzaN;
    }
    public double perimetro (){ return (base*2)+(altezza*2); }
    public double area (){ return base*altezza; }

    //Costruttore
    public Rettangolo(double baseN, double altezzaN){
        base=baseN;
        altezza=altezzaN;
    }

    //Set
    public void setAltezza(double altezzaN) { altezza = altezzaN; }
    public void setBase(double baseN) { base = baseN; }
}
