package com.epam.jwd.view;



public class Main {
    public static void main(String[] args) {


        //Repository.saveAllToMemory();
        System.out.println(Repository.findAllCompanies().get(0).getAirplanes());;

    }
}
