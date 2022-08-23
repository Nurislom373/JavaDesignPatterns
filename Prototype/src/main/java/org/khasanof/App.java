package org.khasanof;

public class App {
    public static void main(String[] args) {

        CreateFactory factory = new CreateFactoryImpl(
                new ElfMeg("cleck"),
                new ElfKing("fdsfds"),
                new ElfBeast("fdyvfgdsv")
        );

        Beast beast = factory.createBeast();
        System.out.println("beast = " + beast);
        King king = factory.createKing();
        System.out.println("king = " + king);
        Meg meg = factory.createMeg();
        System.out.println("meg = " + meg);

        factory = new CreateFactoryImpl(
                new OrcMeg("fdhsy"),
                new OrcKing("fdsfs"),
                new OrcBeast("fdsfys")
        );

        beast = factory.createBeast();
        System.out.println("beast = " + beast);
        king = factory.createKing();
        System.out.println("king = " + king);
        meg = factory.createMeg();
        System.out.println("meg = " + meg);

    }
}
