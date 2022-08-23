package org.khasanof;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class King implements Prototype {

    public King(King king) {
    }

    @Override
    public abstract King copy();
}
