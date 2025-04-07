package service.proxy;

import annotations.Saveable;
import service.Database;

import java.lang.reflect.Method;

public class ProxyUtil {

    public static void save(String name, Class clazz){
        try {
            Method method = clazz.getMethod(name);
            if (method.isAnnotationPresent(Saveable.class)) {
                Database.save();
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

}
