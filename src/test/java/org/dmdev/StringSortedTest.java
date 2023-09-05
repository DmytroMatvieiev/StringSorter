package org.dmdev;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StringSortedTest {

    @Test
    public void check_sortString_successExpected(){
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "grape", "avocado", "cherry"));
        List<String> exceptedList = new ArrayList<>(Arrays.asList("banana", "cherry", "grape", "avocado", "apple"));
        assertEquals(exceptedList, new StringSorter().sortStrings(strings, "a"));
    }

}
