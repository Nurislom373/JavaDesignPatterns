package org.khasanof;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Beast implements Prototype {

    public Beast(Beast source) {

    }

    @Override
    public abstract Beast copy();

}
