package pattern.one.external;

import pattern.one.internal.PrivateImplA;
import pattern.one.internal.PrivateImplB;

public class Factory {

    public PublicInterface getApiInstance(boolean selector) {
        if (selector) {
            return new PrivateImplA();
        }
        return new PrivateImplB();
    }

    


}