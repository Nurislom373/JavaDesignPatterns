package org.example;

/**
 * @author Nurislom
 * @see org.example
 * @since 12/23/2023 4:20 PM
 */
public class SaveTextFileOperation implements FileOperation {

    private final TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }

}
