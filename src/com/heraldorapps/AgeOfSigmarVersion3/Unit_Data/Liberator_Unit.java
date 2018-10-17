package com.heraldorapps.AgeOfSigmarVersion3.Unit_Data;

import com.heraldorapps.AgeOfSigmarVersion3.Die.Die;
import com.heraldorapps.AgeOfSigmarVersion3.Interaction.Melee;

public class Liberator_Unit extends Battleline implements Melee {
    private final static String unitName = "LIBERATORS";

    private final static String[] KEYWORDS = {"ORDER",
            "CELESTIAL",
            "HUMAN",
            "STORMCAST ETERNAL",
            "REDEEMER",
            "LIBERATORS"};

    private final static int WOUNDS_PER_MODEL = 2;
    private final static int SAVE = 4;
    private final static int MOVE = 5;
    private final static int BRAVERY = 7;

    private int range;
    private int attacks;
    private int hit;
    private int wound;
    private int rend;
    private int damage;

    private int modelsInUnit;
    private Weapons weapons;

    @Override
    public boolean getCanFly() {
        return super.getCanFly();
    }

    @Override
    public void setCanFly(boolean canFly) {
        super.setCanFly(canFly);
    }

    @Override
    public int attack(Unit unit) {
        int temp = modelsInUnit * attacks;
        int successes = 0;

        if (hasCaptain) {
            temp += 1;
        }

        Die[] attackDice = new Die[temp];

        for (Die die : attackDice) {

            if (die.getFaceUp() >= getHit()) {
                successes += 1;
            }

            if (weapons.equals(Weapons.Warhammers) || weapons.equals(Weapons.Warblades)) {
                if (die.getFaceUp() == 6) {
                    die.roll();
                    if (die.getFaceUp() >= hit) {
                        successes += 1;
                    }
                }
            }
        }

        Die[] woundDice = new Die[successes];
        successes = 0;

        for (Die die : woundDice) {
            if (die.getFaceUp() >= getWound()) {
                successes += 1;
            }
        }

        return successes;
    }

    @Override
    public int save(int attacks, Unit unit) {
        Die[] saveDice = new Die[attacks];
        int fails = 0;

        for (Die die : saveDice) {

            if ((weapons.equals(Weapons.WarbladeShield)) || (weapons.equals(Weapons.WarhammerShield))) {
                if (die.getFaceUp() == 1) {
                    die.roll();
                }
            }

            if (die.getFaceUp() < getSAVE()) {
                fails += 1;
            }
        }
        return fails;
    }

    private enum Weapons{
        Warhammers(1, 2, 4, 3, 0, 1),
        Warblades(1, 2, 3, 4, 0, 1),
        Grandhammer(1, 2, 4, 3, 1, 2),
        Grandblade(1, 2, 3, 4, 1, 2),
        WarhammerShield(1, 2, 4, 3, 0, 1),
        WarbladeShield(1, 2, 3, 4, 0, 1);

        private int range;
        private int attacks;
        private int hit;
        private int wound;
        private int rend;
        private int damage;

        Weapons(int range, int attacks, int hit, int wound, int rend, int damage) {
            this.range = range;
            this.attacks = attacks;
            this.hit = hit;
            this.wound = wound;
            this.rend = rend;
            this.damage = damage;
        }

        public int getRange() {
            return range;
        }

        public int getAttacks() {
            return attacks;
        }

        public int getHit() {
            return hit;
        }

        public int getWound() {
            return wound;
        }

        public int getRend() {
            return rend;
        }

        public int getDamage() {
            return damage;
        }
    }

    public Liberator_Unit() {
        range = weapons.getRange();
        attacks = weapons.getAttacks();
        hit = weapons.getHit();
        wound = weapons.getWound();
        rend = weapons.getRend();
        damage = weapons.getDamage();
        setCanFly(false);
    }

    public Liberator_Unit(int models) {
        setModelsInUnit(models);
        range = weapons.getRange();
        attacks = weapons.getAttacks();
        hit = weapons.getHit();
        wound = weapons.getWound();
        rend = weapons.getRend();
        damage = weapons.getDamage();
        setCanFly(false);
    }

    public Liberator_Unit(int models, int weaponSelection) {
        setModelsInUnit(models);
        this.weapons = selectWeapons(weaponSelection);
        range = weapons.getRange();
        attacks = weapons.getAttacks();
        hit = weapons.getHit();
        wound = weapons.getWound();
        rend = weapons.getRend();
        damage = weapons.getDamage();
        setCanFly(false);
    }

    public int getModelsInUnit() {
        return modelsInUnit;
    }

    public void setModelsInUnit(int modelsInUnit) {
        if (modelsInUnit < 5){
            System.out.println("Min Unit Size is 5: Unit size set to 5\n");
            this.modelsInUnit = 5;
        } else if (modelsInUnit > 30) {
            System.out.println("Max Unit Size Reached: Unit size set to 30\n");
            this.modelsInUnit = 30;
        } else {
            this.modelsInUnit = modelsInUnit;
        }
    }

    public static int getWoundsPerModel() {
        return WOUNDS_PER_MODEL;
    }

    @Override
    public int getSAVE() {
        return SAVE;
    }

    @Override
    public int getMOVE() {
        return MOVE;
    }

    @Override
    public int getBRAVERY() {
        return BRAVERY;
    }

    @Override
    public void hasCaptain(boolean submission) {
        hasCaptain = submission;
    }

    @Override
    public int getRange() {
        return range;
    }

    @Override
    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public int getAttacks() {
        return attacks;
    }

    @Override
    public void setAttacks(int attacks) {
        this.attacks = attacks;
    }

    @Override
    public int getHit() {
        return hit;
    }

    @Override
    public void setHit(int hit) {
        this.hit = hit;
    }

    @Override
    public int getWound() {
        return wound;
    }

    @Override
    public void setWound(int wound) {
        this.wound = wound;
    }

    @Override
    public int getRend() {
        return rend;
    }

    @Override
    public void setRend(int rend) {
        this.rend = rend;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    private Weapons selectWeapons(int selection) {
        switch (selection) {
            case 1:
                return Weapons.Warhammers;
            case 2:
                return Weapons.Warblades;
            case 3:
                return Weapons.WarhammerShield;
            case 4:
                return Weapons.WarbladeShield;
            case 5:
                return Weapons.Grandhammer;
            case 6:
                return Weapons.Grandblade;
                default:
                    return Weapons.Warhammers;
        }
    }

    public void getWeaponsPrompt() {
        System.out.println("Select a weapon option for the " + unitName +
        "\n1: Dual Warhammers" +
                "\n2: Dual Warblades" +
                "\n3: Warhammer with Shield" +
                "\n4: Warblade with Shield" +
                "\n5: Grandhammer" +
                "\n6:Grandblade");
    }
}
