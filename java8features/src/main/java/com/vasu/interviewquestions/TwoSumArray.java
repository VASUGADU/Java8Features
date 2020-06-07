package com.vasu.interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSumArray {

    public static void main(String[] args) {
        int[] intArr = {2, 3, 7, 4, 8};
        int target = 7;
        int[] result = getTwoSumIndices(intArr, target);
        System.out.println(result[0] + "," + result[1]);

        //For Testing
        Map<Integer, Integer> indicesMap = new HashMap<>();
        indicesMap.put(0,2);
        indicesMap.put(1,5);
        indicesMap.put(2,3);
        indicesMap.entrySet().stream().forEach(e -> System.out.format("key: %s, value: %d%n", e.getKey(), e.getValue()));
    }

    private static int[] getTwoSumIndices(int[] intArr, int target) {
        Map<Integer, Integer> indicesMap = new HashMap<>();
        int delta;
        indicesMap.put(intArr[0], 0);
        for(int i=1; i<intArr.length-1; i++) {
            delta = target - intArr[i];
            if(indicesMap.containsKey(delta))
                return new int[] {indicesMap.get(delta) , i};
            else
                indicesMap.put(intArr[i], i);
        }
        return new int[] {-1 , -1};
    }
}
