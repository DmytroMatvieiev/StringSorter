package org.dmdev;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        List<String> list = new LinkedList<>();
        list.add("banana");
        list.add("cherry");
        list.add("grape");
        list.add(3, "apple");
        list.add(3, "avocado");
        System.out.println( list );
    }
}
