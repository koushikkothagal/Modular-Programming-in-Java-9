package packt.util;

import java.util.List;

import packt.util.impl.BubbleSortUtilImpl;


import java.util.ArrayList;
import java.util.Arrays;

public class SortUtil {

    private BubbleSortUtilImpl sortImpl = new BubbleSortUtilImpl();

    public <T extends Comparable> List<T> sortList(List<T> list) {
        return this.sortImpl.sortList(list);
    }




}