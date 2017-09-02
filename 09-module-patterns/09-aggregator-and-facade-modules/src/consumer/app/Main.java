package app;

import pattern.nine.external.FacadeApi;
import module.two.external.ApiTwo;

public class Main {

    public static void main(String[] args) {
        FacadeApi facade = new FacadeApi();
        ApiTwo apiTwo = new ApiTwo();

        facade.facadeMethod("one"); // Calling the API through the facade
        apiTwo.apiMethod(); // Calling the other API directly

        
    }
}