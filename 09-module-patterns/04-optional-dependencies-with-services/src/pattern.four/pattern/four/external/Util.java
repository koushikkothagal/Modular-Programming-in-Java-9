package pattern.four.external;

import pattern.four.internal.LibInterface;

public class Util {

    public void utilMethod() {
         Iterable<LibInterface> libInstances = ServiceLoader.load(LibInterface.class);
        for (LibInterface libInstance : libInstances) {
            libInstance.publicApi();
        }
       
        
    }


}