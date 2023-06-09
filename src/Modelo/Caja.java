package Modelo;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Caja {

    private double totalIngresos;
    private double totalEgresos;
    private double totalCaja;
    private ArrayList<Gasto> gastos = new ArrayList();
    private ArrayList<Ingreso> ingresos = new ArrayList();
    
    public Caja() {
    }   

    public Caja(double totalIngresos, double totalEgresos, double totalCaja) {
        this.totalIngresos = totalIngresos;
        this.totalEgresos = totalEgresos;
        this.totalCaja = totalCaja;
        this.ingresos = new ArrayList();
        this.gastos = new ArrayList();
    }

    public double getTotalIngresos() {
        return totalIngresos;
    }

    public double getTotalEgresos() {
        return totalEgresos;
    }

    public double getTotalCaja() {
        return totalCaja;
    }

    public ArrayList<Gasto> getGastos() {
        return gastos;
    }

    public ArrayList<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setTotalIngresos(double totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public void setTotalEgresos(double totalEgresos) {
        this.totalEgresos = totalEgresos;
    }

    public void setTotalCaja(double totalCaja) {
        this.totalCaja = totalCaja;
    }

    public void setGastos(ArrayList<Gasto> gastos) {
        this.gastos = gastos;
    }

    public void setIngresos(ArrayList<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }    
}