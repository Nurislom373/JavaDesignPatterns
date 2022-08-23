package org.khasanof;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ElfKing extends King {

    private final String helpType;

    public ElfKing(ElfKing king) {
        super(king);
        this.helpType = king.helpType;
    }

    @Override
    public King copy() {
        return new ElfKing(this);
    }

    @Override
    public String toString() {
        return "ElfKing{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
