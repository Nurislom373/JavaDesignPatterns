package org.example;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Nurislom
 * @see org.example
 * @since 12/23/2023 4:24 PM
 */
public class TextFileOperationExecutor {

    private final List<FileOperation> fileOperations;

    public TextFileOperationExecutor() {
        fileOperations = new LinkedList<>();
    }

    public String executeOperation(FileOperation operation) {
        fileOperations.add(operation);
        return operation.execute();
    }

}
