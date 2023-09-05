package org.dmdev;

import java.util.*;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 * <p>
 * <p>
 * Implement in single class.
 */
public class StringSorter {
    /**
     * The StringSorter class defines the contract for sorting strings based on
     * alphabetical order while skipping words that start with a specific prefix.
     * <p>
     * Example:
     * Input: ["apple", "banana", "grape", "avocado", "cherry"], Exception prefix: "a"
     * Output: ["banana", "cherry", "grape", "avocado", "apple"]
     * <p>
     * Here, "banana", "cherry", and "grape" are sorted in alphabetical order
     * whereas "avocado" and "apple" (that start with 'a') are sorted in reverse alphabetical order
     * at the end of the list.
     */
    public List<String> sortStrings(List<String> unsortedStrings, String exceptionChar) {

        List<String> sortedList = new LinkedList<>();
        List<String> reverseSortedList = new LinkedList<>();

        for (String str : unsortedStrings) {
            if (str.charAt(0) != exceptionChar.charAt(0)) {
                putSorted(sortedList, str);
            } else {
                putSorted(reverseSortedList, str);
            }
        }
        int index = sortedList.size();
        for (String str : reverseSortedList) {
            sortedList.add(index, str);
        }
        return sortedList;
    }

    private void putSorted(List<String> sortedList, String str) {

        if (sortedList.size() == 0) {
            sortedList.add(str);
        }
        if (sortedList.contains(str)) {
            return;
        } else for (int i = 0; i < sortedList.size(); i++) {
            String bufferString = sortedList.get(i);
            for (int j = 0; j < bufferString.length(); j++) {
                if (str.charAt(j) < bufferString.charAt(j)) {
                    sortedList.add(i, str);
                    j = bufferString.length();
                    i = sortedList.size();
                } else if (str.charAt(j) > bufferString.charAt(j)) {
                    j = bufferString.length();
                } else if (j == str.length() - 1) {
                    sortedList.add(i, str);
                    j = bufferString.length();
                    i = sortedList.size();
                }
            }
            if (i == sortedList.size() - 1) {
                sortedList.add(str);
                i++;
            }
        }
    }
}