package assign.array;

import java.util.*;
import java.util.stream.Collectors;

public class FindsDuplicates {

    public static void main(String[] args) {
        int[] arr = {12, 10, 3, 5, 8, 10, 8, 9, 5, 10};
        List<Integer> duplicates = findDuplicates3(arr);
        System.out.println(duplicates);
        System.out.println(findDuplicates4(arr));
    }

    //Time complexity : O(n^2), Space : O(1)
    private static List<Integer> findDuplicates(int[] arr) {
        //To keep unique duplicates
        HashSet<Integer> duplicates = new HashSet<>();

        //Finds duplicates and keeps in hashset
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    duplicates.add(arr[i]);
                }
            }
        }

        return duplicates.stream().toList();
    }

    //Time complexity : O(n), Space : O(n)
    private static List<Integer> findDuplicates2(int[] arr) {
        //To keep unique element
        HashSet<Integer> uniqueElem = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        //Finds duplicates and keeps in list
        for (int val:arr){
            if(!uniqueElem.add(val)){
                duplicates.add(val);
            }
        }

        return duplicates.stream().toList();
    }

    //Time complexity : O(n), Space : O(n)
    private static List<Integer> findDuplicates3(int[] arr) {
        //To keep unique element
        HashMap<Integer, Integer> duplicatesCount = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        //Finds duplicates and keeps in list
        for (int val:arr){
            duplicatesCount.put(val, duplicatesCount.getOrDefault(val, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : duplicatesCount.entrySet()){
            if (entry.getValue() > 1){
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }

    //Time complexity : O(n), Space : O(n)
    private static Map<Integer, Integer> findDuplicates4(int[] arr) {
        //To keep unique element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        //Finds duplicates and keeps in list
        for (int val:arr){
            frequencyMap.put(val, frequencyMap.getOrDefault(val, 0)+1);
        }

        return frequencyMap.entrySet().stream()
                .filter(entry->entry.getValue() > 1)
                .collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));

    }

    //Time complexity : O(n^2), Space : O(1)
    private static boolean checkDuplicate(int[] arr) {

        //Finds duplicates
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }

        return true;
    }

    //Time complexity : O(n^2), Space : O(1)
    private static boolean checkDuplicate(int[] arr, int key) {
        int count = 0;
        //Finds duplicates
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==key){
                    if(count > 1){
                        return false;
                    }
                    count++;
                }
            }
        }

        return true;
    }

    //Time complexity : O(n), Space : O(n)
    private static boolean checkDuplicate2(int[] arr) {
        //To keep unique element
        HashSet<Integer> uniqueElem = new HashSet<>();

        //Finds duplicates
        for (int val:arr){
            if(!uniqueElem.add(val)){
                return false;
            }
        }

        return true;
    }
}
