package pattern.one.internal;

import pattern.one.external.PublicInterface;


public class PrivateImplB implements PublicInterface {

    public void publicApi() {
        System.out.println("Called implementation in PrivateImplB");
    }

   
}