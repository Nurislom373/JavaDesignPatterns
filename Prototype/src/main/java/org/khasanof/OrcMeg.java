package org.khasanof;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrcMeg extends Meg {

    private final String helpType;

    public OrcMeg(OrcMeg meg) {
        super(meg);
        this.helpType = meg.helpType;
    }

    @Override
    public Meg copy() {
        return new OrcMeg(this);
    }

    @Override
    public String toString() {
        return "OrcMeg{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
