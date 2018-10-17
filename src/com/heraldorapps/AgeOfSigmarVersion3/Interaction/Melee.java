package com.heraldorapps.AgeOfSigmarVersion3.Interaction;

import com.heraldorapps.AgeOfSigmarVersion3.Unit_Data.Unit;

public interface Melee {
    int attack(Unit unit);

    int save(int attacks, Unit unit);

}
