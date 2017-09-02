package packt.mylib;

import java.util.List;

public class PrintList {


    public void print(List<?> list) {
        list.forEach(System.out::println);
    }


}