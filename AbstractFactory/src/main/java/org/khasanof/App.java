package org.khasanof;

public class App implements Runnable {
    private final Kingdom kingdom = new Kingdom();

    public Kingdom getKingdom() {
        return kingdom;
    }

    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        System.out.println("Elf Kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        System.out.println(kingdom.getArmy().getDescription());
        System.out.println(kingdom.getCastle().getDescription());
        System.out.println(kingdom.getKing().getDescription());

        System.out.println("Orc Kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        System.out.println(kingdom.getArmy().getDescription());
        System.out.println(kingdom.getCastle().getDescription());
        System.out.println(kingdom.getKing().getDescription());
    }

    /**
     * Creates kingdom.
     * @param type type of Kingdom
     */
    public void createKingdom(final Kingdom.FactoryMaker.KingdomType type) {
        final KingdomFactory factory = Kingdom.FactoryMaker.makeFactory(type);
        kingdom.setArmy(factory.createArmy());
        kingdom.setCastle(factory.createCastle());
        kingdom.setKing(factory.createKing());
    }
}
