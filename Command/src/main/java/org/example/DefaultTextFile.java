package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class DefaultTextFile implements TextFile {

    private String name;

    @Override
    public String open() {
        return "Opening file " + name;
    }

    @Override
    public String save() {
        return "Saving file " + name;
    }

    @Override
    public String copy() {
        return "Copying file " + name;
    }

    @Override
    public String paste() {
        return "Pasting file " + name;
    }

}
