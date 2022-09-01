package org.khasanof;

public class SilverCoin implements Coin {

    static final String description = "This is Silver coin.";

    @Override
    public String getDescription() {
        return description;
    }
}
