import java.util.ArrayList;
import java.util.List;

public class ArraySubSets {
    public static void main(String[] args) {

        int[] arr = {4, 8, 12};
        System.out.println(findSubsets(arr));

    }

    public static List<List<Integer>> findSubsets(int[] arr){

        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(arr, new ArrayList<>(), 0, result);
        return result;

    }

    private static void generateSubsets(int[] arr, List<Integer> current, int index, List<List<Integer>> result){

        if(index == arr.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[index]);
        generateSubsets(arr, current, index+1, result);

        current.remove(current.size() - 1);
        generateSubsets(arr, current, index+1, result);
    }


}
