package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllLines;

public class FileHelper {

    public static List<String> slurp(String filepath) {
        List<String> files = null;
        try {
            files = readAllLines(Paths.get(filepath));
        } catch (IOException e) {
            System.out.println("ERROR 404 - FILE NOT FOUND");
            System.exit(1);
        }
        for (int i = 0; i < files.size(); ++i) {
            String line = files.get(i);
            System.out.printf("%s: %s\n", i + 1, line);
        }
        return files;
    }

    public static void spit(String filename, List<String> contents, boolean append) {
        if (Files.notExists(Paths.get(filename))) {
            try {
                Files.createFile(Paths.get(filename));
                Files.write(Paths.get(filename), contents);
                System.out.println("File created!");
            } catch (IOException e) {
                System.out.println("File already exists!");
                System.exit(1);
            }
        } else {
            if (append) {
                try {
                    readAllLines(Paths.get(filename));
                    ArrayList<String> newContent = new ArrayList<>();
                    for (String line : contents) {
                        newContent.add(line.toLowerCase());
                    }
                    Files.write(Paths.get(filename), contents, StandardOpenOption.APPEND);
                    System.out.println("File edited!");
                } catch (IOException e) {
                    System.out.println("Unable to edit file!");
                    System.exit(1);
                }
            }
            System.out.println(filename);
            System.out.println(contents);
        }

//        try {
//            if (Files.notExists(Paths.get(filename))) {
//                Files.createFile(Paths.get(filename));
//                System.out.println("File created!");
//            }
//        } catch (IOException e) {
//            System.out.println("File already exists!");
//            System.exit(1);
//        }
//        try {
//            if (Files.exists(Paths.get(filename))) {
//                Files.write(Paths.get(filename), contents, StandardOpenOption.APPEND);
//                System.out.println("File edited!");
//            }
//        } catch (IOException e) {
//            System.out.println("Unable to edit file!");
//            System.exit(1);
//        }
    }

    public static void makeExciting(String filename) {
        List<String> excitingFiles = null;
        try {
            excitingFiles = readAllLines(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < excitingFiles.size(); ++i) {
            String line = excitingFiles.get(i);
            System.out.printf("%s: %s\n", i + 1, line.toUpperCase() + "!");
        }
    }

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("goodbye");

//        slurp("src/testfileio.txt");
        spit("src/test_fileIO.txt", data, true);

//        makeExciting("test_fileio.txt");
    }
}