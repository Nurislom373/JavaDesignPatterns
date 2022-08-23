package org.khasanof;

public class CreateFactoryImpl implements CreateFactory {
    private final Meg meg;
    private final King king;
    private final Beast beast;

    public CreateFactoryImpl(Meg meg, King king, Beast beast) {
        this.meg = meg;
        this.king = king;
        this.beast = beast;
    }

    @Override
    public Meg createMeg() {
        return meg.copy();
    }

    @Override
    public King createKing() {
        return king.copy();
    }

    @Override
    public Beast createBeast() {
        return beast.copy();
    }
}
