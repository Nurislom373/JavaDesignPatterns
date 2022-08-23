package org.khasanof;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Meg implements Prototype {

    public Meg(Meg meg) {

    }

    @Override
    public abstract Meg copy();
}
