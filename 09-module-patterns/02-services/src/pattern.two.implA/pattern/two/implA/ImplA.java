package pattern.two.implA;

import pattern.two.external.PublicInterface;


public class ImplA implements PublicInterface {

    public void publicApi() {
        System.out.println("Called implementation in PrivateImplA");
    }

   
}