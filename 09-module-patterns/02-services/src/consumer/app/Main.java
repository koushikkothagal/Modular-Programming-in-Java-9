package app;

import pattern.two.external.PublicInterface;

import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;


public class Main {

    public static void main(String[] args) {
        Iterable<PublicInterface> impls = ServiceLoader.load(PublicInterface.class);
        for (PublicInterface i : impls) {
            i.publicApi();
        }
        

        
    }
}