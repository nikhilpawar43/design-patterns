package com.udemy.patterns.creational.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        GameUnit gameUnit = new SwordsMan();
        gameUnit.move("North", 20L);
        gameUnit.attack();
        
        GameUnit gameUnitClone = gameUnit.clone();
        gameUnitClone.getAttackOrder().setDirection("South");

        System.out.println(gameUnit);
        System.out.println(gameUnitClone);
        
        GameUnit generalGameUnit = new General();
        generalGameUnit.move("East", 5L);
        generalGameUnit.attack();

        GameUnit generalGameUnitClone = generalGameUnit.clone();

        System.out.println(generalGameUnit);
        System.out.println(generalGameUnitClone);
    }
}
