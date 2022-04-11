package uz.myMaven;

public class EnterDate {
    public static void main(String[] args) {
        ViewClass zarplata = new ViewClass();
        zarplata.setIncome();
        zarplata.getIncome();
        Monthly monthly=new Monthly();
        monthly.setMonthExp();
        monthly.getMonthExp();
        zarplata.summa();

        double sumexpenses = zarplata.summa()-monthly.sumMonth();

        System.out.println("Farqi = " + sumexpenses);
    }
}