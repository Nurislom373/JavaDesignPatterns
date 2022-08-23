package org.khasanof;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrcKing extends King {

    private final String helpType;

    public OrcKing(OrcKing king) {
        super(king);
        this.helpType = king.helpType;
    }

    @Override
    public King copy() {
        return new OrcKing(this);
    }

    @Override
    public String toString() {
        return "OrcKing{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
