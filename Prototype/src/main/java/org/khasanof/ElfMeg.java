package org.khasanof;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ElfMeg extends Meg {

    private final String helpType;

    public ElfMeg(ElfMeg meg) {
        super(meg);
        this.helpType = meg.helpType;
    }

    @Override
    public Meg copy() {
        return new ElfMeg(this);
    }

    @Override
    public String toString() {
        return "ElfMeg{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
