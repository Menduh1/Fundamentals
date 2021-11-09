package io.everyonecodes.java.t5_loops.set1.exercise6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//    Part B
        List<String> fileNames = getAllPhotoFileNames();//#2
//    Part C
        for (String fileName : fileNames) {//#3
            String newName = generateNewName(fileName);//#5 return String
            renameFile(fileName, newName);//#7 output String
        }
    }
//    Part A
    public static String generateNewName(String oldName) {//#4
        int nameLength = oldName.length();
        String nameWithoutEnding = oldName.substring(0, nameLength - 4);
        return nameWithoutEnding + ".png";
    }

    //    Available Functions
    public static List<String> getAllPhotoFileNames() { // #1
        List<String> photoLists = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            photoLists.add("photo" + i + ".jpg");
        }
        return photoLists;
    }

    public static void renameFile(String oldName, String newName) {//#6
//        Dummy renaming function. Usually to rename you will need a function from the java.io.File class.
        System.out.println("File " + oldName + " has been renamed to " + newName);
    }
}

    /*    List<String> fileNames = new ArrayList<>(getAllPhotoFileNames());
        List<String> filesNamesNew = generateNewName(fileNames);

        generateNewName(fileNames);
        System.out.println(fileNames);
        System.out.println(filesNamesNew);
    }

    public static List<String> generateNewName(List<String> fileNames) {
        //  System.out.println(fileNames);
        List<String> filesNamesNew = new ArrayList<>();
        for (int i = 0; i < fileNames.size(); i++) {
            String sectionJpg = fileNames.get(i);
            int length = sectionJpg.length();
            String sectionJpgLast = sectionJpg.substring(0, length - 3) + "png";
            filesNamesNew.add(sectionJpgLast);
            //System.out.println(filesNamesNew);
        }

        return filesNamesNew;
    }

    public static List<String> getAllPhotoFileNames() {
        List<String> photoList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            photoList.add("photo" + i + ".jpg");
        }
        return photoList;
    }

    public static void renameFile(String oldName, String newName) {
//Dummy renaming function which just prints the names. Usually to rename you will need a function from the java.io.File class.
        System.out.println("File " + oldName + " has been renamed to " + newName);
    }*/



