package pattern.two.implB;

import pattern.two.external.PublicInterface;


public class ImplB implements PublicInterface {

    public void publicApi() {
        System.out.println("Called implementation in PrivateImplB");
    }

   
}