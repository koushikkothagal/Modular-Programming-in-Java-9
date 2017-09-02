package packt.util.test;

import java.util.List;


import java.util.ArrayList;
import java.util.Arrays;

import packt.util.SortUtil;

public class SortUtilTestMain {
    public static void main(String[] args) {
        SortUtil sortUtil = new SortUtil();
        List out = sortUtil.sortList(Arrays.asList("b", "a", "c"));
        assert out.size() == 3;
        assert "a".equals(out.get(0));
        assert "b".equals(out.get(1));
        assert "c".equals(out.get(2));
    }
}