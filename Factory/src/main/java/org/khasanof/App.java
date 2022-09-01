package org.khasanof;

public class App {
    public static void main(String[] args) {

        Coin coinSilver = CoinFactory.getCoin(CoinType.SILVER);
        Coin coinGold = CoinFactory.getCoin(CoinType.GOLD);
        System.out.println("coinGold = " + coinGold.getDescription());
        System.out.println("coinSilver = " + coinSilver.getDescription());

    }
}
