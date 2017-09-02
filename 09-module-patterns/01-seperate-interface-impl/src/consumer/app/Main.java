package app;

import pattern.one.external.Factory;
import pattern.one.external.PublicInterface;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        PublicInterface obj = factory.getApiInstance(false);
        obj.publicApi();

        
    }
}