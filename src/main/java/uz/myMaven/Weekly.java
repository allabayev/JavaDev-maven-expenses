package uz.myMaven;

import java.util.Scanner;

public class Weekly {
    private double produktta;
    private double choyxona;
    Scanner in = new Scanner(System.in);
    public double getProduktta() {
        return produktta;
    }
    public void setProduktta (int produktta) {
        System.out.println("Xaftasiga praduktaga qancha sarflaysiz ");
        this.produktta=in.nextDouble();
    }
    public double getChoyxona () {
        return choyxona;
    }
    public void setChoyxona (int choyxona) {
        System.out.println("Choyxonaga xaftasiga qancha sarflaysiz ");
        this.choyxona=in.nextDouble();
        ViewClass.class.getClass();
    }
}
