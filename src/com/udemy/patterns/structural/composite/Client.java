package com.udemy.patterns.structural.composite;

public class Client {

    public static void main(String[] args) {
        Directory compositeDirectory = createFilesWithDirectory();
        compositeDirectory.ls();

        System.out.println("*****************");
        
        File binaryFile = createBinaryFile();
        binaryFile.ls();
    }
    
    private static Directory createFilesWithDirectory() {
        Directory compositeDirectory1 = new Directory("src");
        File file1 = new BinaryFile("PrimeNumber.java", 200);
        File file2 = new BinaryFile("Factorial.java", 150);
        compositeDirectory1.addFile(file1);
        compositeDirectory1.addFile(file2);

        Directory compositeDirectory2 = new Directory("resources");
        File file3 = new BinaryFile("core.js", 50);
        File file4 = new BinaryFile("bootstrap.js", 60);
        File file5 = new BinaryFile("material-ui.css", 30);
        compositeDirectory2.addFile(file3);
        compositeDirectory2.addFile(file4);
        compositeDirectory2.addFile(file5);
        
        compositeDirectory1.addFile(compositeDirectory2);
        
        return compositeDirectory1;
    }
    
    private static File createBinaryFile() {
        return new BinaryFile("RandomNumberGenerator.java", 100);
    }
}
