package org.khasanof.vrtx;

import java.util.Objects;

public class VrtxProxy implements Vrtx {

    private VrtxObject vrtx;

    @Override
    public void create() {
        if (Objects.isNull(vrtx)) {
            vrtx = new VrtxObject();
        }
        vrtx.create();
    }
}
