package org.khasanof;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrcBeast extends Beast {

    private final String helpType;

    public OrcBeast(OrcBeast orcBeast) {
        super(orcBeast);
        this.helpType = orcBeast.helpType;
    }

    @Override
    public Beast copy() {
        return new OrcBeast(this);
    }

    @Override
    public String toString() {
        return "OrcBeast{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
