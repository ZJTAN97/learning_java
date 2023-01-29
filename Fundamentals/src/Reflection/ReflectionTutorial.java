package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTutorial {

    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Stella", 6);

        Field[] catFields = myCat.getClass().getDeclaredFields();

        for (Field field : catFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Docker");
            }

        }

        System.out.println(myCat.getName());

        Method[] methods = myCat.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if(method.getName().equals("meow")) {
                method.setAccessible(true);
                method.invoke(myCat);
            }

            if(method.getName().equals("staticMeow")) {
                method.setAccessible(true);
                method.invoke(null);
            }

        }

    }

}
