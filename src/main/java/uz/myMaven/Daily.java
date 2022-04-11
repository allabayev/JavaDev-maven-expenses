package uz.myMaven;

import java.util.Scanner;

public class Daily {
    private double trasnport;
    private double zavtrak;
    private double obed;
    private double ujin;
    private double karmRasxod;

    public double getTrasnport() {
        return trasnport;
    }

    public double getZavtrak() {
        return zavtrak;
    }

    public double getObed() {
        return obed;
    }

    public double getUjin() {
        return ujin;
    }

    public double getKarmRasxod() {
        return karmRasxod;
    }

    public void setTrasnport () {
        Scanner in = new Scanner(System.in);
        System.out.println("Kunlik transport xarajatlaringiz qancha");
        this.trasnport=in.nextDouble();
    }
    public void setZavtrak (int zavtrak) {
        this.zavtrak=zavtrak;
    }
    public void setObed (int obed) {
        this.obed=obed;
    }
    public void setUjin (int ujin) {
        this.ujin=ujin;
    }
    public void setKarmRasxod (int karmRasxod) {
        this.karmRasxod=karmRasxod;
    }
}