package org.example;

/**
 * @see org.example
 * @author Nurislom
 */
public class OpenTextFileOperation implements FileOperation {

    private final TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }

}
