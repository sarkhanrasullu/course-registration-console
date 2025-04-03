package service;
import entity.Human2;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Try {
    public static void main(String[] args) {
        Human2 human = new Human2();
        human.setName("Saadat");
        human.setSurname("Mammadova");

        writeFromObject(human);
        System.out.println(readFromObject());

        String text = "hello";
        byte[] b = text.getBytes(StandardCharsets.UTF_8);

        String fileName = "sample.txt";
        writeFile(fileName, b);
        readFile(fileName);

        byte[] png = readFile("test.png");
        writeFile("copyTest.png", png);

    }

    public static void writeFromObject(Human2 human) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("output.obj"))){
            objectOutputStream.writeObject(human);
        } catch (Exception e) {
            System.out.println("Corrupt file");
        }
    }
    public static Object readFromObject() {
        try (InputStream inputStream = new FileInputStream("output.obj");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)){

            return objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println("File could not be found");
            return null;
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
