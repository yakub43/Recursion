public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,56,8,9};
        System.out.println(search(arr, 8, 0));
        System.out.println(search2(arr, 5,0));
    }

    public static boolean search(int[] arr, int target, int idx){
        if (idx == arr.length){
            return false;
        }
        return arr[idx] == target || search(arr, target, idx + 1);
    }

    public static int search2(int[] arr, int target, int idx){
        if (idx == arr.length){
            return -1;
        }
        if (arr[idx] == target){
            return idx;
        }
        return search2(arr, target, idx + 1);
    }
}
