import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        double armut,elma,domates,muz,patlican;
        System.out.print("Armut kg giriniz : ");
        armut = imput.nextDouble();
        System.out.print("Elma kg giriniz : ");
        elma = imput.nextDouble();
        System.out.print("Domates kg giriniz : ");
        domates = imput.nextDouble();
        System.out.print("Muz kg giriniz : ");
        muz = imput.nextDouble();
        System.out.print("Patlıcan kg giriniz : ");
        patlican = imput.nextDouble();
        double armut2=armut*2.14,elma2=elma*3.67,domates2=domates*1.11,muz2=muz*0.95,patlican2=patlican*5;
        System.out.println("Toplam tutar : " + (armut2+elma2+domates2+muz2+patlican2));

    }
}