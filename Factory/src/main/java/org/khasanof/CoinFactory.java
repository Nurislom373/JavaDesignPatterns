package org.khasanof;

public abstract class CoinFactory {

    public static Coin getCoin(CoinType type) {
        return type.getConstructor().get();
    }

}
