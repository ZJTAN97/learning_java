package Annotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Method[] methods = Person.class.getDeclaredMethods();

        for(Method m : methods) {
            if(m.isAnnotationPresent(Author.class)) {
                Author author = m.getAnnotation(Author.class);
                System.out.println(author.name());
            }
        }

    }
}
