package uz.myMaven;

import java.util.Scanner;

public class Monthly {
    private double komunalka;
    private double kvartPlata;
    private double uchyoba;
    private double odejda;
    private double summaMonth;

    public double getMonthExp () {

        if (komunalka>200000) {
            System.out.println("Kamunal tulovingiz kup ekan" + komunalka);
        } else {
            System.out.println("Juda yaxshi komunal tulov " + komunalka);
        }
        System.out.println("Oylik xarajatlaringiz = " + summaMonth);
        if (kvartPlata>2000000) {
            System.out.println("Oilaviy kvartirada turarekansiz" + kvartPlata);
        } else {
            System.out.println("Kvartira to'lovingiz yomon emas " + kvartPlata);
        }
        if (odejda> 300000) {
            System.out.println("Kiyinishga kup pul sarflarkansiz" + odejda);
        } else {
            System.out.println("Malades tabiy chiroylisiz kiyim uchun " + odejda + " sum");
        }
        if (uchyoba> 500000) {
            System.out.println("Malades Uqish kerak xarajat " + uchyoba);
        } else {
            System.out.println("Xech bo'lmasa badiy kitob oqing " + uchyoba);
        }
        return komunalka;
    }
    Scanner in = new Scanner(System.in);
    public void setMonthExp() {
        System.out.println("Oylik kamunal tulovlalaringiz qiymatini kiriting");
        this.komunalka= in.nextDouble();
        System.out.println("Oyiga kvartplata qancha to'laysiz");
        this.kvartPlata=in.nextDouble();
        System.out.println("Oyiga chiroyli kiyinish uchun qancha sarflaysiz");
        this.odejda=in.nextDouble();
        System.out.println("Uqish uchun oylik tulovlaringiz qancha");
        this.uchyoba=in.nextDouble();
        summaMonth=komunalka+kvartPlata+odejda+uchyoba;
    }
    public double sumMonth() {
        double summaMonth = this.summaMonth;
        return summaMonth;
    }
}
