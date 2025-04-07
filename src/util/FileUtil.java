package util;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtil {

    private static final Logger LOGGER = Logger.getLogger(FileUtil.class.getName());

    public static void writeObjectToFile(Object object, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))){
            objectOutputStream.writeObject(object);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "file could not be written", e);
        }
    }

    public static Object readObjectFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            return null;
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){
            return objectInputStream.readObject();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "file could not be read", e);
            return null;
        }
    }

}
