package com.bootcamp;

public class Machine {

    private double totalValue;
    private String id;

    public Machine(final String id) {
        this.id = id;
        this.totalValue = 0.0;
    }

    public Machine(final String id, double totalValue) {
        this.id = id;
        this.totalValue = totalValue;
    }

    public double getTotalValue(){
        return totalValue;


    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public String getId(){
        return id;
    }
}
