package org.khasanof;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ElfBeast extends Beast{

    private final String helpType;

    public ElfBeast(ElfBeast elfBeast) {
        super(elfBeast);
        this.helpType = elfBeast.helpType;
    }

    @Override
    public Beast copy() {
        return new ElfBeast(this);
    }

    @Override
    public String toString() {
        return "ElfBeast{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
