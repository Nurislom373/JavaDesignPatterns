package org.example;

/**
 * @author Nurislom
 * @see org.example
 * @since 12/23/2023 4:21 PM
 */
public class CopyTextFileOperation implements FileOperation {

    private final TextFile textFile;

    public CopyTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.copy();
    }

}
