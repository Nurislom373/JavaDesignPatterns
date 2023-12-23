package org.example;

public class Client {

    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        String saveRes = textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new DefaultTextFile("file1.text")));
        System.out.println("saveRes = " + saveRes);
        String openRes = textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new DefaultTextFile("file1.text")));
        System.out.println("openRes = " + openRes);
    }

}