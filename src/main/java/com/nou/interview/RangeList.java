package com.nou.interview;

// Task: Implement a class named 'RangeList'
// A pair of integers define a range, for example: [1, 5). This range includes
// integers: 1, 2, 3, and 4.
// A range list is an aggregate of these ranges: [1, 5), [10, 11), [100, 201)

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * NOTE: Feel free to add any extra member variables/functions you like.
 */
public class RangeList {

    /**
     * key : range begin
     * value : range end
     */
    TreeMap<Integer, Integer> intervals = new TreeMap<>();

    /**
     *
     * Adds a range to the list
     * @param {Array<number>} range - Array of two integers that specify beginning and
    end of range.
     */
    public void add(int left,int right) {

        Integer start = intervals.floorKey(left);
        Integer end = intervals.floorKey(right);
        if(start != null && intervals.get(start) >= left){
            left = start;
        }
        if(end != null && intervals.get(end) > right){
            right = intervals.get(end);
        }
        intervals.put(left, right);

        // remove overlap interval
        intervals.subMap(left, false, right, true).clear();

    }




    /**
     *
     * Removes a range from the list
     * @param {Array<number>} range - Array of two integers that specify beginning and
    end of range.

     */
    public void remove(int left,int right) {

        // check corner case
        if (right <= left) return;
        Integer start = intervals.floorKey(left);
        Integer end = intervals.floorKey(right);

        if(end != null && intervals.get(end) > right){
            intervals.put(right, intervals.get(end));
        }
        if(start != null && intervals.get(start) > left){
            intervals.put(start, left);
        }
        intervals.subMap(left, true, right, false).clear();

    }

    /**
     *
     * Convert the list of ranges in the range list to a string
     * @returns A string representation of the range list
     */
    public String toString() {

        StringBuilder sb = new StringBuilder();
        if(intervals.isEmpty()){
            return sb.toString();
        }
        for(Map.Entry<Integer,Integer> entry:intervals.entrySet()){

            sb.append("[");
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(entry.getValue());
            sb.append(")");
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
        return sb.toString().trim();

    }

    // test
    public static void main(String[] args) {

        Map map = new HashMap();

        // Example run
        RangeList rl = new RangeList();
        rl.toString(); // Should be ""
        rl.add(1, 5);
        rl.toString(); // Should be: "[1, 5)"
        rl.add(10, 20);
        rl.toString(); // Should be: "[1, 5) [10, 20)"
        rl.add(20, 20);
        rl.toString(); // Should be: "[1, 5) [10, 20)"
        rl.add(20, 21);
        rl.toString(); // Should be: "[1, 5) [10, 21)"
        rl.add(2, 4);
        rl.toString(); // Should be: "[1, 5) [10, 21)"
        rl.add(3, 8);
        rl.toString(); // Should be: "[1, 8) [10, 21)"
        rl.remove(10, 10);
        rl.toString(); // Should be: "[1, 8) [10, 21)"
        rl.remove(10, 11);
        rl.toString(); // Should be: "[1, 8) [11, 21)"
        rl.remove(15, 17);
        rl.toString(); // Should be: "[1, 8) [11, 15) [17, 21)"
        rl.remove(3, 19);
        rl.toString(); // Should be: "[1, 3) [19, 21)"



    }
}
