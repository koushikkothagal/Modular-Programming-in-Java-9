package pattern.three.external;

import pattern.three.lib.LibImpl;

public class Util {

    public void utilMethod() {

        try {
            Class<?> clazz = Class.forName("pattern.three.lib.LibImpl");
            LibImpl impl =
                (LibImpl) clazz.getConstructor().newInstance();
                impl.publicApi();
            
        } catch (ReflectiveOperationException e) {
            System.out.println("Did not find the Impl class module");
        }
    }


}