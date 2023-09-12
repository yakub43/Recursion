import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllIndx {
    public static void main(String[] args) {
        int[] arr = {1,4,5,9,8,3,4,5};
        ArrayList<Integer> ans = new ArrayList<>();
        search(arr, 4, 0, ans);
        System.out.println(ans);
    }
    public static List<Integer> search(int[] arr, int target, int idx, ArrayList<Integer> ans){

        if (idx == arr.length){
            return ans;
        }
        if (arr[idx] == target){
            ans.add(idx);
        }
        return search(arr, target, idx+1, ans);
    }
}
