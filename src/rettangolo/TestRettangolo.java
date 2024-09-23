package rettangolo;
public class TestRettangolo {
    public static void main(String[] args) {
        Rettangolo r1=new Rettangolo(2,3);
        Rettangolo r2=new Rettangolo(8,1.5);
        Rettangolo r3=new Rettangolo(9,4);
        System.out.println("La somma dei perimetri è: "+(r1.perimetro()+r2.perimetro()+r3.perimetro()));
        System.out.println("La somma delle aree è: "+(r1.area()+r2.area()+r3.area()));
        r1.ridimensiona(6,4);
        System.out.println("Post-ridimensionamento di r1");
        System.out.println("La somma dei perimetri è: "+(r1.perimetro()+r2.perimetro()+r3.perimetro()));
        System.out.println("La somma delle aree è: "+(r1.area()+r2.area()+r3.area()));
    }
}