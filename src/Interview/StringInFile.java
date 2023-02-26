package Interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringInFile {

    public static void main(String[] args) {

    }
    boolean findStringInFile(String filePath, String str) throws FileNotFoundException{
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // read the file line by line
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line.contains(str)){
                scanner.close();
                return true;
            }
        }
        scanner.close();
        return false;
    }
}
/*
The following example code shows how to use the Scanner class to read the file contents line by line
and then use the String contains() method to check if the string is present in the file:
 */