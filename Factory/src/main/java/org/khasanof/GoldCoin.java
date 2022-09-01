package org.khasanof;

public class GoldCoin implements Coin {

    static final String description = "This is Gold coin.";

    @Override
    public String getDescription() {
        return description;
    }
}
