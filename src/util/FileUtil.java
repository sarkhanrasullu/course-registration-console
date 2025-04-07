package util;
import entity.HumanWrapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {


    public static void writeObjectToFile(HumanWrapper humanWrapper) {
        File file = new File("output.obj");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("output.obj"))){
            objectOutputStream.writeObject(humanWrapper);
        } catch (Exception e) {
            System.out.println("Corrupt file");
        }
    }
    public static Object readObjectFromFile() {
        try (InputStream inputStream = new FileInputStream("output.obj");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)){

            return objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println("File could not be found");
            return new HumanWrapper();
        }
    }

    public static void writeFile(String fileName, byte[] myBytes) {
        try{
            Path path = Paths.get(fileName);
            Files.write(path, myBytes);
        } catch (IOException exc) {
            System.out.println("Could not process the file");
        }
    }

    public static byte[] readFile(String fileName) {
        try{
            Path path = Paths.get(fileName);
            return Files.readAllBytes(path);
        } catch (IOException e) {
            System.out.println("Corrupted file");
            return null;
        }
    }

}
