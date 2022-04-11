package uz.myMaven;

import java.util.Scanner;

public class ViewClass {
    private double income;
    private double sum;
    private double depozit;

    public double getIncome() {
        System.out.println("Oylik daromadingiz " + income + " sum");
        System.out.println("Oyiga jamg'armoqchisiz " + depozit + " sum");
        System.out.println("Oylik xarajatlaringiz " + sum + " sumdan oshmasligi kerak");
        return income;
    }

    public void setIncome() {
        System.out.println("Oylik daromadingizni kiriting: ");
        Scanner in = new Scanner(System.in);
        this.income = in.nextDouble();
        System.out.println("Yaxshi oyiga qancha jamg'armaga o'tkazmoqchisiz ");
        this.depozit= in.nextDouble();
        sum=income-depozit;
    }
    public double summa() {
        double sum = this.sum;
        return sum;
    }
}
