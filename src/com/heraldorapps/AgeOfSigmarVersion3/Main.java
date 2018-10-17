package com.heraldorapps.AgeOfSigmarVersion3;

import com.heraldorapps.AgeOfSigmarVersion3.Unit_Data.Liberator_Unit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Liberator_Unit liberatorUnit = new Liberator_Unit(30, 3);
        liberatorUnit.setHasCaptain(true);
        System.out.println("Liberator has captain: "   + liberatorUnit.isHasCaptain());
    }
}
