package com.lynda.creation.design.patterns.factory.ch04;

public class HardCandyFactory extends CandyFactory {
    
    @Override
    public Candy getCandy(String type) {
        switch (type) {
            case "candy cane":
                return new HardCandy_CandyCane();

            case "lollipop":
                return new HardCandy_Lollipop();

            case "peppermint":
                return new HardCandy_peppermint();

            default:
                return new HardCandy_peppermint();
        }
    }
}
