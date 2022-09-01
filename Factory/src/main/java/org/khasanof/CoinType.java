package org.khasanof;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum CoinType {

    SILVER(SilverCoin::new),
    GOLD(GoldCoin::new);

    private final Supplier<Coin> constructor;
}
