package app;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("pattern.six.internal.Contact");
            Constructor<?> ctor = clazz.getConstructor();
            Object object = ctor.newInstance(new Object[] {  });
            System.out.println("Successfully created object using reflection");
        } catch (ReflectiveOperationException e) {
            System.out.println("Did not find the Impl class module");
        }
        
    }
}