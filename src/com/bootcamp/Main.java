package com.bootcamp;

public class Main {

    public static void main(String[] args) {

        MachineService machineService = new MachineService();



        machineService.getMachineByID("001").setTotalValue(50.0);

        System.out.println(machineService.getMachineByID("001")
                                         .getTotalValue());


    }
}
