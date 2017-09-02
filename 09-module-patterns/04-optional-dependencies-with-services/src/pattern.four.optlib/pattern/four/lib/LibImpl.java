package pattern.four.lib;

import pattern.four.external.LibInterface;

public class LibImpl implements LibInterface {

    public void publicApi() {
        System.out.println("Called API method in Service");
    }
}