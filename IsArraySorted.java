public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arrayIsSorted(arr,0));
    }

    public static boolean arrayIsSorted(int[] arr, int idx){
        if (idx == arr.length - 1){
            return true;
        }
        return arr[idx] < arr[idx + 1] && arrayIsSorted(arr, idx+1);
    }
}
